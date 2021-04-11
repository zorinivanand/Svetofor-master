package ru.zorinivan.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }
    public void onTryClick(View view) {
        Intent intent = new Intent(HelloActivity.this, MainActivity.class);
        startActivity(intent);
    }
}