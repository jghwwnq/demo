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
            default:
                break;
        }
    }
}
