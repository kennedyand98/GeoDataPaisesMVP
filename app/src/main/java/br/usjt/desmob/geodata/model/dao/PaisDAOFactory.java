package br.usjt.desmob.geodata.model.dao;

import br.usjt.desmob.geodata.Contexto;

/**
 * Created by KENNEDY on 02/05/2018.
 */

public class PaisDAOFactory {

    public static PaisDAO getPaisDAO(boolean onLine){
        if (onLine) {
            return new PaisDAORest();
        } else {
            return new PaisDAODb(Contexto.getValue());
        }
    }
}
