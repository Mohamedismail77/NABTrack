package com.example.sourcya.nabtrack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;

/**
 *
 * Created by m-ismail on 04/01/18.
 * 
 */

public class MainFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    public MainFragment(){}
    public SharedPreferences sharedPreferences;

    private String KEY_STATUES = "status";
    private String KEY_ID = "id";
    private String KEY_URL = "url";
    private String KEY_INTERVAL = "interval";
    private String KEY_DISTANCE = "distance";
    private String KEY_ANGLE = "angle";



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        addPreferencesFromResource(R.xml.main_screen);
        initPreferences();
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);


    }


    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

        //TODO
        //get new configuration and start service
        initPreferences();
        if(sharedPreferences.getBoolean(KEY_STATUES,false)) {
            ContextCompat.startForegroundService(getActivity(), new Intent(getActivity(), ShareService.class));
        } else {
            getActivity().stopService(new Intent(getActivity(),ShareService.class));
        }



    }

    private void initPreferences() {

        if(sharedPreferences.getBoolean(KEY_STATUES,false)) {
            findPreference(KEY_ID).setEnabled(false);
            findPreference(KEY_URL).setEnabled(false);
            findPreference(KEY_INTERVAL).setEnabled(false);
            findPreference(KEY_DISTANCE).setEnabled(false);
            findPreference(KEY_ANGLE).setEnabled(false);
        } else {

            findPreference(KEY_ID).setEnabled(true);
            findPreference(KEY_URL).setEnabled(true);
            findPreference(KEY_INTERVAL).setEnabled(true);
            findPreference(KEY_DISTANCE).setEnabled(true);
            findPreference(KEY_ANGLE).setEnabled(true);
        }

    }


}
