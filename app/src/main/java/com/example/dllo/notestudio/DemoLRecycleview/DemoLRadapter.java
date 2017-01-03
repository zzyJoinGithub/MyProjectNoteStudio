package com.example.dllo.notestudio.DemoLRecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dllo.notestudio.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/7.
 */

public class DemoLRadapter extends RecyclerView.Adapter<DemoLRadapter.MyViewHolder> {
    private DemoLR data ;
    private Context context ;

    public DemoLRadapter(Context context) {
        this.context = context;
        //这里初始化data
        data = new DemoLR();
    }

    public void setData(DemoLR data) {
        this.data = data;
        notifyDataSetChanged();
    }

    //自己写的方法,防止刷新重复
    public void clean () {
        data.getFoods().clear();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.demo_lr_items , parent ,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(data.getFoods().get(position).getName());
    }

    @Override
    public int getItemCount() {
        return data.getFoods().size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv ;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.demo_lr_item_tv);
        }
    }

}
