package sys.dao;

import java.util.List;
import sys.model.AgmaeUsuario;
import sys.model.AimarMovAlmacenCab;
import sys.model.AvmovMovNotaDespachoCab;

public interface MovimientoAlmacenTempDAO {

    public List<AimarMovAlmacenCab> listarMovimientosAlmacen();

    public void newMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void updateMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void deleteMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);

    public void deleteAllMovimientoAlmacenTemp(AgmaeUsuario usuario);

    public AvmovMovNotaDespachoCab obtenerMovimientoAlmacen(AvmovMovNotaDespachoCab notaDespacho);
}
