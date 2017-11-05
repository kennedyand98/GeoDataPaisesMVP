package br.usjt.desmob.geodata.model.dao;

import br.usjt.desmob.geodata.Contexto;

/**
 * Created by asbonato on 05/11/17.
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
