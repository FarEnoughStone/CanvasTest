package space.hongkui.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class LayerTest extends View {
    private Paint paint;

    public LayerTest(Context context) {
        super(context);
        init();
    }

    public LayerTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LayerTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.restore();
    }
}
