/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.ZProductoPrecio;

/**
 *
 * @author cocotin
 */
public interface ProductoPrecioDAO {

    public List<ZProductoPrecio> listarProductoPrecios();

    public void newProductoPrecio(ZProductoPrecio ProductoPrecio);

    public void updateProductoPrecio(ZProductoPrecio ProductoPrecio);

    public void deleteProductoPrecio(ZProductoPrecio ProductoPrecio);

}
