package com.example.dllo.notestudio.Demolsdiffitem;

import android.widget.ListView;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoLSDiffItemActivity extends BaseActivity {
    private ListView ls ;
    private DemoLSDifAdapter myAdapter ;
    private ArrayList<String> data ;

    @Override
    public int setMyLayout() {
        return R.layout.demo_ls_dif;
    }

    @Override
    public void initMyView() {
        ls = (ListView) findViewById(R.id.demo_dif_ls);
        myAdapter = new DemoLSDifAdapter(this);
        data = new ArrayList<>();
    }

    @Override
    public void initMyData() {
        for (int i = 0; i < 50; i++) {
            data.add(""+(i+1));
        }
        myAdapter.setData(data);
        ls.setAdapter(myAdapter);
    }
}
