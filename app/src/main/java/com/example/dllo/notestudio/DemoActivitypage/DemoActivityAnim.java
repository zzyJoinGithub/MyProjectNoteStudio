package com.example.dllo.notestudio.DemoActivitypage;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.MainActivity;
import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/3.
 */

public class DemoActivityAnim extends BaseActivity {
    private Button btn1 ;
    @Override
    public int setMyLayout() {
        return R.layout.demo_activity_anim;

    }

    @Override
    public void initMyView() {
        btn1 = (Button) findViewById(R.id.demo_aty_anim);
    }

    @Override
    public void initMyData() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DemoActivityAnim.this , MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.activitycome_anim , R.anim.activitygo_anim );
            }
        });
    }
}
