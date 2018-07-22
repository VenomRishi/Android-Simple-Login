package com.example.acer.loginactivity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        @ColorRes int color;
        TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("key_username");
        String password = bundle.getString("key_password");
        if (username.equals("rishikesh") && password.equals("rishikesh123")) {
            resultTextView.setText("Login Success");
            color = R.color.success;
        } else {
            resultTextView.setText("Login Failed");
            color = R.color.failed;
        }
        resultTextView.setTextColor(ContextCompat.getColor(this,color));
    }
}
