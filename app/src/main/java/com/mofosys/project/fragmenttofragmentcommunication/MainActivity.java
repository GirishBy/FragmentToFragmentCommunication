package com.mofosys.project.fragmenttofragmentcommunication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int data, String name) {

        Log.i("TEST", "data : " + data + "| name: " + name);
        FragmentManager manager = getFragmentManager();
        FragmentB frag = (FragmentB) manager.findFragmentById(R.id.fragment2);
        frag.change(data, name);

    }
}
