package com.testdev.android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.testdev.android.activity.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");

        //        try {
        //            Thread.sleep(3000);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
    }

}
