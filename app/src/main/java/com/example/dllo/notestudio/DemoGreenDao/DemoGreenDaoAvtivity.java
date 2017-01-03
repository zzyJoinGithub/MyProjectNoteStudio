package com.example.dllo.notestudio.DemoGreenDao;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

import java.util.List;

/**
 * Created by dllo on 16/12/6.
 */

public class DemoGreenDaoAvtivity extends BaseActivity implements View.OnClickListener {
    private Button btn_insert, btn_del, btn_update, btn_query;

    private BeanPersonDao mPersonDao;

    @Override
    public int setMyLayout() {
        return R.layout.demo_greendao;
    }

    @Override
    public void initMyView() {
        btn_insert = (Button) findViewById(R.id.demo_green_btn1);
        btn_del = (Button) findViewById(R.id.demo_green_btn2);
        btn_update = (Button) findViewById(R.id.demo_green_btn3);
        btn_query = (Button) findViewById(R.id.demo_green_btn4);
    }

    @Override
    public void initMyData() {
        btn_insert.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_update.setOnClickListener(this);
        btn_query.setOnClickListener(this);
        //之前的不用了
        //befoer();


    }


    @Override
    public void onClick(View view) {

        // 现在直接调用DBTool.  .自己刚刚在DBTool定义的方法就可以了
        switch (view.getId()) {
            case R.id.demo_green_btn1:
                for (int i = 0; i < 30; i++) {
                    BeanPerson person = new BeanPerson(null, "这是个人名", "男", i + 1);

                    DBTool.getInstance().insertBeanPerson(person);

                }
                break;
            case R.id.demo_green_btn2 :
                Toast.makeText(this, "删除所有", Toast.LENGTH_SHORT).show();
                DBTool.getInstance().deleteAll();
                break;
            case R.id.demo_green_btn3:
                Toast.makeText(this, "基本不用", Toast.LENGTH_SHORT).show();
                break;
            case R.id.demo_green_btn4:
                for (BeanPerson person : DBTool.getInstance().queryAll()) {
                    Log.d("MainActivity", "" + person.getId()
                            + "" + person.getName() + "" + person.getSex() + "" + person.getAge()
                    );
                }
                break;


            //之前的不用了
            //before2(view);

        }


    }


    public void before2(View view) {
        switch (view.getId()) {
            case R.id.demo_green_btn1:
                for (int i = 0; i < 9; i++) {
                    BeanPerson person = new BeanPerson(null, "阿君", "男", 15 + i);
                    //增的方法
                    mPersonDao.insert(person);
                }
                break;
            case R.id.demo_green_btn2:
                //查找数据库中年龄为18的person
                //BeanPersonDao 是系统自己给你生成的不是你自己建的
                BeanPerson personDel = mPersonDao.queryBuilder()
                        .where(BeanPersonDao.Properties.Age.eq(18))
                        .build().unique();

                if (personDel != null) {
                    //通过找到这个person的id然后进行删除操作
                    //mPersonDao.deleteByKey(deletePerson.getId());

                    mPersonDao.delete(personDel);
                    //全删
                    mPersonDao.deleteAll();

                }
                break;
            case R.id.demo_green_btn3:
                BeanPerson personUp = mPersonDao.queryBuilder()
                        .where(BeanPersonDao.Properties.Age.eq(22))
                        .build().unique();

                if (personUp != null) {
                    personUp.setName("我把年龄为22的名字换成----------------");
                    //修改方法
                    mPersonDao.update(personUp);
                }
                break;
            case R.id.demo_green_btn4:
                //查询所有数据
                List<BeanPerson> list = mPersonDao.loadAll();
                for (BeanPerson person : list) {
                    Log.d("DemoGreenDaoAvtivity", "" + person.getId()
                            + "" + person.getName()
                            + "" + person.getSex()
                            + "" + person.getAge()
                    );
                }
                break;
        }
    }

    public void befoer() {
        //各种初始化
        //在这之前必须先写好实体类(set get 方法不用写)
        //先点上面小圆圈(加依赖按得) 然后Build--Make Project

        //helper类的初始化操作
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "MyFile.db", null);
        //初始化master
        DaoMaster master = new DaoMaster(helper.getWritableDb());
        //session初始化
        DaoSession session = master.newSession();
        //xxxDao初始化
        //这个对象就是具体对数据库操作的对象
        //这个会报错--------直接alt+回车  第一个就行
        mPersonDao = session.getBeanPersonDao();
    }
}
