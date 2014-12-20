package com.example.edward.analisis_clinico;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import com.example.edward.analisis_clinico.R;

public class Seleccion extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);
    }


   public void lanzarAreaGeneral(View view){
       Intent i = new Intent(this,AreaGeneralLayout.class);
       startActivity(i);
   }
    public void lanzarEspecialistaPrincipal(View view){
        Intent i = new Intent(this,EspecialistaPrincipal.class);
        startActivity(i);
    }
    public void lanzarCostoAnalisis(View view){
        Intent i = new Intent(this,Costo_Analisis.class);
        startActivity(i);
    }
    public void lanzarListaAnalisis(View view){
        Intent i = new Intent(this,Lista_Analisis.class);
        startActivity(i);
    }
}
