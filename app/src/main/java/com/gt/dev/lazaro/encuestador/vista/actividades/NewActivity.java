package com.gt.dev.lazaro.encuestador.vista.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gt.dev.lazaro.encuestador.R;
import com.gt.dev.lazaro.encuestador.adaptadores.NewAdapter;
import com.gt.dev.lazaro.encuestador.adaptadores.NewCategory;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NewActivity extends AppCompatActivity {

    @Bind(R.id.lvNewActivity)
    ListView lista;
    private ArrayList<NewCategory> newCategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        ButterKnife.bind(this);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle("Seleccione");
        instanceVars();
    }

    private void instanceVars() {
        newCategories = new ArrayList<>();

        newCategories.add(new NewCategory("Encuesta de opción multiple", "Este tipo de encuestas son de respuesta cerrada"));
        newCategories.add(new NewCategory("Encuesta con justificación", "Este tipo de encuestas son de respuesta abierta"));
        newCategories.add(new NewCategory("Encuesta Verdad o mentira", "Este tipo de encuestas son de respuesta verdadero o falso"));

        NewAdapter adapter = new NewAdapter(newCategories, NewActivity.this);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Bundle bundle = new Bundle();
                        bundle.putInt("llave", R.layout.inflate_multi);
                        bundle.putString("string", "Opción multiple");

                        Intent intent = new Intent(NewActivity.this, BurdelActivity.class);
                        intent.putExtras(bundle);
                        startActivity(intent);

                        break;
                    case 1:

                        Bundle bundle1 = new Bundle();
                        bundle1.putInt("llave", R.layout.inflate_justi);
                        bundle1.putString("string", "Justificación");

                        Intent intent1 = new Intent(NewActivity.this, BurdelActivity.class);
                        intent1.putExtras(bundle1);
                        startActivity(intent1);

                        break;

                    case 2:

                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("llave", R.layout.inflate_boolean);
                        bundle2.putString("string", "Verdadero o falso");

                        Intent intent2 = new Intent(NewActivity.this, BurdelActivity.class);
                        intent2.putExtras(bundle2);
                        startActivity(intent2);

                        break;
                }


            }
        });
    }
}
