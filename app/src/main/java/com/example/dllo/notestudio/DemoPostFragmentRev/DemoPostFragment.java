package com.example.dllo.notestudio.DemoPostFragmentRev;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.example.dllo.notestudio.BaseFragment;
import com.example.dllo.notestudio.R;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetHelper;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetListener;

import java.util.HashMap;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoPostFragment extends BaseFragment {
    private ListView ls;
    private DemoPostFragmentAdapter myAdapter;

    @Override
    public int setMyLayout() {
        return R.layout.demo_post_fragment;
    }

    @Override
    protected void initMyView(View view) {
        ls = (ListView) view.findViewById(R.id.demo_post_fr_ls);
        myAdapter = new DemoPostFragmentAdapter(getContext());
    }

    @Override
    protected void initMyData() {
        //新建Bundle 接收值
        Bundle bundle = getArguments();
        String msg = bundle.get("key").toString();
        //新建Post需要的Map
        HashMap<String, String> data = new HashMap<>();
        //自己写的类,里面的body题都一样就有一个id不一样单独拿出来
        DemoPostBody post = new DemoPostBody();
        //传入id
        post.setChannelId(msg);
        //传入整个key valley
        data.put("parameters", post.m(post));
        String urlFr = "http://new.yohoboys.com/yohoboyins/v5/channel/contentList";
        NetHelper.MyRequest(urlFr, BeanPostFragment.class, new NetListener<BeanPostFragment>() {
            @Override
            public void successListener(BeanPostFragment response) {
                myAdapter.setBean(response);
                ls.setAdapter(myAdapter);
            }

            @Override
            public void errorListener(VolleyError error) {

            }
            //这里要写自己封装的第三个参数
        },data);


    }

    public static DemoPostFragment newInstance(int pos) {

        Bundle args = new Bundle();
        //新写两行把tab适配器的id传到fragment里面
        String message = DemoPostActivityMyAdapter.getMessage(pos);
        args.putString("key", message);

        DemoPostFragment fragment = new DemoPostFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
