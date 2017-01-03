package com.example.dllo.notestudio.DemoYoHoContext;

import java.text.SimpleDateFormat;

/**
 * Created by dllo on 16/12/10.
 */

public class BaseTool {

    //日期格式更正
    public static final String intoTime(String time){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String timeNew = simpleDateFormat.format(Long.valueOf(time));
        return timeNew ;
    }


    //判断图片链接   把多余的部分截掉
    public static final String subStrings (String str){
        //if里面是判断字符串里面有否是网址  是的话返回
        if (str.startsWith("http")){
            String result = str.substring( 0 , str.indexOf("?"));
            return result;
        }else {
            return "";
        }
    }

}
