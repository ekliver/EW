/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AgmaeArea;
import sys.model.AgmaeUsuario;
import sys.model.AvmovMovNotaDespachoCab;

/**
 *
 * @author Pc
 */
public interface AreaDAO {

    public List<AgmaeArea> listarAreas(AgmaeUsuario usuario);

    public List<AgmaeArea> listarAreas(String rucCompanya);

    public AgmaeArea consultarObjArea(String rucCompanya, int codArea);

}
