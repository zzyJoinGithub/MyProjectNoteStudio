package com.example.dllo.notestudio.Demolsdiffitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.notestudio.R;

import java.util.ArrayList;

/**
 * Created by dllo on 16/12/2.
 */

public class DemoLSDifAdapter extends BaseAdapter {
    private ArrayList<String> data;
    private Context context ;
    //不同type值相加总数不能大于总count值
    public static final int TYPEONE = 0 ;
    public static final int TYPETWO = 1 ;
    public static final int TYPECOUNT = 2 ;


    public DemoLSDifAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    //不同行布局复写的方法
    @Override
    public int getViewTypeCount() {
        return TYPECOUNT;
    }

    @Override
    public int getItemViewType(int position) {
        if (position%2 == 0){
            return TYPEONE;
        }else {
            return TYPETWO;
        }
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderOne holderOne = null ;
        ViewHolderTwo holderTwo = null ;
        if (view == null){
            switch (getItemViewType(i)){
                case TYPEONE:
                    view = LayoutInflater.from(context).inflate(R.layout.demo_ls_dif_ietmone,viewGroup,false);
                    holderOne = new ViewHolderOne(view);
                    view.setTag(holderOne);
                    break;
                case TYPETWO:
                    view = LayoutInflater.from(context).inflate(R.layout.demo_ls_dif_ietmtwo,viewGroup,false);
                    holderTwo = new ViewHolderTwo(view);
                    view.setTag(holderTwo);
                    break;
            }
        }else {
            switch (getItemViewType(i)){
                case TYPEONE:
                    holderOne = (ViewHolderOne) view.getTag();
                    break;
                case TYPETWO:
                    holderTwo = (ViewHolderTwo) view.getTag();
                    break;
            }
        }
        switch (getItemViewType(i)){
            case TYPEONE:
                holderOne.tv1.setText(data.get(i));
                break;
            case TYPETWO:
                holderTwo.tv2.setText(data.get(i));
                break;
        }


        return view;
    }

    class ViewHolderOne {
        private TextView tv1 ;
        public ViewHolderOne(View view) {
            tv1 = (TextView) view.findViewById(R.id.demo_ls_dif_tv1);
        }
    }
    class ViewHolderTwo {
        private TextView tv2 ;
        public ViewHolderTwo(View view) {
            tv2 = (TextView) view.findViewById(R.id.demo_ls_dif_tv2);
        }
    }

}
