package com.pucmm.listactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView txt_name, txt_body;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        txt_name = findViewById(R.id.txt_name);
        txt_body = findViewById(R.id.txt_body);

        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.info_src);

        txt_body.setText(message);

    }
}
