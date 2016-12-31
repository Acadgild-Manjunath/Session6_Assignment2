package com.acadgild.com.session6_assignment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FirstFragment firstFragment = new FirstFragment();
        ft.add(R.id.displayFragments,firstFragment);
        ft.commit();
    }


    public void onSelectFragment(View view)
    {
        Fragment fragment;
        if(view== findViewById(R.id.btnLayout1))
        {
            fragment = new FirstFragment();
        }
        else if(view== findViewById(R.id.btnLayout2))
        {
            fragment = new SecondFragment();
        }
        else if(view== findViewById(R.id.btnLayout3))
        {
            fragment = new ThirdFragment();
        }
        else if(view== findViewById(R.id.btnLayout4))
        {
            fragment = new FourthFragment();
        }
        else
        {
            fragment = new FirstFragment();
        }

        FragmentTransaction ftr = getSupportFragmentManager().beginTransaction();
        ftr.replace(R.id.displayFragments,fragment);
        ftr.addToBackStack(null);
        ftr.commit();

    }
}
