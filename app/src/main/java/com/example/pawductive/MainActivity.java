package com.example.pawductive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.loading);
        logo = findViewById(R.id.imageView);
        logo.startAnimation(animation);
    }
}