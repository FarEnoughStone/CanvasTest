package space.hongkui.canvastest;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {

    GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CanvasDrawView canvasDrawView = new CanvasDrawView(this);
        CanvasSaveTest canvasSaveTest = new CanvasSaveTest(this);
        CanvasClipAndChange canvasClipAndChange = new CanvasClipAndChange(this);
        setContentView(canvasSaveTest);
        // setContentView(R.layout.activity_main);
    }
}
