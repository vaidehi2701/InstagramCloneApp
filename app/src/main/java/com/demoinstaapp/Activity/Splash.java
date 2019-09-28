package com.demoinstaapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import com.demoinstaapp.R;

public class Splash extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_splash);
                Thread t=new Thread() {
                    public void run() {
                        try {
                            sleep(10000);

                            Intent i = new Intent(Splash.this, LoginActivity.class);
                            startActivity(i);
                            finish();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                t.start();

            }
        }



