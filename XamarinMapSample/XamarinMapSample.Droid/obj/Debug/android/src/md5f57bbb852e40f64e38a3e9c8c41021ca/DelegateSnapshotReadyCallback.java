package md5f57bbb852e40f64e38a3e9c8c41021ca;


public class DelegateSnapshotReadyCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSnapshotReady:(Landroid/graphics/Bitmap;)V:GetOnSnapshotReady_Landroid_graphics_Bitmap_Handler:Android.Gms.Maps.GoogleMap/ISnapshotReadyCallbackInvoker, Xamarin.GooglePlayServices.Maps\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.GoogleMaps.Android.Logics.DelegateSnapshotReadyCallback, Xamarin.Forms.GoogleMaps.Android, Version=1.8.0.8, Culture=neutral, PublicKeyToken=null", DelegateSnapshotReadyCallback.class, __md_methods);
	}


	public DelegateSnapshotReadyCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DelegateSnapshotReadyCallback.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.GoogleMaps.Android.Logics.DelegateSnapshotReadyCallback, Xamarin.Forms.GoogleMaps.Android, Version=1.8.0.8, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onSnapshotReady (android.graphics.Bitmap p0)
	{
		n_onSnapshotReady (p0);
	}

	private native void n_onSnapshotReady (android.graphics.Bitmap p0);

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
