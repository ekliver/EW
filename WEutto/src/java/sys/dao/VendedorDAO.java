/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.model.AgmaeVendedor;

/**
 *
 * @author Pc
 */
public interface VendedorDAO {

    public List<AgmaeVendedor> listarVendedores();

    public AgmaeVendedor consultarObjVendedor();

    public AgmaeVendedor consultarObjVendedor(int codVendedor);

}
