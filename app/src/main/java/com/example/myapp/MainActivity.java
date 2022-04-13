package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.os.Handler;

public class MainActivity extends AppCompatActivity {
//Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Handler obj=new Handler();
//        obj.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i=new Intent(MainActivity.this,LoginPage.class);
//                startActivity(i);
//            }
//        },5000);

      Thread obj=new Thread(){
          @Override
          public void run() {
              try {
                  sleep(5000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              Intent i=new Intent(getApplicationContext(),LoginPage.class);
              startActivity(i);
              finish();
          }
      };
      obj.start();
    }
}



