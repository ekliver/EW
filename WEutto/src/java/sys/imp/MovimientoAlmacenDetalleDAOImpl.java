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
import java.text.SimpleDateFormat;
import java.util.Date;
import sys.dao.MovimientoAlmacenDetalleDAO;
import sys.dao.NotaDespachoDetalleDAO;
import sys.model.AimarMovAlmacenDet;
import sys.model.AvmovMovNotaDespachoDet;
import sys.util.Service;

/**
 *
 * @author Pc
 */
public class MovimientoAlmacenDetalleDAOImpl implements MovimientoAlmacenDetalleDAO {

    @Override
    public AimarMovAlmacenDet obtenerMovimientoAlmacenDetalle(AimarMovAlmacenDet mAD) {
        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        AimarMovAlmacenDet movimientoAlmacenDetalle = null;

        try {
            cn = Service.getConexion();
            String sql = "SELECT IdMovAlmDet "
                    + "FROM AIMAR_MovAlmacenDet "
                    + "WHERE idNotaDespachoDet=? "
                    + "ORDER BY IdMovAlmDet DESC; ";

            ps = cn.prepareStatement(sql);
            ps.setInt(1, mAD.getIdNotaDespachoDet());
            rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
                movimientoAlmacenDetalle = new AimarMovAlmacenDet();

                movimientoAlmacenDetalle.setIdMovAlmDet(rs.getInt("IdMovAlmDet"));

            }

//              Service.cerrarConexion();
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
        return movimientoAlmacenDetalle;

    }

    @Override
    public void newMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO AIMAR_MovAlmacenDet ("
                + "`IdMovAlmCab`,"
                + "`ruc_companyia`, "
                + "`anyo`, "
                + "`cod_establecimiento`, "
                + "`cod_centroc`, "
                + "`cod_area`, "
                + "`cod_almacen`, "
                + "`num_movimiento`, "
                + "`cod_producto`, "
                + "`Cod_TipoProducto`, "
                + "`num_cantidad`, "
                + "`fec_creacion`, "
                + "`hor_creacion`, "
                + " `cod_usuario_creacion`,"
                + " `cod_presentacion`,"
                + " `num_cantidad_presentacion`,"
                + " `cod_um`,"
                + " `val_equivalencia`,"
                + " `idNotaDespachoDet`"
                + ") "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ";

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        movimientoAlmacenDetalle.setFecCreacion(formatoFecha.format(fechaActual));
        movimientoAlmacenDetalle.setHorCreacion(formatoHora.format(fechaActual));
        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, movimientoAlmacenDetalle.getIdMovAlmCab());
            ps.setString(2, movimientoAlmacenDetalle.getRucCompanyia());
            ps.setString(3, movimientoAlmacenDetalle.getAnyo());
            ps.setString(4, movimientoAlmacenDetalle.getCodEstablecimiento());
            ps.setInt(5, movimientoAlmacenDetalle.getCodCentroc());
            ps.setInt(6, movimientoAlmacenDetalle.getCodArea());
            ps.setInt(7, movimientoAlmacenDetalle.getCodAlmacen());
            ps.setString(8, movimientoAlmacenDetalle.getNumMovimiento());
            ps.setString(9, movimientoAlmacenDetalle.getCodProducto());
            ps.setString(10, movimientoAlmacenDetalle.getCodTipoProducto());
            ps.setInt(11, movimientoAlmacenDetalle.getNumCantidad());
            ps.setString(12, movimientoAlmacenDetalle.getFecCreacion());
            ps.setString(13, movimientoAlmacenDetalle.getHorCreacion());
            ps.setInt(14, movimientoAlmacenDetalle.getCodUsuarioCreacion());
            ps.setInt(15, movimientoAlmacenDetalle.getCodPresentacion());
            ps.setInt(16, movimientoAlmacenDetalle.getNumCantidadPresentacion());
            ps.setString(17, movimientoAlmacenDetalle.getCodUm());
            ps.setInt(18, movimientoAlmacenDetalle.getValEquivalencia());
            ps.setInt(19, movimientoAlmacenDetalle.getIdNotaDespachoDet());

            ps.executeUpdate();
//              Service.cerrarConexion();
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
        //
    }

    @Override
    public void updateMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE AIMAR_MovAlmacenDet SET "
                + "num_movimiento= ?, "
                + "num_cantidad= ?, \n"
                + "fec_actualizacion= ?, \n"
                + "hor_actualizacion= ?, \n"
                + "cod_usuario_actualizacion= ?, \n"
                + "cod_presentacion= ?, \n"
                + "num_cantidad_presentacion= ?, \n"
                + "cod_um= ?, \n"
                + "val_equivalencia= ? \n"
                + "WHERE IdMovAlmDet= ?; ";

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        movimientoAlmacenDetalle.setFecActualizacion(formatoFecha.format(fechaActual));
        movimientoAlmacenDetalle.setHorActualizacion(formatoHora.format(fechaActual));

        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            
            ps.setString(1, movimientoAlmacenDetalle.getNumMovimiento());
            ps.setInt(2, movimientoAlmacenDetalle.getNumCantidad());            
            ps.setString(3, movimientoAlmacenDetalle.getFecActualizacion());
            ps.setString(4, movimientoAlmacenDetalle.getHorActualizacion());
            ps.setInt(5, movimientoAlmacenDetalle.getCodUsuarioActualizacion());
            ps.setInt(6, movimientoAlmacenDetalle.getCodPresentacion());
            ps.setInt(7, movimientoAlmacenDetalle.getNumCantidadPresentacion());
            ps.setString(8, movimientoAlmacenDetalle.getCodUm());
            ps.setInt(9, movimientoAlmacenDetalle.getValEquivalencia());
            ps.setInt(10, movimientoAlmacenDetalle.getIdMovAlmDet());

            ps.executeUpdate();
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

    }

    @Override
    public void updatePrecioMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE AIMAR_MovAlmacenDet SET "
                + "val_vta_prod= ?, \n"
                + "imp_item= ?, \n"
                + "val_vta_sol= ?, \n"
                + "Imp_Item_Sol= ?, \n"
                + "val_vta_dol= ?, \n"
                + "Imp_Item_Dol= ?, \n"
                + "fec_actualizacion= ?, \n"
                + "hor_actualizacion= ?, \n"
                + "cod_usuario_actualizacion= ? \n"
                + "WHERE idNotaDespachoDet= ?; ";

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        movimientoAlmacenDetalle.setFecActualizacion(formatoFecha.format(fechaActual));
        movimientoAlmacenDetalle.setHorActualizacion(formatoHora.format(fechaActual));

        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);

            ps.setDouble(1, movimientoAlmacenDetalle.getValVtaProd());
            ps.setDouble(2, movimientoAlmacenDetalle.getImpItem());
            ps.setDouble(3, movimientoAlmacenDetalle.getValVtaSol());
            ps.setDouble(4, movimientoAlmacenDetalle.getImpItemSol());
            ps.setDouble(5, movimientoAlmacenDetalle.getValVtaDol());
            ps.setDouble(6, movimientoAlmacenDetalle.getImpItemDol());
            ps.setString(7, movimientoAlmacenDetalle.getFecActualizacion());
            ps.setString(8, movimientoAlmacenDetalle.getHorActualizacion());
            ps.setInt(9, movimientoAlmacenDetalle.getCodUsuarioActualizacion());
            ps.setInt(10, movimientoAlmacenDetalle.getIdNotaDespachoDet());

            ps.executeUpdate();
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

    }

    @Override
    public void deleteMovimientoAlmacenDetalle(AimarMovAlmacenDet movimientoAlmacenDetalle) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM AIMAR_MovAlmacenCab WHERE IdMovAlmCab=?;";
        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, movimientoAlmacenDetalle.getIdMovAlmCab());
            ps.executeUpdate();

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

    }

}
