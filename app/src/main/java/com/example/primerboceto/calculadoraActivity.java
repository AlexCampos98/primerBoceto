package com.example.primerboceto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class calculadoraActivity extends AppCompatActivity {

    private EditText etNumero1;
    private EditText etNumero2;
    private TextView tvResultado;
    private RadioGroup rbGrupoOperacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Toolbar toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2 = findViewById(R.id.etNumero2);
        tvResultado = findViewById(R.id.tvResultado);
        //rbGrupoOperacion = (RadioGroup) findViewById(R.id.rbGrupoOperacion);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //Obtencion del identificador de la opcion escogida en el actionBar.
        int id = item.getItemId();

        //Creacion de la variable de cambio de actividad.
        Intent i = new Intent();

        //Filtro de inicio de una de las actividades seleccionadas.
        if (id == R.id.ofCalculadora) {
            i = new Intent(this, calculadoraActivity.class);
        } else if (id == R.id.ofRegistrarse) {
            i = new Intent(this, registroActivity.class);
        } else if (id == R.id.ofCerrarSesion) {
            i = new Intent(this, loginActivity.class);
        }
        startActivity(i);

        return true;
    }

    //Metodos de la calculadora
    public void operacion(View v) {
        String valor1 = etNumero1.getText().toString();
        String valor2 = etNumero2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        float resultado=0;

        switch (rbGrupoOperacion.getCheckedRadioButtonId()){
            case R.id.rbSumar:
                resultado = numero1 + numero2;
                break;
            case R.id.rbRestar:
                resultado = numero1 - numero2;
                break;
            case R.id.rbMultiplicar:
                resultado = numero1 * numero2;
                break;
            case R.id.rbDividir:
                //resultado = numero1 / numero2;
                break;
        }
        String sResultado = String.valueOf(resultado);
        tvResultado.setText(sResultado);
    }
}