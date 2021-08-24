package com.arnoldvaz27.countriesofworld.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class MoreMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(getResources().getColor(R.color.holo_red));
        setContentView(R.layout.more_menu);

        findViewById(R.id.back).setOnClickListener(v -> finish());

        findViewById(R.id.privacy).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Privacy%20Policy%20For%20Countries%20Of%20World.html"))));
        findViewById(R.id.terms).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Terms%20and%20Condition%20For%20Countries%20Of%20World.html"))));
        findViewById(R.id.developer).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/arnoldvaz27/CountriesOfWorld"))));
        findViewById(R.id.website).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://linktr.ee/arnoldvaz"))));
        findViewById(R.id.youtube).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Vm84IZ78boA"))));
        findViewById(R.id.appStore).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Programming%20Drive%20App%20Store.html"))));
        findViewById(R.id.asia).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));
        findViewById(R.id.europe).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));
        findViewById(R.id.oceanic).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));
        findViewById(R.id.africa).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));
        findViewById(R.id.america).setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://programmingdrive.blogspot.com/2021/08/Countries%20Applications.html"))));

    }
}