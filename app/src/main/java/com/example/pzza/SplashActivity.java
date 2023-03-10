package com.example.pzza;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.pizaaapp.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.logo);

        //Appliquer une animation de rotation sur le logo
        //res->anim->anim.xml

        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        logo.startAnimation(aniRotate);


        Thread t = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent  = new Intent(SplashActivity.this, PizzaListActivity.class);
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
