package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class CanvasSaveTest extends View {
    private Paint paint;

    public CanvasSaveTest(Context context) {
        super(context);
        init();
    }

    public CanvasSaveTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CanvasSaveTest(Context context, AttributeSet attrs, int defStyleAttr) {
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

        // Rect rect = new Rect(0, 0, 200, 200);
        // canvas.clipRect(rect);
        //
        // canvas.save();
        // canvas.restore();
        // // canvas.restore(); //崩溃
        //
        // canvas.drawColor(Color.GREEN);

        Rect rect = new Rect(0, 0, 200, 200);

        paint.setColor(Color.GREEN);
        canvas.drawRect(rect, paint);

        //第一次保存画布
        canvas.save();

        canvas.translate(100, 100);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(rect, paint);

        //第二次保存，并新建一个透明的矩形画布
        canvas.saveLayerAlpha(0, 100, 300, 300, 150);
        canvas.drawColor(Color.RED);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(rect, paint);


    }
}
