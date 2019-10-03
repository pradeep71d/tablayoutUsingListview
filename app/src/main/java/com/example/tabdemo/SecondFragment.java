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
public class SecondFragment extends Fragment {

ListView listView;
String s2[]={"6556","56768","57676","4556465","4648722","446578"};

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);
        listView=view.findViewById(R.id.l2);
        ArrayAdapter arrayAdapter=new ArrayAdapter(getActivity(),R.layout.item2,R.id.t2,s2);
        listView.setAdapter(arrayAdapter);
        return view;
    }

}
