package com.example.intent_activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
public class Activity_second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void buttonBack(View view){
        Intent i2 = new Intent(Activity_second.this,
                MainActivity.class);
        startActivity(i2);
    }
}