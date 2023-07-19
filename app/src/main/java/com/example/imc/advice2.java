package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;



public class advice2 extends AppCompatActivity {
    TextView result;
    String bmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice2);

        TextView result = findViewById(R.id.result);

        String bmi = getIntent().getStringExtra("res");
        result.setText(bmi);






    }
}