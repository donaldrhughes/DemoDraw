package com.e.demodraw;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock1), 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock2), 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock3), 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock4), 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock5), 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.rock6), 50);
        animationDrawable.setOneShot(false);
        imageView.setImageDrawable(animationDrawable);
        animationDrawable.start();

    }
}
