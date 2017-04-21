using System;
using UIKit;
using AVFoundation;
using Foundation;
using CoreImage;
using CoreGraphics;
using CoreMedia;

namespace CameraOverlay.iOS
{
    public partial class CameraViewController : UIViewController
    {
        #region
        AVCaptureSession captureSession;
        AVCaptureStillImageOutput stillImageOutput;
        AVCaptureVideoPreviewLayer previewLayer;
        AVCaptureDevice catpureDevice;
        #endregion

        /// <summary>
        /// mandatory constructors, do not remove
        /// </summary>
        /// <param name="handle"></param>
        public CameraViewController(IntPtr handle) : base (handle)
		{
        }
        /// <summary>
        /// mandatory constructors, do not remove
        /// </summary>
        public CameraViewController() : base("CameraViewController", null)
        {
        }

       
        /// <summary>
        /// method to save images to gallery 
        /// </summary>
        private void SaveToGallery()
        {
            AVCaptureConnection videoConnection = stillImageOutput.ConnectionFromMediaType(AVMediaType.Video);
            if (videoConnection != null)
            {
                
                stillImageOutput.CaptureStillImageAsynchronously(videoConnection, (CMSampleBuffer imageDataSampleBuffer, NSError error)  =>
                {
                    NSData imageData = AVCaptureStillImageOutput.JpegStillToNSData(imageDataSampleBuffer);
                    if (imageData != null)
                    {
                        var image = CIImage.FromData(imageData);
                        CIContext context = CIContext.Create();
                        CGImage cgImage = context.CreateCGImage(image, image.Extent);
                        UIImageView StillImageView = new UIImageView();
                        
                        StillImageView.Image = UIImage.FromImage(cgImage, 1f, UIImageOrientation.Right);
                        StillImageView.Image.SaveToPhotosAlbum((img, err2) => {
                            if (err2 != null)
                            {
                                Console.WriteLine("error saving image: {0}", err2);
                            }
                            else
                            {
                                Console.WriteLine("image saved to photo album");
                            }
                        });
                    }

                });
            }
           

        }

        /// <summary>
        /// Event for Camera button click and save photos to Gallery
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void BtnCapture_TouchUpInside(object sender, EventArgs e)
        {
            SaveToGallery();
        }
      
        /// <summary>
        /// Check for storage and issue memory warning - To do functionality :  based on requirements.
        /// </summary>
        public override void DidReceiveMemoryWarning()
        {
            // Release any cached data, images, etc that aren't in use.
            base.DidReceiveMemoryWarning();
        }

        /// <summary>
        /// Attaching events in runtime and updating border widths
        /// </summary>
        /// <param name="animated"></param>
        public override void ViewDidAppear(bool animated)
        {
            base.ViewDidAppear(animated);
            btnCapture.TouchUpInside += BtnCapture_TouchUpInside;
            overLayView.Layer.BorderWidth = 2;
            overLayView.Layer.BorderColor = UIColor.Gray.CGColor;
        }
        /// <summary>
        /// place to check for device availability 
        /// </summary>
        public override void ViewDidLoad()
        {
            base.ViewDidLoad();
            captureSession = new AVCaptureSession();
            // Perform any additional setup after loading the view, typically from a nib.
            captureSession.SessionPreset = AVCaptureSession.PresetHigh;
            var devices = AVCaptureDevice.Devices;
            foreach (AVCaptureDevice device in devices)
            {
                if (device.HasMediaType(AVMediaTypes.Video))
                {
                    if (device.Position == AVCaptureDevicePosition.Back)
                    {
                        catpureDevice = device;
                        if (catpureDevice != null)
                        {
                            BeginSession();
                        }

                    }
                }
            }
        }
        /// <summary>
        ///  Create capture session and Add overlay layer to UIView
        /// </summary>
        private void BeginSession()
        {
            try
            {
                previewLayer = new AVCaptureVideoPreviewLayer(captureSession);
                var cameraInput = AVCaptureDeviceInput.FromDevice(catpureDevice);
                captureSession.AddInput(cameraInput);
                stillImageOutput = new AVCaptureStillImageOutput();
                var dict = new NSMutableDictionary();
                dict[AVVideo.CodecKey] = new NSNumber((int)AVVideoCodec.JPEG);
                captureSession.AddOutput(stillImageOutput);

                if (captureSession.CanAddOutput(stillImageOutput))
                {
                    captureSession.AddOutput(stillImageOutput);

                }
                if (previewLayer == null)
                {
                    return;
                }
                this.View.Layer.AddSublayer(previewLayer);
                previewLayer.Frame = this.View.Layer.Frame;
                captureSession.StartRunning();
                this.View.AddSubview(overLayView);
                this.View.AddSubview(btnCapture);
            }

            catch (Exception ex)
            {
                System.Diagnostics.Debug.Write("Method Name: BeginSession" + ex.Message);
            }
            
        }
    }
}