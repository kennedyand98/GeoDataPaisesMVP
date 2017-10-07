package br.usjt.desmob.geodata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.io.IOException;

public class MainActivity extends Activity {
    Spinner spinnerContinente;
    public static final String CHAVE = "br.usjt.desmob.geodata.txtContinente";
    String continente = "Todos";
    public static final String URL = "https://restcountries.eu/rest/v2/all";
    public static final String PAISES = "br.usjt.desmob.geodata.paises";
    Pais[] paises;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerContinente = (Spinner) findViewById(R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());
    }

    public void listarPaises(View view) {
        intent = new Intent(this, ListaPaisesActivity.class);
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            paises = GeoDataNetwork.buscarPaises(URL, CHAVE);
                            intent.putExtra(PAISES, paises);
                            startActivity(intent);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();

    }

    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
