package md565587f7ec34e619fcc9f6606d603ca24;


public class CardStack_DataSetObserver
	extends android.database.DataSetObserver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onChanged:()V:GetOnChangedHandler\n" +
			"";
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+DataSetObserver, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", CardStack_DataSetObserver.class, __md_methods);
	}


	public CardStack_DataSetObserver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardStack_DataSetObserver.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+DataSetObserver, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CardStack_DataSetObserver (md565587f7ec34e619fcc9f6606d603ca24.CardStack p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardStack_DataSetObserver.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+DataSetObserver, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onChanged ()
	{
		n_onChanged ();
	}

	private native void n_onChanged ();

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
