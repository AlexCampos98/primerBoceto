package com.example.primerboceto;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void opcionCalculadora(View v){
        Intent i = new Intent(this, calculadoraActivity.class);
        startActivity(i);
    }

    public void opcionPiePapTij(View v){
        Intent i = new Intent(this, calculadoraActivity.class);
        startActivity(i);
    }

    public void opcionCerrarSesion(View v){
        Intent i = new Intent(this, loginActivity.class);
        startActivity(i);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//
//        //Obtencion del identificador de la opcion escogida en el actionBar.
//        int id = item.getItemId();
//
//        //Creacion de la variable de cambio de actividad.
//        Intent i = new Intent();
//
//        //Filtro de inicio de una de las actividades seleccionadas.
//        if (id == R.id.ofCalculadora) {
//            i = new Intent(this, CalendarActivity.class);
//        } else if (id == R.id.ofPiePapTij) {
//            i = new Intent(this, CalendarActivity.class);
//        } else if (id == R.id.ofCerrarSesion) {
//            i = new Intent(this, CalendarActivity.class);
//        }
//        startActivity(i);
//
//        return true;
//    }

}