package md5634072bbe17fd9e07363782b60111ef4;


public class CaptureSessionCallback
	extends android.hardware.camera2.CameraCaptureSession.CaptureCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCaptureCompleted:(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V:GetOnCaptureCompleted_Landroid_hardware_camera2_CameraCaptureSession_Landroid_hardware_camera2_CaptureRequest_Landroid_hardware_camera2_TotalCaptureResult_Handler\n" +
			"";
		mono.android.Runtime.register ("CameraOverlay.Droid.CaptureSessionCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CaptureSessionCallback.class, __md_methods);
	}


	public CaptureSessionCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CaptureSessionCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.CaptureSessionCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CaptureSessionCallback (md5634072bbe17fd9e07363782b60111ef4.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CaptureSessionCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.CaptureSessionCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "CameraOverlay.Droid.MainActivity, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onCaptureCompleted (android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2)
	{
		n_onCaptureCompleted (p0, p1, p2);
	}

	private native void n_onCaptureCompleted (android.hardware.camera2.CameraCaptureSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
