package com.example.dllo.notestudio.DemoDiaLogNet;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;
import com.wevey.selector.dialog.DialogOnClickListener;
import com.wevey.selector.dialog.DialogOnItemClickListener;
import com.wevey.selector.dialog.NormalAlertDialog;
import com.wevey.selector.dialog.NormalSelectionDialog;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/3.
 */

public class DemoDialog extends BaseActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5, btn6;


    @Override
    public int setMyLayout() {
        return R.layout.demo_netdialog;
    }

    @Override
    public void initMyView() {
        btn1 = (Button) findViewById(R.id.demo_diasty1);
        btn2 = (Button) findViewById(R.id.demo_diasty2);
        btn3 = (Button) findViewById(R.id.demo_diasty3);
        btn4 = (Button) findViewById(R.id.demo_diasty4);
        btn5 = (Button) findViewById(R.id.demo_diasty5);
        btn6 = (Button) findViewById(R.id.demo_diasty6);
    }

    @Override
    public void initMyData() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.demo_diasty1:
                NormalSelectionDialog.Builder builder1 = new NormalSelectionDialog.Builder(this);
                final NormalSelectionDialog dialog1 = new NormalSelectionDialog(builder1);
                //设置标题是否可见
                builder1.setlTitleVisible(true)
                        //设置标题高度
                        .setTitleHeight(60)
                        //设置标题文本
                        .setTitleText("标题文本")
                        //设置标题文本颜色
                        .setTitleTextColor(R.color.colorBule)
                        //这是内容的....好多item属性
                        .setTitleTextColor(R.color.colorPurple)
                        //设置底部取消文本
                        .setCancleButtonText("底部取消文本")
                        //设置监听   new D
                        .setOnItemListener(new DialogOnItemClickListener() {
                            @Override
                            public void onItemClick(Button button, int position) {
                                dialog1.dismiss();
                                Toast.makeText(DemoDialog.this, "点击了" + position, Toast.LENGTH_SHORT).show();
                            }
                        })
                        //设置点击其他地方取消dialog
                        .setCanceledOnTouchOutside(true)
                        //最后必须build
                        .build();
                        //最后最后必须show!!!!!!!!
                        dialog1.show();


                ArrayList<String> s1 = new ArrayList<>();
                s1.add("item1");
                s1.add("item2");
                s1.add("item3");
                s1.add("item4");
                s1.add("item5");
                dialog1.setDataList(s1);
                break;
            case R.id.demo_diasty2:
                NormalAlertDialog.Builder builder2 = new NormalAlertDialog.Builder(this);
                NormalAlertDialog dialog2 = new NormalAlertDialog(builder2);
                builder2.setHeight(0.23f)
                        .setHeight(0.65f)
                        .setTitleVisible(true)
                        .setTitleText("标题")
                        .setTitleTextColor(R.color.colorRed)
                        .setContentText("中间文本")
                        .setContentTextColor(R.color.colorPurple)
                        .setLeftButtonText("关闭")
                        .setRightButtonText("打开")
                        //设置左右点击事件
                        .setOnclickListener(new DialogOnClickListener() {
                            @Override
                            public void clickLeftButton(View view) {
                                Toast.makeText(DemoDialog.this, "1", Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void clickRightButton(View view) {
                                Toast.makeText(DemoDialog.this, "2", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .build();
                dialog2.show();
                break;
            case R.id.demo_diasty3:



                break;




        }
    }
}
