package md5634072bbe17fd9e07363782b60111ef4;


public class StateCallback
	extends android.hardware.camera2.CameraDevice.StateCallback
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDisconnected:(Landroid/hardware/camera2/CameraDevice;)V:GetOnDisconnected_Landroid_hardware_camera2_CameraDevice_Handler\n" +
			"n_onError:(Landroid/hardware/camera2/CameraDevice;I)V:GetOnError_Landroid_hardware_camera2_CameraDevice_IHandler\n" +
			"n_onOpened:(Landroid/hardware/camera2/CameraDevice;)V:GetOnOpened_Landroid_hardware_camera2_CameraDevice_Handler\n" +
			"";
		mono.android.Runtime.register ("CameraOverlay.Droid.StateCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", StateCallback.class, __md_methods);
	}


	public StateCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == StateCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.StateCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public StateCallback (md5634072bbe17fd9e07363782b60111ef4.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == StateCallback.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.StateCallback, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "CameraOverlay.Droid.MainActivity, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onDisconnected (android.hardware.camera2.CameraDevice p0)
	{
		n_onDisconnected (p0);
	}

	private native void n_onDisconnected (android.hardware.camera2.CameraDevice p0);


	public void onError (android.hardware.camera2.CameraDevice p0, int p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (android.hardware.camera2.CameraDevice p0, int p1);


	public void onOpened (android.hardware.camera2.CameraDevice p0)
	{
		n_onOpened (p0);
	}

	private native void n_onOpened (android.hardware.camera2.CameraDevice p0);

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
