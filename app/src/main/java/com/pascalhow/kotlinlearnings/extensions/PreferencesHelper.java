package com.pascalhow.kotlinlearnings.extensions;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PreferencesHelper {

    private final SharedPreferences prefs;

    public PreferencesHelper(Context context) {
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public void putInt(String key, int value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public int getInt(String key, int defaultValue) {
        return prefs.getInt(key, defaultValue);
    }

    public String getString(String key, String defaultValue) {
        return prefs.getString(key, defaultValue);
    }

}
