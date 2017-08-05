
package sys.dao;

import java.util.List;
import sys.model.AimarProductos;
import sys.model.ZProductoPrecio;

public interface ProductoDAO {

    public List<AimarProductos> listarProductos();

    public AimarProductos consultarObjProducto(String codProducto);
   
}
