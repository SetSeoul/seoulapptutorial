package org.androidtown.tablayoutexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by kim on 2017-08-14.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}

