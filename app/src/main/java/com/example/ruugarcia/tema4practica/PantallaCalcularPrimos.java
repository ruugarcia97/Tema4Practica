package com.example.ruugarcia.tema4practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PantallaCalcularPrimos extends AppCompatActivity {

    private EditText txtResultado;
    private Button btnComprobar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        setTitle("Números primos");


        txtResultado = findViewById(R.id.txtResultado);
        btnComprobar = findViewById(R.id.btnComprobar);
        lblResultado = findViewById(R.id.lblResultado);

        btnComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtResultado.getText().toString().isEmpty()) {
                    if (esPrimo(Integer.parseInt(txtResultado.getText().toString()))) {
                        lblResultado.setText("Es primo");
                    } else {
                        lblResultado.setText("No es primo");
                    }
                }
            }
        });
    }

    private boolean esPrimo(int numero){
        boolean resultado = true;
        int sqrtNumero = (int) Math.floor(Math.sqrt(numero));
        if ((numero & 1) > 0) { 
            for (int i = 3; i <= sqrtNumero; i+=2) { 
                if (numero%i == 0){
                    resultado = false;
                    break;
                }
            }
        } else {
            resultado = false; 
        }
        return resultado;
    }

}


