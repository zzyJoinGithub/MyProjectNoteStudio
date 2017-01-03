package com.example.dllo.notestudio.DemoAnim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

import com.example.dllo.notestudio.BaseActivity;
import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/7.
 */


public class DemoBaseAnim extends BaseActivity {
    private ImageView iv , ivAnimList;


    @Override
    public int setMyLayout() {
        return R.layout.demo_base_anim;
    }

    @Override
    public void initMyView() {
        iv = (ImageView) findViewById(R.id.demo_base_anim);
        ivAnimList = (ImageView) findViewById(R.id.demo_base_anim2);
    }

    @Override
    public void initMyData() {
        //动画集合  可以实现很多动画一起实现
        AnimatorSet set = new AnimatorSet();
        set.playTogether(
                //透明度
                ObjectAnimator.ofFloat(iv, "alpha", 1, 0, 1, 0, 1, 0, 1),
                //旋转
                ObjectAnimator.ofFloat(iv, "rotation", 0, 180, 0, 180, 0, 180, 0),
                //翻转
                ObjectAnimator.ofFloat(iv, "rotationX", 0, 180, 0, 180, 0, 180, 0),
                //平移
                ObjectAnimator.ofFloat(iv, "translationX", 0, 270, 0, 270, 0, 270, 0),
                //拉伸
                ObjectAnimator.ofFloat(iv , "scaleX" , 0,3,0,2,0,3,1)
        );
        set.setDuration(2000).start();

        //设置帧动画   动图
        ivAnimList.setImageResource(R.drawable.demo_base_anim_list);
        AnimationDrawable anim = (AnimationDrawable) ivAnimList.getDrawable();
        anim.start();




    }
}
