/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sys.dao.PresentacionDAO;
import sys.model.AimarPresentaciones;
import sys.model.AimarProductos;
import sys.util.Service;

/**
 *
 * @author Pc
 */
public class PresentacionDAOImpl implements PresentacionDAO {

    @Override
    public List<AimarPresentaciones> listarPresentacion(String codProducto) {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        AimarPresentaciones presentacion = null;
        List<AimarPresentaciones> lista = new ArrayList<>();
        try {
            cn = Service.getConexion();
            String sql = "SELECT AIMAR_Productos_Presentacion.cod_presentacion, "
                    + "AIMAR_Presentaciones.des_presentacion, "
                    + "AIMAR_Productos_Presentacion.val_equivalencia, "
                    + "AIMAR_Productos_Presentacion.cod_producto "
                    + "FROM AIMAR_Presentaciones RIGHT JOIN AIMAR_Productos_Presentacion "
                    + "ON AIMAR_Presentaciones.cod_presentacion = AIMAR_Productos_Presentacion.cod_presentacion "
                    + "WHERE (((AIMAR_Productos_Presentacion.cod_producto)=[?]));";

            ps = cn.prepareStatement(sql);
            ps.setString(1, codProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                existe = true;
                presentacion = new AimarPresentaciones();
                presentacion.setCodPresentacion(rs.getInt(1));
                presentacion.setDesPresentacion(rs.getString(2));
                presentacion.setValEquivalencia(rs.getInt(3));
                presentacion.setCodProducto(rs.getString(4));
                lista.add(presentacion);
            }
            if (!existe) {
                presentacion = null;
                System.out.println("No se encontro datos - listarPresentacion");
            }
//            Service.cerrarConexion();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }
        return lista;

    }

}
