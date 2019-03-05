package com.example.listview;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;



public class VolleySingleton {

    private static VolleySingleton intanciavolley=null;
    private RequestQueue requestQueue;

    private VolleySingleton(Context context) {
        requestQueue = Volley.newRequestQueue(context);
    }




    public static VolleySingleton getIntanciavolley(Context context) {

        if(intanciavolley == null)
        {
            intanciavolley = new VolleySingleton(context);
        }
        return intanciavolley;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
