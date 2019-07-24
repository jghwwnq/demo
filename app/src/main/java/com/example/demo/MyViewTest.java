package com.example.demo;

import android.app.Activity;
import android.os.Bundle;

public class MyViewTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int flag=getIntent().getIntExtra("flag",-1);
        switch (flag){
            case 0:
                setContentView(R.layout.teaching);
                break;
            case 1:
                setContentView(R.layout.my_textview);
                break;
            case 2:
                setContentView(R.layout.shine_textview);
                break;
            default:
                break;
        }
    }
}
