/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.test;

import java.util.ArrayList;
import java.util.List;
import sys.clasesAuxiliares.Funciones;
import sys.dao.FacturaDAO;
import sys.dao.GuiaRemisionDAO;
import sys.dao.UnidadTransporteDAO;
import sys.imp.FacturaDAOImpl;
import sys.imp.GuiaRemisionDAOImpl;
import sys.imp.UnidadTransporteDAOImpl;
import sys.model.AimarUnidadTransporte;
import sys.model.AvmovFacturaNdCab;

/**
 *
 * @author cocotin
 */
public class Main {

    public static void main(String[] args) {
        List<AimarUnidadTransporte> listaUnidadTransporte = new ArrayList<>();
        UnidadTransporteDAO uTDao = new UnidadTransporteDAOImpl();
        listaUnidadTransporte = uTDao.listarUnidadTransporte();
        for (AimarUnidadTransporte aimarUnidadTransporte : listaUnidadTransporte) {
            System.out.println( aimarUnidadTransporte.getPlaca());
            
        }
    }

}
