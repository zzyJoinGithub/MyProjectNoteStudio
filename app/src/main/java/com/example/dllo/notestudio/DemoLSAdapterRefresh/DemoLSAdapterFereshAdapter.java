package com.example.dllo.notestudio.DemoLSAdapterRefresh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.notestudio.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/9.
 */

public class DemoLSAdapterFereshAdapter extends BaseAdapter {
    private BeanDemoLSAdapterFeresh data ;
    private Context context ;

    public DemoLSAdapterFereshAdapter(Context context) {
        this.context = context;
    }



    public void setData(BeanDemoLSAdapterFeresh data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.getData().size();
    }

    @Override
    public Object getItem(int i) {
        return data.getData().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null ;
        if (view == null ){
            view = LayoutInflater.from(context).inflate(R.layout.demo_ls_refresh_items,viewGroup,false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.tv.setText(data.getData().get(i).getSummary());
        return view;
    }

    class ViewHolder {
        private TextView tv ;
        public ViewHolder(View view) {
            tv = (TextView) view.findViewById(R.id.lsrefresh_item_tv);
        }
    }

}
