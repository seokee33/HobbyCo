package com.sheriffs.myhobby.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.sheriffs.myhobby.view.menu.MainActivity;
import com.sheriffs.myhobby.R;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                myStartActivity(MainActivity.class);
            }
        },2500);
    }

    private void myStartActivity(Class c){
        Intent intent = new Intent(this,c);
        finish();
        startActivity(intent);
    }
}