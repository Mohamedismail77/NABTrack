package com.example.sourcya.nabtrack;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

/**
 * Created by m-ismail on 04/01/18.
 */

public class MainFragment extends PreferenceFragment {

    public MainFragment(){}


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.main_screen);
    }
}
