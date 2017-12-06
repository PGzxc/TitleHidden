package com.example.titlehidden;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.widget.TextView;

/**
 * Created by admin on 2017/12/5.
 */

public class TitleActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        TextView textView = new TextView(this);
        textView.setText("Activity隐藏标题栏");
        setContentView(textView);
    }
}
