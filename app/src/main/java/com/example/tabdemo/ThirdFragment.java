package com.example.tabdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {
ListView listView;
String s3[]={"abc@gmail.com","monet@ghvhg","fg@hjj","ashmar@ghbhb","abc@gmail.com","monet@ghvhg","fg@hjj","ashmar@ghbhb","abc@gmail.com","monet@ghvhg","fg@hjj","ashmar@ghbhb","abc@gmail.com","monet@ghvhg","fg@hjj","ashmar@ghbhb"};
    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_third, container, false);
       listView=view.findViewById(R.id.l3);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(),R.layout.items3,R.id.t13,s3);
        listView.setAdapter(arrayAdapter);
       return view;
    }

}
