package com.cidm4385.wt.computerbuildchecklistfinal;

/**
 * Created by sseethoff on 3/9/2018.
 */

import android.support.v4.app.Fragment;

public class CheckListItemActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CheckListItemFragment();
    }
}