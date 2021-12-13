package com.example.appstudy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

class MyView extends View {
    boolean isClicked;
    int nX, nY;

    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        nX = (int) event.getX();
        nY = (int) event.getY();
        invalidate();
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint MyPaint = new Paint();

        MyPaint.setAntiAlias(true);
        MyPaint.setColor(Color.BLACK);
        MyPaint.setTextSize(50);

        int x1 = 300;
        int y1 = 300;
        int x2 = 400;
        int y2 = 500;
        isClicked = (x1 <= nX && nX <= x2) && (y1 <= nY && nY <= y2);

        canvas.drawText("X = " + nX + "Y = " + nY + "클릭 여부 : " + isClicked,50,500,MyPaint);

        MyPaint.setColor(Color.GREEN);
        MyPaint.setStrokeWidth(5);
        canvas.drawLine(10,10,300,300,MyPaint);

        MyPaint.setColor(Color.RED);
        MyPaint.setStrokeWidth(15);
        MyPaint.setStyle(Paint.Style.STROKE);
        Rect rect1 = new Rect(300,300,300+100,300+200);
        canvas.drawRect(rect1,MyPaint);

        MyPaint.setColor(Color.rgb(255,0,255));
        canvas.drawCircle(500,500,100, MyPaint);

        Path path1 = new Path();
        path1.moveTo(10,290);
        path1.lineTo(10 + 50, 290 + 100);
        path1.lineTo(10 + 100, 290);
        path1.lineTo(10 + 150, 290 + 200);
        path1.lineTo(10 + 200, 390);
        canvas.drawPath(path1,MyPaint);

        MyPaint.setColor(Color.CYAN);
        MyPaint.setStyle(Paint.Style.FILL);
        canvas.drawOval(600,600,800,700,MyPaint);

    }
}

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_draw);

        // wWvwvwWvWVwvwwvWVWVVWvwvWWWvwvvvWVwVwvWwVVvwWVWVWVWVWVWwVwwvwvwwvVWVWVWVw Grass
        MyView Mview = new MyView(this);
        setContentView(Mview);

    }

    /**
     * Need https://stackoverflow.com!
     * @exception StackOverflowError GOTO https://stackoverflow.com
     */
    public void StackOverFlow() {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://stackoverflow.com"));
        startActivity(i);

        throw new StackOverflowError("https://stackoverflow.com");
    }
}
