package sys.dao;

import java.util.List;
import sys.model.AimarMovAlmacenCab;
import sys.model.AvmovMovNotaDespachoCab;

public interface MovimientoAlmacenTempDAO {

    public List<AimarMovAlmacenCab> listarMovimientosAlmacen();

    public void newMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void updateMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void deleteMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void deleteAllMovimientoAlmacen();

    public AvmovMovNotaDespachoCab obtenerMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);
}
