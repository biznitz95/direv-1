package com.direv.direv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Malachi on 10/16/2017.
 */

// In this case, the fragment displays simple text based on the page
public class SettingsFragment extends Fragment {

    public SettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_settings, container, false);
        return view;
    }
}