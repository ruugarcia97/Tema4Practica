package com.example.ruugarcia.tema4practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular,btnJuego, btnImagenenDes, btnImagenenSel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnCalcular = findViewById(R.id.btnCalcular);
    btnJuego = findViewById(R.id.btnJuego);
    btnImagenenDes = findViewById(R.id.btnImagenenDes);
    btnImagenenSel = findViewById(R.id.btnImagenenSel);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int1 = new Intent(v.getContext(), PantallaCalcularPrimos.class);
            startActivity(int1);
        }
    });

      btnJuego.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int2 = new Intent(v.getContext(), PantallaJuego.class);
            startActivity(int2);
        }
    });

        btnImagenenDes.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int3 = new Intent(v.getContext(), FragmentDesplazaImg.class);
            startActivity(int3);
        }
    });

        btnImagenenSel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent int4 = new Intent(v.getContext(), SeleccionaImg.class);
            startActivity(int4);
        }
    });
}
}


