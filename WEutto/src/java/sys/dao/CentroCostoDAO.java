/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AgmaeCentrocosto;
import sys.model.AgmaeUsuario;


/**
 *
 * @author Pc
 */
public interface CentroCostoDAO {

    public List<AgmaeCentrocosto> listarCentros(AgmaeUsuario usuario);

    public AgmaeCentrocosto consultarObjCentroCosto(int codCentroCosto);

}
