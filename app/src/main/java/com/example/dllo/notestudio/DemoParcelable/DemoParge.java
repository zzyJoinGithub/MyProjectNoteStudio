package com.example.dllo.notestudio.DemoParcelable;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/7.
 */

public class DemoParge extends BaseActivity {
    private Button btn ;
    private EditText et1 ,et2,et3;
    private int a;

    @Override
    public int setMyLayout() {
        return R.layout.demo_page;
    }

    @Override
    public void initMyView() {
        btn = (Button) findViewById(R.id.demo_parge_btn);
        et1 = (EditText) findViewById(R.id.demo_page_et1);
        et2 = (EditText) findViewById(R.id.demo_page_et2);
        et3 = (EditText) findViewById(R.id.demo_page_et3);
    }

    @Override
    public void initMyData() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DemoPargeBean bean = new DemoPargeBean();
                bean.setName(et1.getText().toString());
                bean.setAuthor(et2.getText().toString());

                String age = et3.getText().toString();
                try {
                    a = Integer.parseInt(age);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }


                bean.setAge(a);
                Intent intent = new Intent(DemoParge.this , DemoPargeSecond.class);
                intent.putExtra("kkey" , bean);
                startActivity(intent);
            }
        });
    }
}
