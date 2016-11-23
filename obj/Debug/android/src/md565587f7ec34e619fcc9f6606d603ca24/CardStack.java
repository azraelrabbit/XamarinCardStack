package md565587f7ec34e619fcc9f6606d603ca24;


public class CardStack
	extends android.widget.RelativeLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", CardStack.class, __md_methods);
	}


	public CardStack (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == CardStack.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public CardStack (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == CardStack.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public CardStack (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == CardStack.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public CardStack (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == CardStack.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

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
