package com.mofosys.project.fragmenttofragmentcommunication;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by girish on 21/6/17.
 */

public class FragmentB extends Fragment {
    private TextView text;
    private Activity activity;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = (TextView) activity.findViewById(R.id.textView);
    }

    public void change(int data, String name) {
        Resources res = getResources();
        String[] desc = res.getStringArray(R.array.descrip);
        text.setText("NAME : " + name + "\nDESC: " + desc[data]);
    }


}
