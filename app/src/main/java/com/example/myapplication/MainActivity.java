package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button btn;
    private int counter = 0;
    private TextView tw;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAAA", "onCreate");
        btn = findViewById(R.id.Button);
        tw = findViewById(R.id.textView);


    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("AAAA", "onStop");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("AAAA", "onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("AAAA", "onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAAA", "onPause");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAAA", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAAA", "onRestart");
    }
}