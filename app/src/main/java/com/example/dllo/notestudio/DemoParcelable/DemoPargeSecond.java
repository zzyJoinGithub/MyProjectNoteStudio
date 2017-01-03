package com.example.dllo.notestudio.DemoParcelable;

import android.content.Intent;
import android.util.Log;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/7.
 */

public class DemoPargeSecond extends BaseActivity {

    @Override
    public int setMyLayout() {
        return R.layout.demo_parge_sec;
    }

    @Override
    public void initMyView() {

    }

    @Override
    public void initMyData() {
        DemoPargeBean bean = new DemoPargeBean();
        Intent intent = getIntent();
        bean = intent.getParcelableExtra("kkey");

        Log.d("DemoPargeSecond", "" + bean.getName()
                +""+bean.getAuthor()+""+bean.getAge()
        );

    }
}
