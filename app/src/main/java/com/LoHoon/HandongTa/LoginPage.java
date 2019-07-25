package com.LoHoon.HandongTa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    EditText id,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


    }

    public void onClick(View view) {
        id=findViewById(R.id.enterId);
        password=findViewById(R.id.enterPassword);
        Intent intent = new Intent(this,ChoicePage.class);


        intent.putExtra("id",id.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);

    }
}
