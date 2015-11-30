package com.gt.dev.lazaro.encuestador.vista.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.gt.dev.lazaro.encuestador.R;

import butterknife.Bind;

public class BurdelActivity extends AppCompatActivity {

    private int positionXML;
    private String toolbarName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        positionXML = bundle.getInt("llave");
        toolbarName = bundle.getString("string");
        setContentView(positionXML);
        getSupportActionBar().setTitle(toolbarName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
