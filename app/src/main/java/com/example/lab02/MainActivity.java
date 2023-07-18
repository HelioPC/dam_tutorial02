package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void finishButtonPressed(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume");
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
}