package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;

public class CanvasClipAndChange extends View {
    private Paint paint;

    public CanvasClipAndChange(Context context) {
        super(context);
        init();
    }

    public CanvasClipAndChange(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CanvasClipAndChange(Context context, AttributeSet attrs, int defStyleAttr) {
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

        // /**画布切割**/
        // RectF clipRect = new RectF(100, 100, 200, 200);
        // canvas.clipRect(clipRect, Region.Op.INTERSECT);
        // canvas.drawColor(Color.GREEN);

        /**画布变换**/
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
