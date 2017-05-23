package com.sunchengjian.myplayer0523.pager;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.sunchengjian.myplayer0523.frament.BaseFragment;


/**
 * Created by 0..0 on 2017/5/23.
 */

public class LocalVideo extends BaseFragment {
    private TextView textView;
    @Override
    public View initView() {
        textView = new TextView(context);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("111");
    }
}
