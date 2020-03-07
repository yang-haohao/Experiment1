package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Activity_1 extends AppCompatActivity {

    Button btn1_4;
    Button btn1_1;
    Button btn1_2;
    Button btn1_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final LinearLayout test;
        final LinearLayout test1;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        btn1_1=(Button)findViewById(R.id.btn1_1);
        btn1_2=(Button)findViewById(R.id.btn1_2);
        btn1_3=(Button)findViewById(R.id.btn1_3);
        btn1_4=(Button)findViewById(R.id.btn1_4);
        test=(LinearLayout)findViewById(R.id.test);
        test1=(LinearLayout)findViewById(R.id.test1);

        btn1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test.setOrientation(LinearLayout.HORIZONTAL);
            }
        });

        btn1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test.setOrientation(LinearLayout.VERTICAL);
            }
        });

        btn1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test1.setGravity(Gravity.LEFT | Gravity.CENTER_HORIZONTAL);
            }
        });

        btn1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}