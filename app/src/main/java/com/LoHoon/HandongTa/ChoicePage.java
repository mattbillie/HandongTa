package com.LoHoon.HandongTa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChoicePage extends Activity {
    TextView t1,t2;
    public final static int code =100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_page);
        t1=findViewById(R.id.storedId);
        t2=findViewById(R.id.storedPassword);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String password = intent.getStringExtra("password");
        t1.setText(id);
        t2.setText(password);



    }

    public void onClick(View view) {
        Intent intent2 = new Intent(this,AddListPage.class);
        startActivityForResult(intent2,code);
    }
}
