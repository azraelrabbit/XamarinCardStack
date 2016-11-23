using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;
using Gemslibe.Xamarin.Droid.UI.SwipeCards;
using System;

namespace XamarinCardStack
{
    [Activity(Label = "XamarinCardStack", MainLauncher = true, Icon = "@drawable/icon",Theme ="@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity
    {
        private CardStack card_stack;
        private CardAdapter card_adapter;
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView (Resource.Layout.Main);

            InitImages();

            card_stack = FindViewById<CardStack>(Resource.Id.card_stack);
            card_stack.ContentResource = Resource.Layout.Card_Layout;
            card_stack.StackMargin = 20;
            card_stack.Adapter = card_adapter;
        }

        private void InitImages()
        {
            card_adapter = new CardAdapter(ApplicationContext, 0);
            card_adapter.Add(Resource.Drawable.avangers);
            card_adapter.Add(Resource.Drawable.batman);
            card_adapter.Add(Resource.Drawable.flash);
            card_adapter.Add(Resource.Drawable.wolverine);
        }
    }
}

