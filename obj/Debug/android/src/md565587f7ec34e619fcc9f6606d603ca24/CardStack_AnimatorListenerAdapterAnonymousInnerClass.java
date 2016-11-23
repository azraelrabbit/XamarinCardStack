package md565587f7ec34e619fcc9f6606d603ca24;


public class CardStack_AnimatorListenerAdapterAnonymousInnerClass
	extends android.animation.AnimatorListenerAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnimationEnd:(Landroid/animation/Animator;)V:GetOnAnimationEnd_Landroid_animation_Animator_Handler\n" +
			"";
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+AnimatorListenerAdapterAnonymousInnerClass, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", CardStack_AnimatorListenerAdapterAnonymousInnerClass.class, __md_methods);
	}


	public CardStack_AnimatorListenerAdapterAnonymousInnerClass () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardStack_AnimatorListenerAdapterAnonymousInnerClass.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+AnimatorListenerAdapterAnonymousInnerClass, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public CardStack_AnimatorListenerAdapterAnonymousInnerClass (md565587f7ec34e619fcc9f6606d603ca24.CardStack p0, int p1, android.view.View p2) throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardStack_AnimatorListenerAdapterAnonymousInnerClass.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+AnimatorListenerAdapterAnonymousInnerClass, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:Android.Views.View, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void onAnimationEnd (android.animation.Animator p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.animation.Animator p0);

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
