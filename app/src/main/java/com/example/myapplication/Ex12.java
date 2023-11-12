package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Ex12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraphicView(this));

    }

    private static class MyGraphicView extends View {
        public MyGraphicView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();
            paint.setAntiAlias(true); // 도형의 끝을 부드럽게 처리 한다는데 차이 모르겠음...
            paint.setColor(Color.GREEN);
            canvas.drawLine(20, 20, 600, 20, paint); // drawLine(x시작점, y시작점, x끝점, y끝점, 페인트) 로 파라미터가 구성되어 있음

            paint.setColor(Color.RED);
            paint.setStrokeWidth(0); // 윤각선의 두게 설정

            paint.setStyle(Paint.Style.FILL);
            Rect rect1 = new Rect(20, 100, 220, 100 + 200); // Rect( left(x값), top(y값), right(x값), bottom(y값) ) 로 파라미터가 구성되어 있음
            canvas.drawRect(rect1, paint);

            paint.setStyle(Paint.Style.STROKE);
            Rect rect2 = new Rect(260, 100, 260 + 200, 100 + 200);
            canvas.drawRect(rect2, paint);

            // Rect 와 RectF의 차이 int형 float형 이다.
            RectF rect3 = new RectF(500, 100, 500 + 200, 100 + 200);
            canvas.drawRoundRect(rect3, 40, 40, paint);

            canvas.drawCircle(120, 440, 100, paint);

            paint.setStrokeWidth(10);

            Path path1 = new Path();
            path1.moveTo(20, 580);
            path1.lineTo(20 + 100, 580 + 100);
            path1.lineTo(20 + 200, 580);
            path1.lineTo(20 + 300, 580 + 100);
            path1.lineTo(20 + 400, 580);
            canvas.drawPath(path1, paint);

            paint.setStrokeWidth(0);
            paint.setTextSize(60);
            canvas.drawText("안드로이드", 20, 780, paint);

        }

    }

}