package com.example.edward.analisis_clinico;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import java.io.IOException;

public class Inicio extends ActionBarActivity {
    DBHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        DBHelper dbHelper= new DBHelper(this, "analisis_clinico_bd.db", null, 1);
        dbhelper = new DBHelper(this, "analisis_clinico_bd.db", null, 1);
        try {
            dbhelper.createDataBase();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void lanzarMenu(View view){
        Intent i = new Intent(this,Seleccion.class);
        startActivity(i);
    }
    public void lanzarInformacion(View view){
        Intent i = new Intent(this,Informacion.class);
        startActivity(i);
    }

    public void lanzarLogin(View view){
        Intent i = new Intent(this,Login.class);
        startActivity(i);
    }
}
