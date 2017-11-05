package br.usjt.desmob.geodata.model.service;

import android.content.Context;
import android.net.ConnectivityManager;

/**
 * Created by asbonato on 22/09/17.
 */

public class NetworkStatus {

    public static boolean isConnected(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null &&
                connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
