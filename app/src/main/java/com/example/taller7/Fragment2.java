package com.example.taller7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import static android.content.ContentValues.TAG;


public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        setupUI(view);

        return view;

        //return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    private void setupUI(final View view) {

        FloatingActionButton btnNext = (FloatingActionButton)view.findViewById(R.id.btnNext2);
       // final TextInputEditText editText =(TextInputEditText) view.findViewById(R.id.editText);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Button fragment_2 clicked");


               // String context = editText.getText().toString();
                //SecondFragment

                Navigation.findNavController(view).navigate(R.id.frag2tutu);// id of the action
            }
        });

    }

}
