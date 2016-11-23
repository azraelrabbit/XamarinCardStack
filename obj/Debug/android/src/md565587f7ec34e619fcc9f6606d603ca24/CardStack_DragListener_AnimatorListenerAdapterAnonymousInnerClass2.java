package md565587f7ec34e619fcc9f6606d603ca24;


public class CardStack_DragListener_AnimatorListenerAdapterAnonymousInnerClass2
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
		mono.android.Runtime.register ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+DragListener+AnimatorListenerAdapterAnonymousInnerClass2, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", CardStack_DragListener_AnimatorListenerAdapterAnonymousInnerClass2.class, __md_methods);
	}


	public CardStack_DragListener_AnimatorListenerAdapterAnonymousInnerClass2 () throws java.lang.Throwable
	{
		super ();
		if (getClass () == CardStack_DragListener_AnimatorListenerAdapterAnonymousInnerClass2.class)
			mono.android.TypeManager.Activate ("Gemslibe.Xamarin.Droid.UI.SwipeCards.CardStack+DragListener+AnimatorListenerAdapterAnonymousInnerClass2, XamarinAndroidSwipeableCardStack, Version=1.0.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
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
