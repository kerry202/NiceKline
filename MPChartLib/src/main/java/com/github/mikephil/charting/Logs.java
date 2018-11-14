package com.github.mikephil.charting;

import android.util.Log;

public class Logs {

    public static boolean isDebug =true;

    public static void s(String str){
        if (isDebug) {
            Log.d(" ybLogs: ",str);
        }
    }
}
