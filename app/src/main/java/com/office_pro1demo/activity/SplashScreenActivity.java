package com.office_pro1demo.activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.office_pro1demo.LoginActivity;
import com.office_pro1demo.R;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread tl=new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(5*1000);
                    Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {

                }
            }
        };
        tl.start();
    }
}
