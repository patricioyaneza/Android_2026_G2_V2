package com.example.proyecto01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button btnBienvenida = view.findViewById(R.id.btnBienvenida);

        btnBienvenida.setOnClickListener(view1 -> {
            Toast.makeText(getActivity(), "Bienvenido usuario", Toast.LENGTH_LONG).show();
        });
    }
}