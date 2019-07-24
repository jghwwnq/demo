package com.example.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyTextView extends View {
    private Paint mPaint1;
    private Paint mPaint2;
    public MyTextView(Context context) {
        super(context);
        initView();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    private void initView(){
        mPaint1=new Paint();
        mPaint1.setColor(getResources().getColor(android.R.color.holo_blue_bright));
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint2=new Paint();
        mPaint2.setColor(Color.YELLOW);
        mPaint2.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0,
                0,
                getMeasuredWidth(),
                getMeasuredHeight(),
                mPaint1);
        canvas.drawRect(10,
                10,
                getMeasuredWidth()-10,
                getMeasuredHeight()-10,
                mPaint2);
        canvas.save();
        canvas.translate(10,0);

        super.onDraw(canvas);
        canvas.restore();
    }
}
