package com.arnoldvaz27.countriesofworld.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

//splashscreen of the application
public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.black));
        getWindow().setNavigationBarColor(getResources().getColor(R.color.black));
        setContentView(R.layout.splash_screen);

        findViewById(R.id.asia).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));
        findViewById(R.id.appStore).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Programming%20Drive%20App%20Store.html"))));


        // this new handler will move from splash screen to the main activity of the app after 2 sec or 2000 ms.
        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this,
                    MainActivity.class);
            SplashScreen.this.startActivity(i);
            SplashScreen.this.finish();
        }, SPLASH_SCREEN_TIME_OUT);
    }
}