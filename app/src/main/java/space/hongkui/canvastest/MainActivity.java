package space.hongkui.canvastest;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {

    GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestView testView = new TestView(this);
        CanvasSaveTest canvasSaveTest = new CanvasSaveTest(this);
        setContentView(testView);
        // setContentView(R.layout.activity_main);
    }
}
