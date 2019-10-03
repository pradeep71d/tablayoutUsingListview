package com.example.tabdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TabLayout tabLayout;
    FrameLayout frameLayout;
    ListView listView;
   Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // textView=findViewById(R.id.t1);
        tabLayout = findViewById(R.id.tb);
        frameLayout = findViewById(R.id.f1);
        TabLayout.Tab firsttab = tabLayout.newTab();//creating tabs.
        TabLayout.Tab secondtab = tabLayout.newTab();
        TabLayout.Tab thirdtab = tabLayout.newTab();
        firsttab.setText("Name");// given name of tabs.
        secondtab.setText("Phone");
        thirdtab.setText("Email");
        firsttab.setIcon(R.mipmap.ic_launcher);//given icons of tabs
        secondtab.setIcon(R.mipmap.ic_launcher);
        thirdtab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(firsttab);
        tabLayout.addTab(secondtab);
        tabLayout.addTab(thirdtab);

        fragment=new FirstFragment();
        setFragment(fragment);

      //adding all tabs to tablayout
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 0:
                        fragment = new FirstFragment();
                        setFragment(fragment);
                        break;
                    case 1:
                        fragment = new SecondFragment();
                        setFragment(fragment);
                        break;
                    case 2:
                        fragment = new ThirdFragment();
                        setFragment(fragment);
                        break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();//creating fragment manager and replacing framelayout by fragments
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.f1,fragment);
        fragmentTransaction.commit();

    }
}

