package com.gt.dev.lazaro.encuestador.vista.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.gt.dev.lazaro.encuestador.R;

public class PresetActivity extends AppCompatActivity {

    private String presetName;
    private Integer layoutInflate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        presetName = bundle.getString("llave");
        layoutInflate = bundle.getInt("key");
        getSupportActionBar().setTitle(presetName);
        setContentView(layoutInflate);

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
