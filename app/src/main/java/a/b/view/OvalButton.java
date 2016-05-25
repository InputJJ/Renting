package a.b.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import a.b.c.R;

/**
 * Created by my on 2016/5/21.
 */
public class OvalButton extends TextView {

    private Paint paint=new Paint();
    int color;
    int size;
    int arc;


    public OvalButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array=context.obtainStyledAttributes(attrs, R.styleable.OvalButton);
        //获得边框颜色属性的值
        color=array.getInt(R.styleable.OvalButton_bordercolor, Color.BLACK);
        //获得边框粗细属性的值
        size=array.getInt(R.styleable.OvalButton_bordersize,0);
        //圆角的弧度
        arc=array.getInt(R.styleable.OvalButton_arc,0);
        //回收数组
        array.recycle();

        Log.e("1111111", size + "");
        Log.e("1111111",color+"");

        //设置画笔的粗细
        paint.setStrokeWidth(size);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
    }

    public OvalButton(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制按钮的边框
        canvas.drawRect(0, 0, this.getWidth(), this.getHeight(), paint);
    }
}
