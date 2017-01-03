package com.example.dllo.notestudio.DemoVideoView;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.android.volley.VolleyError;
import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetHelper;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetListener;
import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Created by dllo on 16/12/10.
 */

public class DemoVideoViewActivity extends BaseActivity {
    private VideoView vv ;
    private String url;
    private HashMap<String, String> mapSure;

    private WebView wv ;
    private WebSettings webSettings ;

    @Override
    public int setMyLayout() {
        return R.layout.demo_videoview;
    }

    @Override
    public void initMyView() {
        vv = (VideoView) findViewById(R.id.demo_videoview_vv);

        wv = (WebView) findViewById(R.id.demo_videoview_web);
        webSettings = wv.getSettings();


    }

    @Override
    public void initMyData() {
        //往post解析的map放key  value
        basedata();

        //设置WebView  缩放至屏幕的大小
        webSettings.setLoadWithOverviewMode(true);
        //设置字体大小
        webSettings.setMinimumFontSize(16);

        NetHelper.MyRequest(url, BeanVideoView.class, new NetListener<BeanVideoView>() {
            @Override
            public void successListener(BeanVideoView response) {
                vv.setMediaController(new MediaController(DemoVideoViewActivity.this));
                vv.setVideoURI(Uri.parse(response.getData().getContents().getVideoUrl()));
                vv.start();

                //显示文字与图片内容
                wv.loadDataWithBaseURL("about:blank",
                        response.getData().getContents().getContent(), "text/html"
                        , "utf-8"
                        , null);


            }

            @Override
            public void errorListener(VolleyError error) {

            }
        },mapSure);


    }

    public void basedata() {
        url = "http://new.yohoboys.com/yohoboyins/v5/channel/getContentDetail";
        //map
        HashMap<String, String> map = new HashMap<>();
        map.put("cid", "5131");
        map.put("id", "22971");
        map.put("app", "1");
        map.put("platform", "4");
        map.put("locale", "zh-Hans");
        map.put("language", "zh-Hans");
        map.put("udid", "00000000000000063aa461b71c4cfcf");
        map.put("curVersion", "5.0.4");
        HashMap<String, String> mm = new HashMap<>();
        mm.put("udid", "00000000000000063aa461b71c4cfcf");
        Gson gson = new Gson();
        String a = gson.toJson(mm).toString();
        map.put("authInfo", a);
        mapSure = new HashMap<>();
        String value = gson.toJson(map).toString();
        mapSure.put("parameters", value);
    }
}
