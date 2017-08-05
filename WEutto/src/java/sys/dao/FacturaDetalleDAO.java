package sys.dao;

import java.util.List;
import sys.model.AvmovFacturaNdCab;
import sys.model.AvmovFacturaNdDet;
import sys.model.AvmovGuiaRemisionDet;
import sys.model.AvmovMovNotaDespachoCab;

public interface FacturaDetalleDAO {

    public List<AvmovFacturaNdDet> obtenerListaFacturaDetallePorIdFactura(AvmovFacturaNdCab factura);

    public List<AvmovFacturaNdDet> obtenerListaFacturaDetallePorND(AvmovMovNotaDespachoCab notaDespacho);

    public List<AvmovFacturaNdDet> obtenerListaProductoPendientesPorIdRel(AvmovMovNotaDespachoCab notaDespacho, List<AvmovFacturaNdDet> listaFacturaDetalle);

    public List<AvmovFacturaNdDet> listarFacturaDetalleSinGR(AvmovFacturaNdCab factura, List<AvmovGuiaRemisionDet> guiaRemisionDetalle);

    public void newFacturaDetalle(AvmovFacturaNdDet facturaDetalle);

    public void updateFacturaDetalle(AvmovFacturaNdDet facturaDetalle);

    public void deleteFacturaDetalle(AvmovFacturaNdDet facturaDetalle);

}
