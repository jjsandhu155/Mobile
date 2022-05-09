package com.sandhujj.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import static android.graphics.Color.*;

public class DrawView extends View {
    Paint p = new Paint();
    int y = 0;
    int dY = 5;
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.rgb(153,102,0));
        Rect stump = new Rect(500,1100,600,2110);
        canvas.drawRect(stump,p);
        p.setColor(GREEN);
        canvas.drawOval(new RectF(200f,350f,900f,1100f),p);


        p.setColor(RED);
        canvas.drawOval(new RectF(320f,430f,350f,500f),p);
        p.setColor(Color.rgb(255,102,0));
        canvas.drawOval(new RectF(390f,530f,450f,600f),p);
        p.setColor(RED);
        canvas.drawOval(new RectF(490f,630f,550f,700f),p);
        p.setColor(Color.rgb(255,102,0));
        canvas.drawOval(new RectF(260f,640f,290f,710f),p);
        p.setColor(RED);
        canvas.drawOval(new RectF(560f,840f,590f,930f),p);
        p.setColor(Color.rgb(255,102,0));
        canvas.drawOval(new RectF(700f,740f,740f,800f),p);
        p.setColor(RED);
        canvas.drawOval(new RectF(620f,450f,650f,550f),p);
        p.setColor(Color.rgb(255,102,0));
        canvas.drawOval(new RectF(400f,720f,460f,780f),p);

        y+=dY;
        y%=getHeight();
        invalidate();


    }
}

//Bottom 2110
//Right 1435
//Center 720
