package test.example.com.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by jerometian on 2015/10/17.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);
    }
}
