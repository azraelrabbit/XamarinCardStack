package md5078d22dd9fc4476807b7070c789f8d88;


public class RelativeLayoutParamsEvaluator
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.animation.TypeEvaluator
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_evaluate:(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;:GetEvaluate_FLjava_lang_Object_Ljava_lang_Object_Handler:Android.Animation.ITypeEvaluatorInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.Animation.RelativeLayoutParamsEvaluator, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", RelativeLayoutParamsEvaluator.class, __md_methods);
	}


	public RelativeLayoutParamsEvaluator () throws java.lang.Throwable
	{
		super ();
		if (getClass () == RelativeLayoutParamsEvaluator.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.Animation.RelativeLayoutParamsEvaluator, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object evaluate (float p0, java.lang.Object p1, java.lang.Object p2)
	{
		return n_evaluate (p0, p1, p2);
	}

	private native java.lang.Object n_evaluate (float p0, java.lang.Object p1, java.lang.Object p2);

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
