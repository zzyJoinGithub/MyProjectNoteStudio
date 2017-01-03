package com.example.dllo.notestudio.DemoLRecycleview;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetHelper;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetListener;
import com.github.jdsjlzx.interfaces.OnItemClickListener;
import com.github.jdsjlzx.interfaces.OnItemLongClickListener;
import com.github.jdsjlzx.interfaces.OnLoadMoreListener;
import com.github.jdsjlzx.interfaces.OnRefreshListener;
import com.github.jdsjlzx.recyclerview.LRecyclerView;
import com.github.jdsjlzx.recyclerview.LRecyclerViewAdapter;
import com.squareup.picasso.Picasso;

/**
 * Created by dllo on 16/12/7.
 */

public class DemoLRecycleView extends BaseActivity {

    private LRecyclerView lr ;
    private DemoLRadapter myAdapter ;
//  依赖提供的适配器
    private LRecyclerViewAdapter lRAdapter ;

//  加载时的改变的id
    private int i = 1 ;
//    头文件的图片
    private String urlPic = "http://image.haha.mx/2014/08/31/middle/1406957_c10eddc0f80e34b482da2e5009377851_1409417785.jpg";


    @Override
    public int setMyLayout() {
        return R.layout.demo_lrev;
    }

    @Override
    public void initMyView() {
        lr = (LRecyclerView) findViewById(R.id.demo_LR_lr);
        myAdapter = new DemoLRadapter(this);
        //这里是依赖的适配器初始化
        lRAdapter = new LRecyclerViewAdapter(myAdapter);

    }

    @Override
    public void initMyData() {
        //第一次现实的数据
        startUrl(UrlAll(1));
        //绑定的是依赖提供的adapter   这个必须写在这里写在其他地方就会崩
        lr.setAdapter(lRAdapter);


        //增加头尾布局
        View view = getLayoutInflater().inflate(R.layout.demo_lr_head , null);
        ImageView iv = (ImageView) view.findViewById(R.id.demo_lr_head_iv);
        Picasso.with(this).load(urlPic).into(iv);
        //是依赖提供的适配器接头尾布局
        lRAdapter.addHeaderView(view);

        //刷新
        lr.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                //防止数据重复
                myAdapter.clean();
                startUrl(UrlAll(1));
                //刷新  LRecycleView
                lr.refreshComplete();
            }
        });
        //加载
        lr.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                startUrl(UrlAll(++i));
            }
        });
        //点击事件
        lRAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int i) {
                Toast.makeText(DemoLRecycleView.this, "短按", Toast.LENGTH_SHORT).show();
            }
        });
        lRAdapter.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public void onItemLongClick(View view, int i) {
                Toast.makeText(DemoLRecycleView.this, "长按", Toast.LENGTH_SHORT).show();
            }
        });


    }








    //提取出来的第一次没加载没刷新
    private void startUrl(String url) {
        NetHelper.MyRequest(url, DemoLR.class, new NetListener<DemoLR>() {
            @Override
            public void successListener(DemoLR response) {
                myAdapter.setData(response);
                //这两行必须必须写在  这里面   lr绑定适配器写在这个后面
                LinearLayoutManager manager = new LinearLayoutManager(DemoLRecycleView.this ,
                        LinearLayoutManager.VERTICAL , false);
                lr.setLayoutManager(manager);

            }
            @Override
            public void errorListener(VolleyError error) {

            }
        });
    }

    //自己写的方法  用来拼接加载的网站
    public String UrlAll(int i){
        return "http://food.boohee.com/fb/v1/foods?kind=group&value=2&order_by=2&page="
                + i + "&order_asc=0";
    }

}
