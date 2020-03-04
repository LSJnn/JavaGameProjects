package com.example.heresy;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Map;
import java.util.Set;


public class mySharedPreferences implements SharedPreferences {
    private static String name = "newPref";


    public static SharedPreferences getPreferenences(Context context){
        return context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }

    @Override
    public Map<String, ?> getAll() {
        return null;
    }


    public void setString(Context context,String key, String value){
        SharedPreferences mSf = getPreferenences(context);
        SharedPreferences.Editor editor = mSf.edit();
        editor.putString(key,value);
        editor.commit();
    }

    @Nullable
    @Override
    public String getString(String key, @Nullable String defValue) {
        return null;
    }

    public String getStringR(Context context, String key) {
        SharedPreferences mSf = getPreferenences(context);
        return mSf.getString(key,null);
    }

    @Nullable
    @Override
    public Set<String> getStringSet(String key, @Nullable Set<String> defValues) {
        return null;
    }

    public int getIntR(Context context, String key) {
        SharedPreferences mSf = getPreferenences(context);

        return mSf.getInt(key,0);
    }

    public void setInt(Context context, String key, int value){
        SharedPreferences mSp = getPreferenences(context);
        SharedPreferences.Editor editor = mSp.edit();
        editor.putInt(key,value);
        editor.commit();
    }

    @Override
    public int getInt(String key, int defValue) {
        return 0;
    }

    @Override
    public long getLong(String key, long defValue) {
        return 0;
    }

    @Override
    public float getFloat(String key, float defValue) {
        return 0;
    }

    @Override
    public boolean getBoolean(String key, boolean defValue) {
        return false;
    }

    @Override
    public boolean contains(String key) {
        return false;
    }

    @Override
    public Editor edit() {
        return null;
    }

    @Override
    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {

    }

    @Override
    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener listener) {

    }
    public static void removeKey(Context context, String key){
        SharedPreferences mSp = getPreferenences(context);
        SharedPreferences.Editor editor = mSp.edit();
        editor.remove(key);
        editor.commit();
    }

    public static void clear(Context context){
        SharedPreferences mSp = getPreferenences(context);
        SharedPreferences.Editor editor = mSp.edit();
        editor.clear();
        editor.commit();
    }
}
