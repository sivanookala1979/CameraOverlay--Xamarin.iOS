package md5634072bbe17fd9e07363782b60111ef4;


public class SavePhoto
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.media.ImageReader.OnImageAvailableListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImageAvailable:(Landroid/media/ImageReader;)V:GetOnImageAvailable_Landroid_media_ImageReader_Handler:Android.Media.ImageReader/IOnImageAvailableListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("CameraOverlay.Droid.SavePhoto, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SavePhoto.class, __md_methods);
	}


	public SavePhoto () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SavePhoto.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.SavePhoto, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public SavePhoto (md5634072bbe17fd9e07363782b60111ef4.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == SavePhoto.class)
			mono.android.TypeManager.Activate ("CameraOverlay.Droid.SavePhoto, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "CameraOverlay.Droid.MainActivity, CameraOverlay.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onImageAvailable (android.media.ImageReader p0)
	{
		n_onImageAvailable (p0);
	}

	private native void n_onImageAvailable (android.media.ImageReader p0);

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
