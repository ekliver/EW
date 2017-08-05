package sys.dao;

import java.util.List;
import sys.model.AvmovGuiaRemisionDet;
import sys.model.AvmovMovNotaDespachoCab;
import sys.model.AvmovMovNotaDespachoDet;

public interface NotaDespachoDetalleDAO {

    public List<AvmovMovNotaDespachoDet> listarNotaDespachoDetalles();

    public List<AvmovMovNotaDespachoDet> listarNotaDespachoDetalleSinGR(AvmovMovNotaDespachoCab notaDespacho, List<AvmovGuiaRemisionDet> guiaRemisionDetalle);

    public List<AvmovMovNotaDespachoDet> listarNotaDespachoDetalles(AvmovMovNotaDespachoCab nd);

    public AvmovMovNotaDespachoDet obtenerIdNotaDespachoDetalle(AvmovMovNotaDespachoDet nDD);

    public void newNotaDespachoDetalle(AvmovMovNotaDespachoDet notaDespachoDetalle);

    public void updateNotaDespachoDetalle(AvmovMovNotaDespachoDet notaDespachoDetalle);

    public void updateFactutacionNotaDespachoDetalle(int idNotaDespachoDet, int flgEstado);

    public void deleteNotaDespachoDetalle(AvmovMovNotaDespachoDet notaDespachoDetalle);

}
