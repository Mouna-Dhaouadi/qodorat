package com.example.pc.qcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText etUsername,etMail,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etUsername=(EditText)findViewById(R.id.etName);
        etMail=(EditText)findViewById(R.id.etMail);
        etPassword=(EditText)findViewById(R.id.etPass);
    }
    public void OnRegister (View view){
        String username=etUsername.getText().toString();
        String password=etPassword.getText().toString();
        String email=etMail.getText().toString();
        String type="register";
        BackgroundWorker backgroundWorker =new BackgroundWorker(this);
        backgroundWorker.execute(type,username,email,password);
    }
}
