/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AgmaeUsuario;
import sys.model.AvmovMovNotaDespachoCab;
import sys.model.AvmovMovNotaDespachoDet;

/**
 *
 * @author Pc
 */
public interface MovimientoAlmacenDetalleTempDAO {

    public List<AvmovMovNotaDespachoDet> listarNotaDespachoDetalles(AvmovMovNotaDespachoCab nd);

    public void newMovimientoAlmacenDetalleTemp(AvmovMovNotaDespachoDet notaDespachoDetalle);

    public void updateMovimientoAlmacenDetalleTemp(AvmovMovNotaDespachoDet notaDespachoDetalle);

    public void deleteMovimientoAlmacenDetalleTemp(AvmovMovNotaDespachoDet notaDespachoDetalle);

    public void deleteAllMovimientoAlmacenDetalleTemp(AgmaeUsuario usuario);
}
