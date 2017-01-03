package com.example.dllo.notestudio.DemoParcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dllo on 16/12/7.
 */

public class DemoPargeBean implements Parcelable{
    private String name, author;
    private int age ;

    protected DemoPargeBean(Parcel in) {
        name = in.readString();
        author = in.readString();
        age = in.readInt();
    }
    //自己写的构造方法不用系统给的
    public DemoPargeBean() {
    }

    //系统出来的          //这下面要改!
    public static final Parcelable.Creator<DemoPargeBean> CREATOR = new Creator<DemoPargeBean>() {
        @Override
        public DemoPargeBean createFromParcel(Parcel in) {
            DemoPargeBean bean = new DemoPargeBean();
            bean.name = in.readString();
            bean.author = in.readString();
            bean.age = in.readInt();
            //返回值也要改
            return bean;
        }

        @Override
        public DemoPargeBean[] newArray(int size) {
            return new DemoPargeBean[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(author);
        parcel.writeInt(age);
    }
}
