package com.example.primerboceto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View v) {
        Intent i = new Intent(this, mainActivity.class);
        startActivity(i);
    }

    public void registro(View v) {
        Intent i = new Intent(this, registroActivity.class);
        startActivity(i);
    }
}
