package com.example.saveinstancetest;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private static final String INT_KEY_BUNDLE = "INT_KEY_BUNDLE";

    private ArrayList<String> mArrayList;

    private EditText mEditText;

    private int mInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList = new ArrayList<>();
        mInt = 0;

        mEditText = (EditText) findViewById(R.id.a_main_et_1);

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt(INT_KEY_BUNDLE, mInt);

        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mInt = savedInstanceState.getInt(INT_KEY_BUNDLE);

        Log.d(TAG, "onRestoreInstanceState: ");
    }

    public void logValue(View view) {
        Log.d(TAG, "logValue: " + mInt);
    }

    public void setValue(View view) {
        mInt = Integer.parseInt(mEditText.getText().toString());
    }
}
