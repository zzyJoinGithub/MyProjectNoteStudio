package com.example.dllo.notestudio.DemoWebview;

import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/7.
 */

public class Demo_webview extends BaseActivity {
    private WebView webView;
    private String url = "https://www.baidu.com/";
    private WebChromeClient webChromeClient ;
    private WebSettings webSettings ;

    @Override
    public int setMyLayout() {
        return R.layout.demo_webview;
    }

    @Override
    public void initMyView() {
        webView = (WebView) findViewById(R.id.demo_webview);
    }

    @Override
    public void initMyData() {
        //下面这几行要写在设置网址之前
        webChromeClient = new WebChromeClient();
        webSettings = webView.getSettings();

        webView.setWebChromeClient(webChromeClient);
        webView.setFocusable(true);
        webSettings.setJavaScriptEnabled(true);

        //缓存   之前浏览过这个网页 这次没网也可以直接出来
        //点不出来  需要粘贴 - - ,
        webSettings.setCacheMode(webSettings.LOAD_CACHE_ELSE_NETWORK);

        webView.loadUrl(url);


    }
}
