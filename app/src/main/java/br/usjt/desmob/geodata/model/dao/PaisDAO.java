package br.usjt.desmob.geodata.model.dao;

import java.io.IOException;

import br.usjt.desmob.geodata.model.entity.Pais;
import br.usjt.desmob.geodata.model.entity.Regiao;

/**
 * Created by KENNEDY on 02/05/2018.
 */

public interface PaisDAO {
    Pais[] buscarPaises(Regiao regiao) throws IOException;
}
