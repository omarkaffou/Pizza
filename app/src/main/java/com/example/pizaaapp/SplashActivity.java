package com.example.pizaaapp;

import android.content.Intent;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizaaapp.R;

import java.util.concurrent.ThreadLocalRandom;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.logo);
        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        logo.startAnimation(aniRotate);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent  = new Intent(SplashActivity.this, ProduitListActivity.class);

                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }
}
