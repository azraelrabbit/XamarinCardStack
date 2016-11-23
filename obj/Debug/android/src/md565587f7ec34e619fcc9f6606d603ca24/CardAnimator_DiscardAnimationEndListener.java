package md565587f7ec34e619fcc9f6606d603ca24;


public class CardAnimator_DiscardAnimationEndListener
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
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardAnimator+DiscardAnimationEndListener, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", CardAnimator_DiscardAnimationEndListener.class, __md_methods);
	}


	public CardAnimator_DiscardAnimationEndListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardAnimator_DiscardAnimationEndListener.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardAnimator+DiscardAnimationEndListener, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
