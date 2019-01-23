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


public class FragmentPaises extends android.app.Fragment {

    private String[] Paises;
    ArrayAdapter<String> aPais;
    public ListView lstPaises;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_paises, container, false);


        Paises = new String[] {getResources().getString(R.string.espana),
                getResources().getString(R.string.francia), getResources().getString(R.string.reinounido), getResources().getString(R.string.alemania),
                getResources().getString(R.string.argelia),getResources().getString(R.string.japon),
                getResources().getString(R.string.grecia), getResources().getString(R.string.republicaArgentina)};





        List<String> lstPaises1 = Arrays.asList(Paises);
        Collections.shuffle(lstPaises1);
        aPais = new ArrayAdapter<String>(this.getActivity() , android.R.layout.simple_list_item_1 , lstPaises1);
        lstPaises = view.findViewById(R.id.lstPaises);
        lstPaises.setAdapter(aPais);
        return view;
    }



}
