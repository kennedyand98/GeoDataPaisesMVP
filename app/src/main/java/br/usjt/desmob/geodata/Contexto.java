package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Created by KENNEDY on 02/05/2018.
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
