package com.example.hwhong.techcompguide;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends FragmentActivity implements Communicate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void respond(int i) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTwo fragmentTwo = (FragmentTwo) fm.findFragmentById(R.id.frag2);
        fragmentTwo.changeInfoView(i);
    }
}
