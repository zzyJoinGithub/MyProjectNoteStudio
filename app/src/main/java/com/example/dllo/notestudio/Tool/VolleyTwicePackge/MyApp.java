package com.example.dllo.notestudio.Tool.VolleyTwicePackge;

import android.app.Application;
import android.content.Context;

import com.example.dllo.notestudio.DemoGreenDao.DaoMaster;
import com.example.dllo.notestudio.DemoGreenDao.DaoSession;

/**
 * Created by leisure on 2016/11/28.
 */
//切记如何使用!!!!!
    //清单文件中加入自己的App
public class MyApp extends Application {
    private static Context mContext;

    //GreenDao封装一般在这里进行
    private static DaoMaster sDaoMaster ;
    private static DaoSession sDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

    }
    //对外提供一个获取Context对象的方法
    public static Context getmContext() {
        return mContext;
    }


    //对外提供获取DaoMaster对象
    public static DaoMaster getsDaoMaster(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(mContext , "Person.db" , null);
        //初始化DaoMaster对象
        sDaoMaster = new DaoMaster(helper.getWritableDb());

        return sDaoMaster ;
    }


    public static DaoSession getsDaoSession(){
        if (sDaoSession == null){
            if (sDaoMaster == null){
                sDaoMaster = getsDaoMaster();
            }
            //初始化DaoSession对象
            sDaoSession = sDaoMaster.newSession();
        }
        return sDaoSession ;
    }



}
