package com.example.dllo.notestudio.DemoPostFragmentRev;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.android.volley.VolleyError;
import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetHelper;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetListener;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoPostActivity extends BaseActivity {
    private ViewPager vp ;
    private TabLayout tab ;
    private DemoPostActivityMyAdapter myAdapter ;

    @Override
    public int setMyLayout() {
        return R.layout.demo_post_main;
    }

    @Override
    public void initMyView() {
        tab = (TabLayout) findViewById(R.id.demo_post_tab);
        vp = (ViewPager) findViewById(R.id.demo_post_vp);
        myAdapter = new DemoPostActivityMyAdapter(getSupportFragmentManager());
    }

    @Override
    public void initMyData() {
        String urlTab = "http://new.yohoboys.com/yohoboyins/v5/channel/navigation";
        NetHelper.MyRequest(urlTab, BeanPostTab.class, new NetListener<BeanPostTab>() {
            @Override
            public void successListener(BeanPostTab response) {
                myAdapter.setBean(response);
                vp.setAdapter(myAdapter);
                tab.setupWithViewPager(vp);
                //超出Tab会自己滑动
                tab.setTabMode(TabLayout.MODE_SCROLLABLE);
            }

            @Override
            public void errorListener(VolleyError error) {

            }
        });


    }
}
