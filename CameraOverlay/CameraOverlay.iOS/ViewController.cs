using System;

using UIKit;
using Foundation;
using AVFoundation;

namespace CameraOverlay.iOS
{
	public partial class ViewController : UIViewController
	{
        AVCaptureSession captureSession = new AVCaptureSession();
        AVCaptureStillImageOutput stillImageOutput = new AVCaptureStillImageOutput();
        AVCaptureVideoPreviewLayer previewLayer;

        AVCaptureDevice catpureDevice;

        public ViewController (IntPtr handle) : base (handle)
		{
		}

		public override void ViewDidLoad ()
		{
			base.ViewDidLoad ();
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

		public override void DidReceiveMemoryWarning ()
		{
			base.DidReceiveMemoryWarning ();
			// Release any cached data, images, etc that aren't in use.
		}
        private void BeginSession()
        {

            try
            {
                var cameraInput = AVCaptureDeviceInput.FromDevice(catpureDevice);

                captureSession.AddInput(cameraInput);


               
              
                //todo

                if (captureSession.CanAddOutput(stillImageOutput))
                {
                    captureSession.AddOutput(stillImageOutput);

                }

            }


            catch (Exception ex)
            {

            }

            var previewLayer = new AVCaptureVideoPreviewLayer(captureSession);

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
    }
}

