/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.Date;
import java.util.List;
import sys.model.AvmovFacturaNdCab;
import sys.model.AvmovGuiaRemisionCab;
import sys.model.AvmovGuiaRemisionDet;

public interface GuiaRemisionDAO {

    public int obtenerIdGuiaRemisionPorNumGuiaRemision(AvmovGuiaRemisionCab guiaRemsion);

    public AvmovGuiaRemisionCab obtenerGuiaRemisionPorIdGuiaRemision(AvmovGuiaRemisionCab gr);

    public List<AvmovGuiaRemisionCab> listarGuiasRemisionPorFecha(Date feDesde, Date feHasta);

    public void newGuiaRemision(AvmovGuiaRemisionCab guiaRemision);

    public void updateGuiaRemision(AvmovGuiaRemisionCab guiaRemision);

    public void deleteGuiaRemision(AvmovGuiaRemisionCab guiaRemision);

    public List<AvmovFacturaNdCab> listaFacturas(Date feDesde, Date feHasta, List<AvmovGuiaRemisionDet> listaGuiaRemisionDetalle) ;

    public String generarNroGuiaRemision(AvmovGuiaRemisionCab guiaRemision);
}
