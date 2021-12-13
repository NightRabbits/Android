package com.example.mystudy3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

class MyView extends View {
    int nPosX, nPosY;
    public MyView(Context cotxtxMy) {
        super(cotxtxMy);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        nPosX = (int) event.getX(0);
        nPosY = (int) event.getY(0);

        int action = event.getActionMasked();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                nPosX = (int) event.getX(0);
                nPosY = (int) event.getY(0);
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        invalidate();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint MyPaint = new Paint();

        MyPaint.setAntiAlias(true);
        MyPaint.setColor(Color.GREEN);
        MyPaint.setStrokeWidth(20);
        canvas.drawLine(100,100,300, 300, MyPaint);

        MyPaint.setColor(Color.RED);
        MyPaint.setStrokeWidth(30);
        MyPaint.setStyle(Paint.Style.STROKE);
        Rect rect1= new Rect(300,300,300 +100 , 300 +200);
        canvas.drawRect(rect1, MyPaint);

        MyPaint.setColor(Color.CYAN);
        canvas.drawCircle(500, 500, 100, MyPaint);

        MyPaint.setStrokeWidth(0);
        MyPaint.setTextSize(50);
        MyPaint.setStyle(Paint.Style.FILL);
        MyPaint.setColor(Color.BLACK);
        canvas.drawText("안드로이드", 100, 700, MyPaint);
        canvas.drawText("X = "+nPosX +" Y = "+nPosY,  50, 50, MyPaint);

        MyPaint.setColor(Color.CYAN);
        MyPaint.setStrokeWidth(5);
        MyPaint.setStyle(Paint.Style.STROKE);
        Path path1 = new Path();
        path1.moveTo(10, 290);
        path1.lineTo(10+50, 290+50);
        path1.lineTo(10+100, 290);
        path1.lineTo(10+150, 290+50);
        path1.lineTo(10+200, 290);
        canvas.drawPath(path1, MyPaint);

    }

}
public class DrawTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_draw_test);
        setContentView(new MyView(this));
    }
}