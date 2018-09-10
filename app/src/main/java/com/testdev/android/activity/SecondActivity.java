package com.testdev.android.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.testdev.android.R;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";

    private TextView textView;
    private List<String> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e(TAG, "onCreate: ");

        initView();


    }

    private void initView() {

        List<String> list = new ArrayList<>();


        int a = 0;
        int b = 1;


        if (a==1){

        }else if (a==2){

        }else {

        }

        for (int i = 0; i < 9; i++) {
            a++;
            b--;
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
    }
}
