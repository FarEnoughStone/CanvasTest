package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View {
    Paint paint;


    public TestView(Context context) {
        super(context);
        init();
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);
        paint.setColor(Color.BLUE);
        paint.setAlpha(160);
        float[] d = {100f, 100f, 100f, 200f, 200f, 200f, 300f, 300f};

        Rect rect = new Rect(100, 100, 300, 500);

        RectF rectF = new RectF(500f, 100, 800, 500);
        canvas.drawRect(rect, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawRoundRect(rectF,20,50,paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200, 200, 100, paint);

        canvas.drawArc(rectF, 0, 360, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF, 0, 120, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF, 0, 120, false, paint);

        paint.setColor(Color.BLACK);
        Path p = new Path();
        p.moveTo(100, 100);
        p.lineTo(200, 200);
        p.lineTo(300, 500);
       canvas.drawPath(p, paint);

    }
}