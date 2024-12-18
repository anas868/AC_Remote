package com.example.anas3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView num,mode, status;
    boolean on =true;
    int mode2 =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num =findViewById(R.id.deg);
        mode=findViewById(R.id.m);
    }

    public void checkStatus(View view) {
        on=!on;
    }
    public void mode(View view) {
        if(on) {
            if (mode2 == 1) {
                mode2 = 2;
                mode.setText("hot");
            } else {
                mode2 = 1;
                mode.setText("cool");
            }
        }
    }
    public void minus(View view) {
        int m=Integer.parseInt(num.getText().toString());
        if(on){
            if(m>16)
                num.setText(String.valueOf(m-1));
        }
    }
    public void plus(View view) {
        int m=Integer.parseInt(num.getText().toString());
        if(on) {
            if (m < 30)
                num.setText(String.valueOf(m + 1));
        }
    }
}