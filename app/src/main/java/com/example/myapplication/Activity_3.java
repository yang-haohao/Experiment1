package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class Activity_3 extends AppCompatActivity {
    Button btn3_1;
    final int[] names = new int[]{
      R.id.View01,
      R.id.View02,
      R.id.View03,
      R.id.View04,
      R.id.View05
    };
    ImageView[] views = new ImageView[names.length];

    @SuppressLint("HandlerLeak")
    Handler handler = new Handler(){
        int i=0;
        public void handleMessage(Message msg){
            if(msg.what == 0x123)
            {
                views[i].setVisibility(View.VISIBLE);
                i++;
                if(i==names.length)
                {
                    i=0;
                }
            }
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btn3_1=(Button)findViewById(R.id.btn3_1);
        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        for(int i=0;i<names.length;i++)
        {
            views[i] = (ImageView) findViewById(names[i]);
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,2000);
    }
}
