package com.gt.dev.lazaro.encuestador.vista.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.gt.dev.lazaro.encuestador.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BurdelActivity extends AppCompatActivity {

    private int positionXML;
    private String toolbarName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();
        positionXML = bundle.getInt("llave");
        toolbarName = bundle.getString("string");
        setContentView(positionXML);
        getSupportActionBar().setTitle(toolbarName);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OnClick(R.id.btnAgregarPregunta)
    void botonListener() {
        Button myButton = new Button(this);
        myButton.setText("pruebas");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearlayoutForButton);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayout.addView(myButton, layoutParams);
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
