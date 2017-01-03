package com.example.dllo.notestudio.DemoLSAdapterRefresh;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.VolleyError;
import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetHelper;
import com.example.dllo.notestudio.Tool.VolleyTwicePackge.NetListener;

/**
 * Created by dllo on 16/12/9.
 */
//  instanceof  方法
public class DemoLSAdapterFereshActivity extends BaseActivity {
    private ListView ls ;
    private DemoLSAdapterFereshAdapter myAdapter ;

    private BeanDemoLSAdapterFeresh  data ;

    @Override
    public int setMyLayout() {
        return R.layout.demo_ls_refresh;

    }

    @Override
    public void initMyView() {
        ls = (ListView) findViewById(R.id.demo_lsrefresh_ls);
        myAdapter = new DemoLSAdapterFereshAdapter(this);
        data = new BeanDemoLSAdapterFeresh();
    }

    @Override
    public void initMyData() {
        initBaseData();

        //点击删除指定一行
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(DemoLSAdapterFereshActivity.this, "删除了第 " + i + "行数据", Toast.LENGTH_SHORT).show();

                data.getData().remove(i);

                myAdapter.notifyDataSetChanged();


            }
        });


    }

    private void initBaseData() {
        String url = "http://new.yohoboys.com/yohoboyins/v5/channel/aggregationIndex";
        NetHelper.MyRequest(url, BeanDemoLSAdapterFeresh.class, new NetListener<BeanDemoLSAdapterFeresh>() {
            @Override
            public void successListener(BeanDemoLSAdapterFeresh response) {

                data = response ;

                myAdapter.setData(response);
                ls.setAdapter(myAdapter);

            }

            @Override
            public void errorListener(VolleyError error) {

            }
        });
    }
}
