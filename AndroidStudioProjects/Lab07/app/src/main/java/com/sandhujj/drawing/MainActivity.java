package com.sandhujj.drawing;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v = findViewById(R.id.drawView);
        ObjectAnimator animation = ObjectAnimator.ofFloat(v, "translationX", 300f);
        ObjectAnimator animation2 = ObjectAnimator.ofFloat(v, "translationY", 300f);
        animation.setDuration(5000);
        animation2.setDuration(5000);
        animation.start();
        animation2.start();

    }
}