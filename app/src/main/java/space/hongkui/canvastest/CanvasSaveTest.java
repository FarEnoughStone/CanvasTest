package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class CanvasSaveTest extends View {

    public CanvasSaveTest(Context context) {
        super(context);
    }

    public CanvasSaveTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CanvasSaveTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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

        canvas.drawColor(Color.GRAY);
        canvas.saveLayerAlpha(100, 100, 300, 300, 150);
        canvas.drawColor(Color.RED);


    }
}
