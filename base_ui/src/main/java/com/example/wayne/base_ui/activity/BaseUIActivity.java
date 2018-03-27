package com.example.wayne.base_ui.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.example.wayne.base_ui.R;


/**
 * Author:Wayne
 * Time:2018/3/13 17:48
 * Description: This is BaseUIActivity
 */

public abstract class BaseUIActivity extends BaseActivity {
    FrameLayout llContent;
    ProgressBar pbProgress;

    @Override
    protected void initBaseView() {
        super.setContentView(R.layout.activity_base_activity);
        llContent = findViewById(R.id.ll_content);
        pbProgress = findViewById(R.id.pb_progress);
    }

    @Override
    public void setContentView(View view) {
        if (view != null && llContent != null) {
            llContent.addView(view,
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT);
        }
    }

    @Override
    public void setContentView(int layoutResId) {
        if (layoutResId > 0) {
            View view = LayoutInflater.from(this).inflate(layoutResId, null);
            setContentView(view);
        }
    }
}
