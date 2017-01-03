package com.example.dllo.notestudio.DemoGreenDao;

import com.example.dllo.notestudio.Tool.VolleyTwicePackge.MyApp;

import org.greenrobot.greendao.query.DeleteQuery;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

/**
 * Created by dllo on 16/12/12.
 */

//新建一个单例的类  (不是class)
public class DBTool {

    private static DBTool ourInstance = new DBTool();
    //初始化 自己的操作的Dao的那个类
    private static BeanPersonDao mBeanPersonDao ;


    //这个是系统自己单例复写的方法   需要修改
    public static DBTool getInstance() {
        //创建单例对象  双重校验所   获取本类中的单例对象
        if (ourInstance == null){
            synchronized (DBTool.class){
                if (ourInstance == null){
                    ourInstance = new DBTool();
                }
            }
        }
        //初始化  xxxDao对象
        mBeanPersonDao = MyApp.getsDaoSession().getBeanPersonDao();

        return ourInstance;
    }

    private DBTool() {
    }

    //这下面写操作数据库的方法

    //增加单一对象的方法
    public void insertBeanPerson (BeanPerson person){
        mBeanPersonDao.insert(person);
    }
    //增加集合的方法
    public void insertList (List<BeanPerson> list){
        mBeanPersonDao.insertInTx(list);
    }
    //删除单一方法
    public void deletePerson (BeanPerson person){
        mBeanPersonDao.delete(person);
    }
    //删除所有内容
    public void deleteAll(){
        mBeanPersonDao.deleteAll();;
    }
    //根据ID删除
    public void deleteById (Long id){
        mBeanPersonDao.deleteByKey(id);
    }
    //根据某一字段删除
    public void deleteByName (String name ){
        DeleteQuery<BeanPerson> deleteQuery = mBeanPersonDao.queryBuilder()
                .where(BeanPersonDao.Properties.Name.eq(name))
                .buildDelete();
        //调用方法
        deleteQuery.executeDeleteWithoutDetachingEntities();
    }
    //根据具体姓名性别年龄进行删除
    public void deleteBy(String name, String sex, int age) {
        DeleteQuery<BeanPerson> deleteQuery = mBeanPersonDao.queryBuilder()
                .where(BeanPersonDao.Properties.Name.eq(name),
                        BeanPersonDao.Properties.Sex.eq(sex),
                        BeanPersonDao.Properties.Age.eq(age))
                .buildDelete();
        if (deleteQuery != null) {
            deleteQuery.executeDeleteWithoutDetachingEntities();
        }
    }

    //查询所有
    public List<BeanPerson> queryAll() {
        //查询方法1
        List<BeanPerson> list = mBeanPersonDao.loadAll();
        //查村方法2
        List<BeanPerson> personList = mBeanPersonDao.queryBuilder().list();

        return list;
    }

    //查重
    //根据姓名来查询
    public boolean isSave(String name) {
        QueryBuilder<BeanPerson> queryBuilder = mBeanPersonDao.queryBuilder()
                .where(BeanPersonDao.Properties.Name.eq(name));


        //获取要查询的内容
        Long size = queryBuilder.buildCount().count();

        return size > 0 ? true : false;
    }

    //根据具体的name sex age 查询
    public boolean isSave(BeanPerson person) {
        QueryBuilder<BeanPerson> queryBuilder = mBeanPersonDao.queryBuilder()
                .where(BeanPersonDao.Properties.Name.eq(person.getName()),
                        BeanPersonDao.Properties.Sex.eq(person.getSex()),
                        BeanPersonDao.Properties.Age.eq(person.getAge()));

        Long size = queryBuilder.buildCount().count();
        return size > 0 ? true : false;

    }


}
