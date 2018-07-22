package com.example.acer.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=(EditText) findViewById(R.id.usernameEditText);
        passwordEditText=(EditText) findViewById(R.id.passwordEditText);
        loginButton=(Button) findViewById(R.id.loginButton);
        resetButton=(Button) findViewById(R.id.resetButton);

        //on login button it will redirect to ResultActivity Page
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=usernameEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                Intent intent=new Intent(MainActivity.this,ResultActivity.class);

                Bundle bundle=new Bundle();
                bundle.putString("key_username",username);
                bundle.putString("key_password",password);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        //on reset button it will Reset Text field
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usernameEditText.setText("");
                passwordEditText.setText("");
                usernameEditText.requestFocus();
            }
        });
    }
}
