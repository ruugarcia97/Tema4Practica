package com.example.ruugarcia.tema4practica;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FragmentCiudades extends android.app.Fragment {

    private String[] ciudad;
    ArrayAdapter<String> aCiudades;
    public ListView lstCiudades;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_ciudades, container, false);
        ciudad = new String[] {
                getResources().getString(R.string.alemania),
                getResources().getString(R.string.argel),
                getResources().getString(R.string.madrid),
                getResources().getString(R.string.paris),
                getResources().getString(R.string.londres),
                getResources().getString(R.string.buenosaires),
                getResources().getString(R.string.tokio),
                getResources().getString(R.string.atenas),
                getResources().getString(R.string.berlin)};


        List<String> lstCiudades1 =  Arrays.asList(ciudad);
        Collections.shuffle(lstCiudades1);
        aCiudades = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , lstCiudades1);
        lstCiudades = view.findViewById(R.id.lstCiudades);
        lstCiudades.setAdapter(aCiudades);
        return view;
    }

}
