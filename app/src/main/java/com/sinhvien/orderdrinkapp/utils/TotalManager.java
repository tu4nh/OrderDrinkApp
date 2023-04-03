package com.sinhvien.orderdrinkapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class TotalManager {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public TotalManager(Context context) {
        preferences = context.getSharedPreferences("preTotal", Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void setMyTotal(int myInt) {
        editor.putInt("valueTotal", myInt);
        editor.commit();
    }


    public String getMyTotal() {
        return String.valueOf(preferences.getInt("valueTotal", 0));
    }



}
