/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AimarPresentaciones;
import sys.model.AimarProductos;

/**
 *
 * @author Pc
 */
public interface PresentacionDAO {

    public List<AimarPresentaciones> listarPresentacion(String codProducto);
}
