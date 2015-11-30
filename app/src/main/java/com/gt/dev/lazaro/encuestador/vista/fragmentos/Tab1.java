package com.gt.dev.lazaro.encuestador.vista.fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.gt.dev.lazaro.encuestador.R;
import com.gt.dev.lazaro.encuestador.adaptadores.Tab1Adapter;
import com.gt.dev.lazaro.encuestador.adaptadores.Tab1Category;
import com.gt.dev.lazaro.encuestador.vista.actividades.PresetActivity;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by root on 24/11/15.
 */
public class Tab1 extends Fragment {

    private ArrayList<Tab1Category> tab1Categories;
    @Bind(R.id.lvTab1)
    ListView lista;
    //private ListView lista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ButterKnife.bind(Tab1.this.getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
        ButterKnife.bind(this, v);
        //lista = (ListView) v.findViewById(R.id.lvTab1);
        tab1Categories = new ArrayList<>();

        tab1Categories.add(new Tab1Category("Deportivo", R.drawable.building));
        tab1Categories.add(new Tab1Category("Video Juegos", R.drawable.building));
        tab1Categories.add(new Tab1Category("Concierto", R.drawable.building));
        tab1Categories.add(new Tab1Category("Restaurante", R.drawable.building));
        tab1Categories.add(new Tab1Category("Personal docente", R.drawable.building));
        tab1Categories.add(new Tab1Category("Super mercado", R.drawable.building));
        Tab1Adapter adapter = new Tab1Adapter(tab1Categories, Tab1.this.getActivity());
        lista.setAdapter(adapter);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*Tab1Category tab1Category = (Tab1Category) parent.getItemAtPosition(position);
                Bundle bundle = new Bundle();
                bundle.putString("llave", tab1Category.getTitle());
                Intent intent = new Intent(getActivity(), PresetActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
                //Toast.makeText(Tab1.this.getActivity(), "" + position, Toast.LENGTH_SHORT).show();*/
                switch (position) {
                    case 0:
                        Tab1Category depor = (Tab1Category) parent.getItemAtPosition(position);
                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("key", R.layout.inflate_deportivo);
                        bundle1.putString("llave", depor.getTitle());
                        Intent intent1 = new Intent(getActivity(), PresetActivity.class);
                        intent1.putExtras(bundle1);
                        startActivity(intent1);
                        break;
                    case 1:

                        Tab1Category juegos = (Tab1Category) parent.getItemAtPosition(position);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("key", R.layout.inflate_videogames);
                        bundle2.putString("llave", juegos.getTitle());
                        Intent intent2 = new Intent(getActivity(), PresetActivity.class);
                        intent2.putExtras(bundle2);
                        startActivity(intent2);
                        break;
                }
            }
        });


        return v;
    }
}
