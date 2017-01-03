package com.example.dllo.notestudio.DemoPostFragmentRev;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by dllo on 16/12/2.
 */
//这里要用fragmentstatepageradapter  因为???
public class DemoPostActivityMyAdapter extends FragmentStatePagerAdapter {
    //定义静态常量的bean 为了传id
    private static BeanPostTab bean ;

    public static void setBean(BeanPostTab bean) {
        DemoPostActivityMyAdapter.bean = bean;
    }
    //自己写方法传拼接id
    public static String getMessage(int pos){
        return bean.getData().get(0).getSubNav().get(pos).getId();
    }


    public DemoPostActivityMyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override  //fragment里面要复写方法  自己添加参数
    public Fragment getItem(int position) {
        return DemoPostFragment.newInstance(position);
    }

    @Override //这里必须写这个必须必须
    public int getCount() {
        return bean!=null&& bean.getData().get(0).getSubNav().size()>0?bean.getData().get(0).getSubNav().size():null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return bean.getData().get(0).getSubNav().get(position).getChannel_name_cn();
    }



}
