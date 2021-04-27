package com.bignerdbranch.android.twin_stick_shooter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start_button = findViewById(R.id.main_menu_start_btn);

        start_button.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, GameActivity.class);
            startActivity(intent);
        });
    }
}