package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Created by asbonato on 05/11/17.
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
