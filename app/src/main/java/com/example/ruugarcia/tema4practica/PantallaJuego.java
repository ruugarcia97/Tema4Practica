package com.example.ruugarcia.tema4practica;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class PantallaJuego extends AppCompatActivity {

    Map<String, String> Resultado = new HashMap<>();


    FragmentPaises fPais;
    FragmentCiudades fCiudad;
    TextView txtJuego1, txtJuego2;
    ImageView resultadoImagen;
    Button btnJugar;


    public boolean ciudadClicked, paisClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        setTitle("Juego de aciertos");



        Resultado.put(getString(R.string.espana), getString(R.string.madrid));
        Resultado.put(getString(R.string.francia), getString(R.string.paris));
        Resultado.put(getString(R.string.reinounido), getString(R.string.londres));
        Resultado.put(getString(R.string.alemania), getString(R.string.berlin));
        Resultado.put(getString(R.string.grecia), getString(R.string.atenas));
        Resultado.put(getString(R.string.japon), getString(R.string.tokio));
        Resultado.put(getString(R.string.republicaArgentina), getString(R.string.buenosaires));
        Resultado.put(getString(R.string.argelia), getString(R.string.argel));



        txtJuego1 = findViewById(R.id.txtJuego1);
        txtJuego2 = findViewById(R.id.txtJuego2);
        btnJugar = findViewById(R.id.btnJugar);
        resultadoImagen = findViewById(R.id.resultadoImagen);
        resultadoImagen.setVisibility(View.INVISIBLE);


        fPais = (FragmentPaises) getFragmentManager().findFragmentById(R.id.fragmentPaises);
        fCiudad = (FragmentCiudades) getFragmentManager().findFragmentById(R.id.fragmentCiudades);

        
        ciudadClicked = false;
        fCiudad.lstCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtJuego1.setText(fCiudad.aCiudades.getItem(position));
                ciudadClicked = true;
            }
        });

        paisClicked = false;
        fPais.lstPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtJuego2.setText(fPais.aPais.getItem(position));
                paisClicked = true;
            }
        });

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                if (ciudadClicked && paisClicked) {
                    resultadoImagen.setVisibility(View.VISIBLE);
                    if (RespuestaJuego(txtJuego2.getText().toString(),
                            txtJuego1.getText().toString())) {
                        resultadoImagen.setImageDrawable(getDrawable(R.drawable.bien));
                    } else {
                        resultadoImagen.setImageDrawable(getDrawable(R.drawable.mal));
                    }
                }
            }
        });
    }
    private boolean RespuestaJuego(String pais, String ciudad) {
        return this.Resultado.get(pais).equals(ciudad);
    }

}
