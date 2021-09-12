package com.hienqp.explicitintentputgetstring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_SECOND_ACTIVITY = "SecondActivity";

    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewResult = (TextView) findViewById(R.id.textview_result);

        Intent intent = getIntent();

        String result = intent.getStringExtra(SecondActivity.KEY_SECOND_ACTIVITY);

        textViewResult.setText(result);
    }
}