package md5634072bbe17fd9e07363782b60111ef4;


public class CaptureCallback
	extends android.hardware.camera2.CameraCaptureSession.StateCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConfigured:(Landroid/hardware/camera2/CameraCaptureSession;)V:GetOnConfigured_Landroid_hardware_camera2_CameraCaptureSession_Handler\n" +
			"n_onConfigureFailed:(Landroid/hardware/camera2/CameraCaptureSession;)V:GetOnConfigureFailed_Landroid_hardware_camera2_CameraCaptureSession_Handler\n" +
			"";
		mono.android.Runtime.register ("CameraOverlay.Droid.CaptureCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CaptureCallback.class, __md_methods);
	}


	public CaptureCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CaptureCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.CaptureCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CaptureCallback (md5634072bbe17fd9e07363782b60111ef4.MainActivity p0, boolean p1) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CaptureCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.CaptureCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "CameraOverlay.Droid.MainActivity, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1 });
	}


	public void onConfigured (android.hardware.camera2.CameraCaptureSession p0)
	{
		n_onConfigured (p0);
	}

	private native void n_onConfigured (android.hardware.camera2.CameraCaptureSession p0);


	public void onConfigureFailed (android.hardware.camera2.CameraCaptureSession p0)
	{
		n_onConfigureFailed (p0);
	}

	private native void n_onConfigureFailed (android.hardware.camera2.CameraCaptureSession p0);

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
