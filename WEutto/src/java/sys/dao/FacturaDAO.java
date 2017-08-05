/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.Date;
import java.util.List;
import sys.model.AvmovFacturaNdCab;
import sys.model.AvmovFacturaNdDet;
import sys.model.AvmovMovNotaDespachoCab;

/**
 *
 * @author Pc
 */
public interface FacturaDAO {

    public AvmovFacturaNdCab obtenerFacturaPorIdFactura(AvmovFacturaNdCab factura);

    public int obtenerIdFacturaPorNumFactura(AvmovFacturaNdCab factura);

    public AvmovFacturaNdCab obtenerFacturaPorND(AvmovMovNotaDespachoCab notaDespacho);

    public List<AvmovFacturaNdCab> listarFacturasPorFecha(Date feDesde, Date feHasta);

    public void newFactura(AvmovFacturaNdCab factura);

    public void updateFactura(AvmovFacturaNdCab factura);

    public void deleteFactura(AvmovFacturaNdCab factura);

    public String generarNroFactura(AvmovFacturaNdCab factura);
}
