package com.example.seri.newpojo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;


public class Adapter extends BaseAdapter {

    private ArrayList<DataModel> PlayList;
    private Context context;

    public Adapter(ArrayList<DataModel> PlayList, Context context) {
        this.PlayList = PlayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return PlayList.size();
    }

    @Override
    public Object getItem(int i) {
        return PlayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return PlayList.get(i).hashCode();
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        DataModel data = PlayList.get(i);

        LayoutInflater inflate = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflate.inflate(R.layout.list, viewGroup, false);

        TextView pnameView = view.findViewById(R.id.PlayName);
        pnameView.setText(data.getPname());
        TextView snameView = view.findViewById(R.id.Name);
        snameView.setText(data.getSname());
        return view;
    }


}
