package com.LoHoon.HandongTa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddListPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_list_page);
        Intent intent = getIntent();


    }

    public void onClick(View view) {
        Intent intent2 = new Intent(this,ChoicePage.class);
        setResult(RESULT_OK,intent2);
        finish();
    }
}
