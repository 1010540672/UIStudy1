package com.uistudy1.practiceview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/7/17 0017.
 */

public class Practice1DrawColorView extends View {

    private Paint mPaint=new Paint();
    private Canvas mCanvas;
    public Practice1DrawColorView(Context context) {
        super(context);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStrokeWidth(30);
        //背景
        canvas.drawColor(Color.BLUE);
        canvas.drawColor(Color.RED);
        canvas.drawRGB(200,100,300);
        canvas.drawARGB(600,0,100,300);
        canvas.drawColor(Color.BLACK);
        //圆
        mPaint.ascent();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLUE);
       mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStyle(Paint.Style.STROKE);
      // mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
       // canvas.drawCircle(300f,300f,100f,mPaint);
        //矩形(left top right,bottom)
       // Rect _test=new Rect();
        RectF _test=new RectF();
        _test.set(100,200,500,500);
        //canvas.drawRect(20f,100f,350f,500,mPaint);
       // canvas.drawRect(_test,mPaint);
        //点（x,y）
//        mPaint.setStrokeCap(Paint.Cap.BUTT);
//        mPaint.setStrokeCap(Paint.Cap.SQUARE);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
        //canvas.drawPoint(300,500,mPaint);
        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 130, 150, 65, 190, 120,300,500};

      // canvas.drawPoints(points,mPaint);
        //count 是坐标的点数总和
       // canvas.drawPoints(points,4,10,mPaint);
        //Android L以下用这个方法
      //  canvas.drawOval(_test,mPaint);
        //os>L
      //  canvas.drawOval(100,200,500,500,mPaint);
        mPaint.setStrokeWidth(5f);
       // canvas.drawLine(0f,0f,88f,500f,mPaint);

        //4个坐标一组 划线
      // canvas.drawLines(points,2,8,mPaint);

        //画圆角矩形
        //OS>L
      //  canvas.drawRoundRect(100,50,350,600,20,20,mPaint);
        RectF _Rect=new RectF();
      //  _Rect.set(100,50,350,500);
      //  canvas.drawRoundRect(_Rect,20,20,mPaint);

    //扇形
      //  canvas.drawArc(_Rect,-100,160,true,mPaint);
        //canvas.drawArc(_Rect,100,160,true,mPaint);

        Path path=new Path();
          _Rect.set(200, 200, 400, 400);
        path.addArc(_Rect, -225, 225);
        RectF _Rect2=new RectF();
        _Rect2.set(400, 200, 600, 400);

        path.arcTo(_Rect2, -180, 225, false);
        path.lineTo(400, 542);

       // canvas.drawPath(path,mPaint);
        mPaint.setColor(Color.BLUE);
        float width=35.0f;
Paint _paint=new Paint();
        doHistogramView(900,800,canvas,35,30,_paint);

    }



    private void doHistogramView(float x,float y,Canvas canvas,int width,int height,Paint paint){

        canvas.drawLine(10f,10f,10f,y,mPaint);//直方图y轴
        canvas.drawLine(10f,y,x,y,mPaint);//直方图x轴

        paint.setStrokeWidth(30f);
        paint.setColor(Color.RED);
        canvas.drawRect(45f,45,80,y,paint);
        canvas.drawText("Android",45f,45,paint);

        canvas.drawRect(125f,85,170,y,paint);

        canvas.drawText("ios",125f,85,paint);

        canvas.drawRect(185,120,230,y,paint);
        canvas.drawText("Java",185,120,paint);

        canvas.drawRect(285,320,330,y,paint);

        canvas.drawRect(385,358,430,y,paint);

//        for(int i=0;i<6;i++) {
//
//            canvas.drawRect(35+width*i,height*(i+1),35+width*(i+1),y,paint);
//        }


    }
}
