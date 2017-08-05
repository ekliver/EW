/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AvmovGuiaRemisionCab;
import sys.model.AvmovGuiaRemisionDet;

/**
 *
 * @author Pc
 */
public interface GuiaRemisionDetalleDAO {

    public List<AvmovGuiaRemisionDet> listarGuiasRemisionDetalle(AvmovGuiaRemisionCab guiaRemision);

    public void newGuiaRemisionDetalle(AvmovGuiaRemisionDet guiaRemisionDetalle);

    public void updateGuiaRemisionDetalle(AvmovGuiaRemisionDet guiaRemisionDetalle);

    public void deleteGuiaRemisionDetalle(AvmovGuiaRemisionDet guiaRemisionDetalleF);

}
