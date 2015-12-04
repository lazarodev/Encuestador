package com.gt.dev.lazaro.encuestador.vista.actividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.gt.dev.lazaro.encuestador.R;
import com.gt.dev.lazaro.encuestador.adaptadores.ViewPagerAdapter;
import com.gt.dev.lazaro.encuestador.utilidades.SlidingTabLayout;

import butterknife.Bind;
import butterknife.BindColor;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    ViewPagerAdapter adapter;
    CharSequence Titles[] = {"Plantillas", "Recientes"};
    private int Numboftabs = 2;

    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.pager)
    ViewPager pager;
    @Bind(R.id.tabs)
    SlidingTabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        instanceVars();
    }

    private void instanceVars() {
        adapter = new ViewPagerAdapter(getSupportFragmentManager(), Titles, Numboftabs);
        pager.setAdapter(adapter);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
                                       @Override
                                       public int getIndicatorColor(int position) {
                                           return getResources().getColor(R.color.colorAccent);
                                       }
                                   }
        );
        tabs.setViewPager(pager);
    }

    @OnClick(R.id.fab)
    void fabListener(View view) {
        //Snackbar.make(view, getString(R.string.app_name), Snackbar.LENGTH_SHORT).show();
        startActivity(new Intent(Main2Activity.this, NewActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.btnDownload:
                Toast.makeText(Main2Activity.this, "Download", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
