package com.example.duplexchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);

        findViewById(R.id.enterBtn).setOnClickListener(view -> {
            Intent intent = new Intent(this,ChatScreen.class);
            intent.putExtra("name",editText.getText().toString());
            startActivity(intent);
        });
    }
}