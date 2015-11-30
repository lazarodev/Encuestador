package com.gt.dev.lazaro.encuestador.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gt.dev.lazaro.encuestador.R;

import java.util.ArrayList;

/**
 * Created by root on 25/11/15.
 */
public class NewAdapter extends BaseAdapter {

    private ArrayList<NewCategory> newCategories;
    LayoutInflater inflater;
    Context context;

    public NewAdapter(ArrayList<NewCategory> cat, Context con) {
        this.newCategories = cat;
        inflater = LayoutInflater.from(con);
        this.context = con;
    }

    @Override
    public int getCount() {
        return newCategories.size();
    }

    @Override
    public Object getItem(int position) {
        return newCategories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.cardview_new_adapter, null);
        NewCategory cat = newCategories.get(position);
        TextView title = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView subTitle = (TextView) convertView.findViewById(R.id.tvSubTitle);

        title.setText(cat.getTitleNew());
        subTitle.setText(cat.getSubtitleNew());

        return convertView;
    }
}
