package com.gt.dev.lazaro.encuestador.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gt.dev.lazaro.encuestador.R;
import com.gt.dev.lazaro.encuestador.vista.fragmentos.Tab1;

import java.util.ArrayList;

/**
 * Created by root on 24/11/15.
 */
public class Tab1Adapter extends BaseAdapter {

    private ArrayList<Tab1Category> tab1Categories;
    LayoutInflater inflater;
    Context context;

    public Tab1Adapter(ArrayList<Tab1Category> cat, Context con) {
        this.tab1Categories = cat;
        inflater = LayoutInflater.from(con);
        this.context = con;
    }

    @Override
    public int getCount() {
        return tab1Categories.size();
    }

    @Override
    public Object getItem(int position) {
        return tab1Categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.cardview_list_adapter, null);
        Tab1Category cat = tab1Categories.get(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ivCardView);
        TextView title = (TextView) convertView.findViewById(R.id.tvTitulo);

        imageView.setBackgroundDrawable(context.getResources().getDrawable(cat.getPicture()));
        title.setText(cat.getTitle());
        return convertView;
    }
}
