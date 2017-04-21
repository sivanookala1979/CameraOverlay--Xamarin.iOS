//
// This file has been generated automatically by MonoDevelop to store outlets and
// actions made in the Xcode designer. If it is removed, they will be lost.
// Manual changes to this file may not be handled correctly.
//
using Foundation;
using System.CodeDom.Compiler;
using UIKit;

namespace CameraOverlay.iOS
{
	[Register ("ViewController")]
	partial class ViewController
	{
		[Outlet]
		[GeneratedCode ("iOS Designer", "1.0")]
		UIButton Button { get; set; }

        UIView overLayView { get; set; }
        UIButton btnCapture { get; set; }
        
		void ReleaseDesignerOutlets ()
		{
			if (Button != null) {
				Button.Dispose ();
				Button = null;
			}
            if (overLayView != null)
            {
                overLayView.Dispose();
                overLayView = null;

            }

            if (btnCapture != null)
            {
                btnCapture.Dispose();
                btnCapture = null;
            }
        }
	}
}
