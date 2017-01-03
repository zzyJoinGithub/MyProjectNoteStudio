package com.example.dllo.notestudio.DemoGreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by dllo on 16/12/6.
 */

@Entity  //有这个Green才能建表
public class BeanPerson {
    @Id
    //Long的L必须大写必须大写
    private Long id ;
    private String name , sex ;
    private int age ;

    //当添加Transient这个注解的时候表名 下面的内容不会存入数据库
    //就是一个普通的成员变量
    @Transient
    private String say ;

    @Generated(hash = 1042163658)
    public BeanPerson(Long id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Generated(hash = 1979353477)
    public BeanPerson() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }





}
