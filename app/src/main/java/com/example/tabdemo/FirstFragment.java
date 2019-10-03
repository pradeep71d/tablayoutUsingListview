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
public class FirstFragment extends Fragment {
    String s1[]={"Monet","Ashamar","concentrix","maruti","honda","Monet","Ashamar","concentrix","maruti","honda","Monet","Ashamar","concentrix","maruti","honda","Monet","Ashamar","concentrix","maruti","honda"};
    ListView listView;
    public FirstFragment() {
        // Required empty public constructo

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view=inflater.inflate(R.layout.fragment_first, container, false);
       listView= view.findViewById(R.id.l1);
       ArrayAdapter arrayAdapter= new ArrayAdapter(getActivity(),R.layout.item,R.id.textview,s1);
       listView.setAdapter(arrayAdapter);
       return  view;
    }


}
