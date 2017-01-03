package com.example.dllo.notestudio.DemoPostFragmentRev;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.notestudio.R;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoPostFragmentAdapter extends BaseAdapter {
    private BeanPostFragment data;
    private Context context;

    public DemoPostFragmentAdapter(Context context) {
        this.context = context;
    }

    public void setBean(BeanPostFragment bean) {
        this.data = bean;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return data.getData().getContent().size();
    }

    @Override
    public Object getItem(int i) {
        return data.getData().getContent().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null ;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.demo_post_fragment_ls_item,viewGroup,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv1.setText(data.getData().getContent().get(i).getTitle());


        return view;
    }


    class ViewHolder {
        private TextView tv1 ;
        public ViewHolder(View view) {
            tv1 = (TextView) view.findViewById(R.id.demo_post_fr_ls_tv);
        }
    }

}
