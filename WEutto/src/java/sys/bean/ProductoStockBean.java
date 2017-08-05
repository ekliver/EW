package sys.bean;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sys.dao.ProductoStockDAO;
import sys.imp.ProductoStockDAOImp;
import sys.model.AimarStockActual;

@ManagedBean
@ViewScoped
public class ProductoStockBean implements Serializable {

    private AimarStockActual productoStock;
    private List<AimarStockActual> listaProductoStocks;

    public ProductoStockBean() {
        productoStock = new AimarStockActual();
        ProductoStockDAO pDDao = new ProductoStockDAOImp();
        listaProductoStocks = pDDao.listarProductoStocks();

    }

    public AimarStockActual getProductoStock() {
        return productoStock;
    }

    public void setProductoStock(AimarStockActual productoStock) {
        this.productoStock = productoStock;
    }

    public List<AimarStockActual> getListaProductoStocks() {

        return listaProductoStocks;
    }

    public void setListaProductoStocks(List<AimarStockActual> listaProductoStocks) {
        this.listaProductoStocks = listaProductoStocks;
    }

}
