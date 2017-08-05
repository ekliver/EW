/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.Date;
import java.util.List;
import sys.model.AimarStockm;
import sys.model.AvmovMovNotaDespachoDet;

/**
 *
 * @author Pc
 */
public interface ProductoStockMDAO {

    public List<AimarStockm> listarProductoStocks(Date fechaSM);

    public AimarStockm consultarObjProductoStock(Date fechaSM, AvmovMovNotaDespachoDet ndt);
}
