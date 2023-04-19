package com.example.animatedbackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ConstraintLayout layout=findViewById(R.id.mainLayout);
        AnimationDrawable anim=(AnimationDrawable) layout.getBackground();
        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);
        anim.start();
    }
}