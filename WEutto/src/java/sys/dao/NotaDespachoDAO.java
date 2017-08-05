package sys.dao;

import java.util.Date;
import java.util.List;
import sys.model.AvmovGuiaRemisionDet;
import sys.model.AvmovMovNotaDespachoCab;

public interface NotaDespachoDAO {

    public List<AvmovMovNotaDespachoCab> listarNotaDespachos();

    public List<AvmovMovNotaDespachoCab> listaNotaDespachos(Date feDesde, Date feHasta, List<AvmovGuiaRemisionDet> listaGuiaRemisionDetalle);

    public List<AvmovMovNotaDespachoCab> listarNotaDespachosPorFecha(Date feDesde, Date feHasta);

    public List<AvmovMovNotaDespachoCab> listarNotaDespachosAFactura();

    public AvmovMovNotaDespachoCab obtenerNotaDespacho(AvmovMovNotaDespachoCab notaDespacho);

    public AvmovMovNotaDespachoCab obtenerIdNotaDespacho(AvmovMovNotaDespachoCab notaDespacho);

    public void newNotaDespacho(AvmovMovNotaDespachoCab notaDespacho);

    public void updateNotaDespacho(AvmovMovNotaDespachoCab notaDespacho);

}
