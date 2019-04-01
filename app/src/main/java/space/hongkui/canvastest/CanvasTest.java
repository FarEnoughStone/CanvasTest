package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CanvasTest extends View {
    private Paint paint;

    public CanvasTest(Context context) {
        super(context);
        init();
    }

    public CanvasTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CanvasTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.GREEN);
        Rect rect = new Rect(0, 0, 200, 200);
        canvas.drawRect(rect, paint);

        canvas.translate(100, 100);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect, paint);

        paint.setColor(Color.BLACK);
        canvas.skew(0.4f, 0.3f);
        canvas.drawRect(rect, paint);


    }
}
