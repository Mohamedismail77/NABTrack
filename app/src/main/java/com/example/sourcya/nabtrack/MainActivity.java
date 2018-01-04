package com.example.sourcya.nabtrack;


import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().add(R.id.container,new SplachFragment()).commit();


        new CountDownTimer(6000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                getFragmentManager().beginTransaction().replace(R.id.container,new MainFragment()).commit();
            }
        }.start();

    }
}
