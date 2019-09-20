package com.example.thebookstore2019_09_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.GridView;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_category extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments

        View view = inflater.inflate(R.layout.fragment_category, container, false);

        ImageButton ib1 = view.findViewById(R.id.imageButton1);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Comic.class));
            }
        });

        ImageButton ib2 = view.findViewById(R.id.imageButton2);
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Crime.class));
            }
        });

        ImageButton ib3 = view.findViewById(R.id.imageButton3);
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Horror.class));
            }
        });

        ImageButton ib4 = view.findViewById(R.id.imageButton4);
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DetectiveStory.class));
            }
        });

        ImageButton ib5 =view.findViewById(R.id.imageButton5);
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Adventures.class));
            }
        });

        ImageButton ib6 =view.findViewById(R.id.imageButton6);
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Drama.class));
            }
        });

        ImageButton ib7 =view.findViewById(R.id.imageButton7);
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Fantasy.class));
            }
        });

        ImageButton ib8 =view.findViewById(R.id.imageButton8);
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Mystery.class));
            }
        });

        ImageButton ib9 =view.findViewById(R.id.imageButton9);
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Romance.class));
            }
        });

        ImageButton ib10 =view.findViewById(R.id.imageButton10);
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ScienceFiction.class));
            }
        });

        ImageButton ib11 =view.findViewById(R.id.imageButton11);
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Thriller.class));
            }
        });

        ImageButton ib12 =view.findViewById(R.id.imageButton12);
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Westerns.class));
            }
        });

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Categories");
        
    }
}