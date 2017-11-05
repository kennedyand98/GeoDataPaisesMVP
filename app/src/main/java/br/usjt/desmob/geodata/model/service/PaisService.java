package br.usjt.desmob.geodata.model.service;

import java.io.IOException;

import br.usjt.desmob.geodata.model.dao.PaisDAO;
import br.usjt.desmob.geodata.model.dao.PaisDAOFactory;
import br.usjt.desmob.geodata.model.entity.Pais;
import br.usjt.desmob.geodata.model.entity.Regiao;

/**
 * Created by asbonato on 05/11/17.
 */

public class PaisService {
    PaisDAO dao;

    public PaisService(boolean onLine){
        dao = PaisDAOFactory.getPaisDAO(onLine);
    }
    public Pais[] buscarPaises(Regiao regiao) throws IOException{
        return dao.buscarPaises(regiao);
    }
}
