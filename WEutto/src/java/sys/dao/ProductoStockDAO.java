package sys.dao;

import java.util.List;
import sys.model.AimarStockActual;
import sys.model.ZProductoPrecio;

public interface ProductoStockDAO {

    public List<AimarStockActual> listarProductoStocks();

    public List<AimarStockActual> obtenerProductoStocks(ZProductoPrecio productoPrecio);
    
}
