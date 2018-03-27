package com.example.wayne.base_ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Author:Wayne
 * Time:2018/3/9 11:49
 * Description: This is BaseActivity
 */

public abstract class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: " + getClass().getSimpleName());
        initBaseView();
        initLayout();
        initTitle();
        initData();
    }

    protected void initBaseView() {

    }

    protected abstract void initData();

    protected abstract void initLayout();

    protected abstract void initTitle();


    @Override
    protected void onPostResume() {
        super.onPostResume();
//        Log.d(TAG, "onPostResume: " + getClass().getSimpleName());
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Log.d(TAG, "onStart: " + getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
//        Log.d(TAG, "onStop: " + getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.d(TAG, "onDestroy: " + getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Log.d(TAG, "onResume: " + getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
//        Log.d(TAG, "onRestart: " + getClass().getSimpleName());
    }
}
