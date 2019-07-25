package com.LoHoon.HandongTa;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.LoHoon.HandongTa.Main.MainPage;

public class ChoicePage extends AppCompatActivity {
    TextView t1,t2;
    Button bt1;
    public final static int code =100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_page);
        t1=findViewById(R.id.storedId);
        t2=findViewById(R.id.storedPassword);
        bt1=findViewById(R.id.addList);
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
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == code){
            if(resultCode == RESULT_OK){
                bt1.setText("x");
            }
        }
    }

    public void selectDriver(View view) {
        Intent intent3 = new Intent(this, MainPage.class);
        if(bt1.getText().toString().equals("x")){
            startActivity(intent3);
        }
        else Toast.makeText(this,"등록을 완료해주세요.", Toast.LENGTH_SHORT).show();
    }
    public void selectBoarder(View view) {
        Intent intent3 = new Intent(this,MainPage.class);
        startActivity(intent3);
    }

}
