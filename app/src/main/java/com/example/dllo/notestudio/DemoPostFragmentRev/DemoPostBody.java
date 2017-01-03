package com.example.dllo.notestudio.DemoPostFragmentRev;

import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoPostBody {
    //把map转化成String
    public String m(DemoPostBody postBody) {
        Gson gson = new Gson();
        String value = gson.toJson(postBody).toString();
        return value;
    }

    private String channelId, limit, startTime, refreshType, ruleTime, localNum, platform, locale, language, udid, curVersion, authInfo;

    public DemoPostBody() {
        this.limit = "12";
        this.curVersion = "5.0.4";
        this.language = "zh-Hans";
        this.locale = "zh-Hans";
        this.platform = "4";
        this.localNum = "0";
        this.udid = "00000000000000063aa461b71c4cfcf";
        this.refreshType = "1";
        this.startTime = "0";
        this.ruleTime = "0";
        //接口中 value嵌套的key value
        HashMap<String, String> vv = new HashMap<>();
        vv.put("udid", "00000000000000063aa461b71c4cfcf");
        String a = new Gson().toJson(vv).toString();
        this.authInfo = a;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}
