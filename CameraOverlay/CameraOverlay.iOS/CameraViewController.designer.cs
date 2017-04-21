// WARNING
//
// This file has been generated automatically by Xamarin Studio from the outlets and
// actions declared in your storyboard file.
// Manual changes to this file will not be maintained.
//
using Foundation;
using System;
using System.CodeDom.Compiler;

namespace CameraOverlay.iOS
{
    [Register ("CameraViewController")]
    partial class CameraViewController
    {
        [Outlet]
        [GeneratedCode ("iOS Designer", "1.0")]
        UIKit.UIButton btnCapture { get; set; }

        [Outlet]
        [GeneratedCode ("iOS Designer", "1.0")]
        UIKit.UIView overLayView { get; set; }

        void ReleaseDesignerOutlets ()
        {
            if (btnCapture != null) {
                btnCapture.Dispose ();
                btnCapture = null;
            }

            if (overLayView != null) {
                overLayView.Dispose ();
                overLayView = null;
            }
        }
    }
}