package com.example.intent_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view) {
        Intent i = new Intent(MainActivity.this,Activity_second.class);

        startActivity(i);

    }
}