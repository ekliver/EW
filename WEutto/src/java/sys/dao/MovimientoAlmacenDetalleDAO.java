/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import sys.model.AimarMovAlmacenDet;
import sys.model.AvmovMovNotaDespachoDet;

/**
 *
 * @author Pc
 */
public interface MovimientoAlmacenDetalleDAO {

    public AimarMovAlmacenDet obtenerMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle);

    public void newMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle);

    public void updateMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle);
    
    public void updatePrecioMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle);

    public void deleteMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle);

    
}
