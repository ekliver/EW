/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;

import sys.model.AgmaeUsuario;
import sys.model.AimarAlmacen;


/**
 *
 * @author cocotin
 */
public interface AlmacenDAO {

    public List<AimarAlmacen> listarAlmacenes(AgmaeUsuario usuario);

    public List<AimarAlmacen> listarAlmacenes(String rucCompanya);

    public AimarAlmacen consultarObjAlmacen(String rucCompanya, int codAlmacen);
}
