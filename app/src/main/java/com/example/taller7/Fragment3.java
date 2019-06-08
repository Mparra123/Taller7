package com.example.taller7;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.navigation.Navigation;

import static android.content.ContentValues.TAG;


public class Fragment3 extends Fragment {


    public Fragment3() {
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
        //return inflater.inflate(R.layout.fragment_fragment3, container, false);

        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        setupUI(view);

        return view;
    }

    private void setupUI(final View view) {
        TextView receivedText = view.findViewById(R.id.frag3);


       // String message = arg.getMessage();
        //receivedText.setText(message);

    }

}
