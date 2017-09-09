package org.androidtown.tablayoutexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kim on 2017-09-09.
 */

public class Nav_1 extends android.app.Fragment{
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater . inflate(R.layout.nav_1 , container, false);
        return v;
    }
}
