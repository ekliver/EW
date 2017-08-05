package sys.dao;

import java.util.List;
import sys.model.AimarMovAlmacenCab;
import sys.model.AvmovMovNotaDespachoCab;
import sys.model.AvmovMovNotaDespachoDet;

public interface MovimientoAlmacenDAO {

    public List<AimarMovAlmacenCab> listarMovimientosAlmacen();

    public AimarMovAlmacenCab obtenerMovimientoAlmacen(AimarMovAlmacenCab mA);

    public String obtenerNroMovimientoRelNdMovInv(AvmovMovNotaDespachoDet notaDespacho) ;

    public void newMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen, AvmovMovNotaDespachoCab notaDespacho);

    public void updateMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen);

    public void deleteMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen);

}
