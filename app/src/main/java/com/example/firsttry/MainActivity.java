package com.example.firsttry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void onBtnClick(android.view.View view) {


        EditText edtTxtName = findViewById(R.id.edtTxtName);

        TextView txtHello = findViewById(R.id.txtMassage);


        txtHello.setText(edtTxtName.getText().toString());

        txtHello.setText(edtTxtName.getText().toString());

    }


}