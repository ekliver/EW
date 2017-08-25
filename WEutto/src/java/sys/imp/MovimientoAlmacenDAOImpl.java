package sys.imp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sys.dao.ClienteDAO;
import sys.dao.MovimientoAlmacenDAO;
import sys.dao.NotaDespachoDAO;
import sys.model.AimarMovAlmacenCab;
import sys.model.AvmovMovNotaDespachoCab;
import sys.model.AvmovMovNotaDespachoDet;
import sys.util.Service;

public class MovimientoAlmacenDAOImpl implements MovimientoAlmacenDAO {

    @Override
    public List<AimarMovAlmacenCab> listarMovimientosAlmacen() {

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        AimarMovAlmacenCab movimientoAlmacen = null;
        List<AimarMovAlmacenCab> lista = new ArrayList<>();
        ClienteDAO cDAO = new ClienteDAOImpl();

        try {
            cn = Service.getConexion();
            String sql = "SELECT IdMovAlmCab, ruc_companyia, Anyo, cod_establecimiento, "
                    + "cod_centroc, Cod_Area, cod_almacen, Cod_TipoProducto, "
                    + "num_movimiento, Cod_TipoConcepto, num_documento, cod_persona, "
                    + "fec_movimiento, cod_concepto, cod_documento, tip_cambio, "
                    + "cod_moneda, F1TIPPRV, cod_establecimiento_des, cod_centroc_des, "
                    + "cod_almacen_des, cod_area_des, num_movimiento_des, num_factura, "
                    + "num_orden, num_imp, partida, F4ORDTRA, F4FECULT, F2CODUSE, "
                    + "Refere, F4CONTABLE, F4CORRELATIVO, flg_Origen, fec_creacion, "
                    + "hor_creacion, cod_usuario_creacion, fec_actualizacion, "
                    + "hor_actualizacion, cod_usuario_actualizacion, Exportado, "
                    + "Importado, fec_importacion, hor_importacion, cod_usuario_imp, "
                    + "num_mov_importado, flg_formVoucher, cod_sub_concepto, "
                    + "flg_AsientoContable, id_activofijo, fec_asiento, anno_asiento, "
                    + "mes_asiento, tipo_asiento, num_asiento, fec_creacion_asiento, "
                    + "hor_creacion_asiento, cod_usuario_asiento, cod_centron, "
                    + "des_Glosa, flg_transcodigos, flg_editando, des_observacion, "
                    + "cod_usuario_editando, fec_usuario_editando, hor_usuario_editando "
                    + "FROM AIMAR_MovAlmacenCab; ";

            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                existe = true;
                movimientoAlmacen = new AimarMovAlmacenCab();

                movimientoAlmacen.setIdMovAlmCab(rs.getInt("IdMovAlmCab"));
                movimientoAlmacen.setRucCompanyia(rs.getString("ruc_companyia"));
                movimientoAlmacen.setAnyo(rs.getString("Anyo"));
                movimientoAlmacen.setCodEstablecimiento(rs.getString("cod_establecimiento"));
                movimientoAlmacen.setCodCentroc(rs.getInt("cod_centroc"));
                movimientoAlmacen.setCodArea(rs.getInt("Cod_Area"));
                movimientoAlmacen.setCodAlmacen(rs.getInt("cod_almacen"));
                movimientoAlmacen.setCodTipoProducto(rs.getString("Cod_TipoProducto"));
                movimientoAlmacen.setNumMovimiento(rs.getString("num_movimiento"));
                movimientoAlmacen.setCodTipoConcepto(rs.getString("Cod_TipoConcepto"));
                movimientoAlmacen.setNumDocumento(rs.getString("num_documento"));
                movimientoAlmacen.setCodPersona(rs.getInt("cod_persona"));
                movimientoAlmacen.setFecMovimiento(rs.getDate("fec_movimiento"));
                movimientoAlmacen.setCodConcepto(rs.getString("cod_concepto"));
                movimientoAlmacen.setCodDocumento(rs.getString("cod_documento"));
                movimientoAlmacen.setTipCambio(rs.getDouble("tip_cambio"));
                movimientoAlmacen.setCodMoneda(rs.getString("cod_moneda"));
                movimientoAlmacen.setF1tipprv(rs.getString("F1TIPPRV"));
                movimientoAlmacen.setCodEstablecimientoDes(rs.getString("cod_establecimiento_des"));
                movimientoAlmacen.setCodCentrocDes(rs.getInt("cod_centroc_des"));
                movimientoAlmacen.setCodAlmacenDes(rs.getInt("cod_almacen_des"));
                movimientoAlmacen.setCodAreaDes(rs.getInt("cod_area_des"));
                movimientoAlmacen.setNumMovimientoDes(rs.getString("num_movimiento_des"));
                movimientoAlmacen.setNumFactura(rs.getString("num_factura"));
                movimientoAlmacen.setNumOrden(rs.getString("num_orden"));
                movimientoAlmacen.setNumImp(rs.getString("num_imp"));
                movimientoAlmacen.setPartida(rs.getString("partida"));
                movimientoAlmacen.setF4ordtra(rs.getString("F4ORDTRA"));
                movimientoAlmacen.setF4fecult(rs.getString("F4FECULT"));
                movimientoAlmacen.setF2coduse(rs.getString("F2CODUSE"));
                movimientoAlmacen.setRefere(rs.getString("Refere"));
                movimientoAlmacen.setF4contable(rs.getString("F4CONTABLE"));
                movimientoAlmacen.setF4correlativo(rs.getInt("F4CORRELATIVO"));
                movimientoAlmacen.setFlgOrigen(rs.getString("flg_Origen"));
                movimientoAlmacen.setFecCreacion(rs.getString("fec_creacion"));
                movimientoAlmacen.setHorCreacion(rs.getString("hor_creacion"));
                movimientoAlmacen.setCodUsuarioCreacion(rs.getInt("cod_usuario_creacion"));
                movimientoAlmacen.setFecActualizacion(rs.getString("fec_actualizacion"));
                movimientoAlmacen.setHorActualizacion(rs.getString("hor_actualizacion"));
                movimientoAlmacen.setCodUsuarioActualizacion(rs.getInt("cod_usuario_actualizacion"));
                movimientoAlmacen.setExportado(rs.getString("Exportado"));
                movimientoAlmacen.setImportado(rs.getString("Importado"));
                movimientoAlmacen.setFecImportacion(rs.getString("fec_importacion"));
                movimientoAlmacen.setHorImportacion(rs.getString("hor_importacion"));
                movimientoAlmacen.setCodUsuarioImp(rs.getInt("cod_usuario_imp"));
                movimientoAlmacen.setNumMovImportado(rs.getString("num_mov_importado"));
                movimientoAlmacen.setFlgFormVoucher(rs.getString("flg_formVoucher"));
                movimientoAlmacen.setCodSubConcepto(rs.getString("cod_sub_concepto"));
                movimientoAlmacen.setFlgAsientoContable(rs.getString("flg_AsientoContable"));
                movimientoAlmacen.setIdActivofijo(rs.getInt("id_activofijo"));
                movimientoAlmacen.setFecAsiento(rs.getString("fec_asiento"));
                movimientoAlmacen.setAnnoAsiento(rs.getString("anno_asiento"));
                movimientoAlmacen.setMesAsiento(rs.getString("mes_asiento"));
                movimientoAlmacen.setTipoAsiento(rs.getString("tipo_asiento"));
                movimientoAlmacen.setNumAsiento(rs.getInt("num_asiento"));
                movimientoAlmacen.setFecCreacionAsiento(rs.getString("fec_creacion_asiento"));
                movimientoAlmacen.setHorCreacionAsiento(rs.getString("hor_creacion_asiento"));
                movimientoAlmacen.setCodUsuarioAsiento(rs.getInt("cod_usuario_asiento"));
                movimientoAlmacen.setCodCentron(rs.getString("cod_centron"));
                movimientoAlmacen.setDesGlosa(rs.getString("des_Glosa"));
                movimientoAlmacen.setFlgTranscodigos(rs.getString("flg_transcodigos"));
                movimientoAlmacen.setFlgEditando(rs.getString("flg_editando"));
                movimientoAlmacen.setDesObservacion(rs.getString("des_observacion"));
                movimientoAlmacen.setCodUsuarioEditando(rs.getInt("cod_usuario_editando"));
                movimientoAlmacen.setFecUsuarioEditando(rs.getString("fec_usuario_editando"));
                movimientoAlmacen.setHorUsuarioEditando(rs.getString("hor_usuario_editando"));
                movimientoAlmacen.setAgmaePersona(cDAO.consultarObjCliente(movimientoAlmacen.getCodPersona()));

                lista.add(movimientoAlmacen);
            }
            if (!existe) {
                movimientoAlmacen = null;
                System.out.println("No se encontro datos - Listar Movimiento");
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
        return lista;

    }

    @Override
    public AimarMovAlmacenCab obtenerMovimientoAlmacen(AimarMovAlmacenCab mA) {

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        AimarMovAlmacenCab movimientoAlmacen = null;

        try {
            cn = Service.getConexion();
            String sql = "SELECT IdMovAlmCab, ruc_companyia, Anyo, cod_establecimiento, "
                    + "cod_centroc, Cod_Area, cod_almacen, Cod_TipoProducto, "
                    + "num_movimiento, Cod_TipoConcepto, num_documento, cod_persona, "
                    + "fec_movimiento, cod_concepto, cod_documento, tip_cambio, "
                    + "cod_moneda, F1TIPPRV, cod_establecimiento_des, cod_centroc_des, "
                    + "cod_almacen_des, cod_area_des, num_movimiento_des, num_factura, "
                    + "num_orden, num_imp, partida, F4ORDTRA, F4FECULT, F2CODUSE, "
                    + "Refere, F4CONTABLE, F4CORRELATIVO, flg_Origen, fec_creacion, "
                    + "hor_creacion, cod_usuario_creacion, fec_actualizacion, "
                    + "hor_actualizacion, cod_usuario_actualizacion, Exportado, "
                    + "Importado, fec_importacion, hor_importacion, cod_usuario_imp, "
                    + "num_mov_importado, flg_formVoucher, cod_sub_concepto, "
                    + "flg_AsientoContable, id_activofijo, fec_asiento, anno_asiento, "
                    + "mes_asiento, tipo_asiento, num_asiento, fec_creacion_asiento, "
                    + "hor_creacion_asiento, cod_usuario_asiento, cod_centron, "
                    + "des_Glosa, flg_transcodigos, flg_editando, des_observacion, "
                    + "cod_usuario_editando, fec_usuario_editando, hor_usuario_editando "
                    + "FROM AIMAR_MovAlmacenCab "
                    + "WHERE num_documento=?; ";

            ps = cn.prepareStatement(sql);
            ps.setString(1, mA.getNumDocumento());
            rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
                movimientoAlmacen = new AimarMovAlmacenCab();

                movimientoAlmacen.setIdMovAlmCab(rs.getInt("IdMovAlmCab"));
                movimientoAlmacen.setRucCompanyia(rs.getString("ruc_companyia"));
                movimientoAlmacen.setAnyo(rs.getString("Anyo"));
                movimientoAlmacen.setCodEstablecimiento(rs.getString("cod_establecimiento"));
                movimientoAlmacen.setCodCentroc(rs.getInt("cod_centroc"));
                movimientoAlmacen.setCodArea(rs.getInt("Cod_Area"));
                movimientoAlmacen.setCodAlmacen(rs.getInt("cod_almacen"));
                movimientoAlmacen.setCodTipoProducto(rs.getString("Cod_TipoProducto"));
                movimientoAlmacen.setNumMovimiento(rs.getString("num_movimiento"));
                movimientoAlmacen.setCodTipoConcepto(rs.getString("Cod_TipoConcepto"));
                movimientoAlmacen.setNumDocumento(rs.getString("num_documento"));
                movimientoAlmacen.setCodPersona(rs.getInt("cod_persona"));
                movimientoAlmacen.setFecMovimiento(rs.getDate("fec_movimiento"));
                movimientoAlmacen.setCodConcepto(rs.getString("cod_concepto"));
                movimientoAlmacen.setCodDocumento(rs.getString("cod_documento"));
                movimientoAlmacen.setTipCambio(rs.getDouble("tip_cambio"));
                movimientoAlmacen.setCodMoneda(rs.getString("cod_moneda"));
                movimientoAlmacen.setF1tipprv(rs.getString("F1TIPPRV"));
                movimientoAlmacen.setCodEstablecimientoDes(rs.getString("cod_establecimiento_des"));
                movimientoAlmacen.setCodCentrocDes(rs.getInt("cod_centroc_des"));
                movimientoAlmacen.setCodAlmacenDes(rs.getInt("cod_almacen_des"));
                movimientoAlmacen.setCodAreaDes(rs.getInt("cod_area_des"));
                movimientoAlmacen.setNumMovimientoDes(rs.getString("num_movimiento_des"));
                movimientoAlmacen.setNumFactura(rs.getString("num_factura"));
                movimientoAlmacen.setNumOrden(rs.getString("num_orden"));
                movimientoAlmacen.setNumImp(rs.getString("num_imp"));
                movimientoAlmacen.setPartida(rs.getString("partida"));
                movimientoAlmacen.setF4ordtra(rs.getString("F4ORDTRA"));
                movimientoAlmacen.setF4fecult(rs.getString("F4FECULT"));
                movimientoAlmacen.setF2coduse(rs.getString("F2CODUSE"));
                movimientoAlmacen.setRefere(rs.getString("Refere"));
                movimientoAlmacen.setF4contable(rs.getString("F4CONTABLE"));
                movimientoAlmacen.setF4correlativo(rs.getInt("F4CORRELATIVO"));
                movimientoAlmacen.setFlgOrigen(rs.getString("flg_Origen"));
                movimientoAlmacen.setFecCreacion(rs.getString("fec_creacion"));
                movimientoAlmacen.setHorCreacion(rs.getString("hor_creacion"));
                movimientoAlmacen.setCodUsuarioCreacion(rs.getInt("cod_usuario_creacion"));
                movimientoAlmacen.setFecActualizacion(rs.getString("fec_actualizacion"));
                movimientoAlmacen.setHorActualizacion(rs.getString("hor_actualizacion"));
                movimientoAlmacen.setCodUsuarioActualizacion(rs.getInt("cod_usuario_actualizacion"));
                movimientoAlmacen.setExportado(rs.getString("Exportado"));
                movimientoAlmacen.setImportado(rs.getString("Importado"));
                movimientoAlmacen.setFecImportacion(rs.getString("fec_importacion"));
                movimientoAlmacen.setHorImportacion(rs.getString("hor_importacion"));
                movimientoAlmacen.setCodUsuarioImp(rs.getInt("cod_usuario_imp"));
                movimientoAlmacen.setNumMovImportado(rs.getString("num_mov_importado"));
                movimientoAlmacen.setFlgFormVoucher(rs.getString("flg_formVoucher"));
                movimientoAlmacen.setCodSubConcepto(rs.getString("cod_sub_concepto"));
                movimientoAlmacen.setFlgAsientoContable(rs.getString("flg_AsientoContable"));
                movimientoAlmacen.setIdActivofijo(rs.getInt("id_activofijo"));
                movimientoAlmacen.setFecAsiento(rs.getString("fec_asiento"));
                movimientoAlmacen.setAnnoAsiento(rs.getString("anno_asiento"));
                movimientoAlmacen.setMesAsiento(rs.getString("mes_asiento"));
                movimientoAlmacen.setTipoAsiento(rs.getString("tipo_asiento"));
                movimientoAlmacen.setNumAsiento(rs.getInt("num_asiento"));
                movimientoAlmacen.setFecCreacionAsiento(rs.getString("fec_creacion_asiento"));
                movimientoAlmacen.setHorCreacionAsiento(rs.getString("hor_creacion_asiento"));
                movimientoAlmacen.setCodUsuarioAsiento(rs.getInt("cod_usuario_asiento"));
                movimientoAlmacen.setCodCentron(rs.getString("cod_centron"));
                movimientoAlmacen.setDesGlosa(rs.getString("des_Glosa"));
                movimientoAlmacen.setFlgTranscodigos(rs.getString("flg_transcodigos"));
                movimientoAlmacen.setFlgEditando(rs.getString("flg_editando"));
                movimientoAlmacen.setDesObservacion(rs.getString("des_observacion"));
                movimientoAlmacen.setCodUsuarioEditando(rs.getInt("cod_usuario_editando"));
                movimientoAlmacen.setFecUsuarioEditando(rs.getString("fec_usuario_editando"));
                movimientoAlmacen.setHorUsuarioEditando(rs.getString("hor_usuario_editando"));

            }
            if (!existe) {
                movimientoAlmacen = null;
                System.out.println("No se encontro datos - obtenerMovimiento ");
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
        return movimientoAlmacen;

    }

    @Override
    public String obtenerNroMovimientoRelNdMovInv(AvmovMovNotaDespachoDet notaDespacho) {

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean existe = false;
        String numMovimiento="";

        try {
            cn = Service.getConexion();
            String sql = "SELECT num_movimiento "
                    + "FROM AVMOV_REL_ND_MOVINV " 
                    + "WHERE (ruc_companyia=?) AND (num_vale=?);";

            ps = cn.prepareStatement(sql);
            ps.setString(1, notaDespacho.getRucCompanyia());
            ps.setString(2, notaDespacho.getNumVale());
            rs = ps.executeQuery();
            if (rs.next()) {
                existe = true;
                numMovimiento=rs.getString("num_movimiento");
                
                
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
        return numMovimiento;

    }

    @Override
    public void newMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen, AvmovMovNotaDespachoCab notaDespacho) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO AIMAR_MovAlmacenCab ("
                + "`ruc_companyia`, "
                + "`Anyo`, "
                + "`cod_establecimiento`, "
                + "`cod_centroc`, "
                + "`cod_area`, "
                + "`cod_almacen`, "
                + "`Cod_TipoProducto`, "
                + "`num_movimiento`, "
                + "`Cod_TipoConcepto`, "
                + "`num_documento`, "
                + "`cod_persona`, "
                + "`fec_movimiento`, "
                + "`cod_concepto`, "
                + "`cod_documento`, "
                + "`fec_creacion`, "
                + "`hor_creacion`, "
                + " `cod_usuario_creacion`"
                + ") "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?); ";
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        movimientoAlmacen.setFecCreacion(formatoFecha.format(fechaActual));
        movimientoAlmacen.setHorCreacion(formatoHora.format(fechaActual));
        movimientoAlmacen.setNumMovimiento(generaCorrelativo(movimientoAlmacen));
        
        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, movimientoAlmacen.getRucCompanyia());
            ps.setString(2, movimientoAlmacen.getAnyo());
            ps.setString(3, movimientoAlmacen.getCodEstablecimiento());
            ps.setInt(4, movimientoAlmacen.getCodCentroc());
            ps.setInt(5, movimientoAlmacen.getCodArea());
            ps.setInt(6, movimientoAlmacen.getCodAlmacen());
            ps.setString(7, movimientoAlmacen.getCodTipoProducto());
            ps.setString(8, movimientoAlmacen.getNumMovimiento());
            ps.setString(9, movimientoAlmacen.getCodTipoConcepto());
            ps.setString(10, movimientoAlmacen.getNumDocumento());
            ps.setInt(11, movimientoAlmacen.getCodPersona());
            ps.setDate(12, convertJavaDateToSqlDate(movimientoAlmacen.getFecMovimiento()));
            ps.setString(13, movimientoAlmacen.getCodConcepto());
            ps.setString(14, movimientoAlmacen.getCodDocumento());
            ps.setString(15, movimientoAlmacen.getFecCreacion());
            ps.setString(16, movimientoAlmacen.getHorCreacion());
            ps.setInt(17, movimientoAlmacen.getCodUsuarioCreacion());

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
        
        
        movimientoAlmacen.setIdMovAlmCab(obtenerMovimientoAlmacen(movimientoAlmacen).getIdMovAlmCab());
        NotaDespachoDAO nDDao = new NotaDespachoDAOImpl();
        notaDespacho.setIdMovValeCab(nDDao.obtenerIdNotaDespacho(notaDespacho).getIdMovValeCab());
        newRelMovAlmDetND(movimientoAlmacen, notaDespacho);
        
    }

    @Override
    public void updateMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE AIMAR_MovAlmacenCab SET "
                + "cod_persona=?, \n"
                + "fec_movimiento=?, \n"
                + "fec_actualizacion=?, \n"
                + "hor_actualizacion=?, \n"
                + "cod_usuario_actualizacion=? \n"
                + "WHERE num_documento=?; ";

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        movimientoAlmacen.setFecActualizacion(formatoFecha.format(fechaActual));
        movimientoAlmacen.setHorActualizacion(formatoHora.format(fechaActual));

        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, movimientoAlmacen.getCodPersona());
            ps.setDate(2, convertJavaDateToSqlDate(movimientoAlmacen.getFecMovimiento()));
            ps.setString(3, movimientoAlmacen.getFecActualizacion());
            ps.setString(4, movimientoAlmacen.getHorActualizacion());
            ps.setInt(5, movimientoAlmacen.getCodUsuarioActualizacion());
            ps.setString(6, movimientoAlmacen.getNumDocumento());
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
    public void deleteMovimientoAlmacen(AimarMovAlmacenCab movimientoAlmacen) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM AIMAR_MovAlmacenCab WHERE num_documento=?;";
        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setString(1, movimientoAlmacen.getNumDocumento());
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

    //EXTRAS
    public String ObtenerNumerador(AimarMovAlmacenCab movimientoAlmacen) {
        String numerador = "0";

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM");
        try {
            cn = Service.getConexion();
            String sql = "SELECT numerador FROM AIMAR_CodigosAlmacen \n"
                    + "WHERE (\n"
                    + "(ruc_companyia=?) \n"
                    + "AND (COD_establecimiento=?) \n"
                    + "AND (cod_centroc=?) \n"
                    + "AND (Cod_Ai_Almacen=? )"
                    + "AND (COD_AREA=?) \n"
                    + "AND (Mes=?) \n"
                    + "AND (Cod_TipoConcepto = ?)\n"
                    + "AND (Anyo=?)"
                    + ") ;";

            ps = cn.prepareStatement(sql);
            ps.setString(1, movimientoAlmacen.getRucCompanyia());
            ps.setString(2, movimientoAlmacen.getCodEstablecimiento());
            ps.setInt(3, movimientoAlmacen.getCodCentroc());
            ps.setInt(4, movimientoAlmacen.getCodAlmacen());
            ps.setInt(5, movimientoAlmacen.getCodArea());
            ps.setString(6, formatoFecha.format(movimientoAlmacen.getFecMovimiento()));
            ps.setString(7, movimientoAlmacen.getCodTipoConcepto());
            ps.setString(8, movimientoAlmacen.getAnyo());
            rs = ps.executeQuery();

            if (rs.next()) {

                numerador = rs.getString("numerador");
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
        return numerador;
    }

    public int longitudCorrelativo(AimarMovAlmacenCab movimientoAlmacen) {
        int longitud = 0;

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cn = Service.getConexion();
            String sql = "SELECT LONCORREMOVALM_Ai_ParaIn FROM AIMAR_ParamatrosIni WHERE ruc_companyia = ?";

            ps = cn.prepareStatement(sql);
            ps.setString(1, movimientoAlmacen.getRucCompanyia());

            rs = ps.executeQuery();

            if (rs.next()) {

                longitud = rs.getInt("LONCORREMOVALM_Ai_ParaIn");
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
        return longitud;
    }

    public String generaCorrelativo(AimarMovAlmacenCab movimientoAlmacen) {
        String correlativo = "";
        Integer numero;
        String numerador = ObtenerNumerador(movimientoAlmacen);
        numero = Integer.parseInt(numerador.substring((numerador.length() > 1 ? 3 : 0)));
        Integer i_longcorrelativo = longitudCorrelativo(movimientoAlmacen);
        numero++;
        String longCorre = String.valueOf(numero);

        for (int i = longCorre.length(); i < i_longcorrelativo; i++) {
            longCorre = "0" + longCorre;
        }
        SimpleDateFormat formatoFechaMes = new SimpleDateFormat("MM");
        correlativo = String.valueOf(movimientoAlmacen.getCodTipoConcepto()) + formatoFechaMes.format(movimientoAlmacen.getFecMovimiento()) + longCorre;

        Connection cn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        movimientoAlmacen.setFecCreacion(formatoFecha.format(fechaActual));
        movimientoAlmacen.setHorCreacion(formatoHora.format(fechaActual));

        try {
            cn = Service.getConexion();
            String sql = "";
            if (numerador.equals("0")) {

                sql = "INSERT INTO AIMAR_CodigosAlmacen ("
                        + "`ruc_companyia`, "
                        + "`COD_establecimiento`, "
                        + "`cod_centroc`, "
                        + "`Cod_Ai_Almacen`, "
                        + "`Cod_Area`, "
                        + "`Anyo`, "
                        + "`Mes`, "
                        + "`Cod_TipoConcepto`, "
                        + "`Cod_TipoProducto`, "
                        + "`Numerador`, "
                        + "`fec_creacion`, "
                        + "`hor_creacion`, "
                        + "`cod_usuario_creacion`) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";

                ps = cn.prepareStatement(sql);
                ps.setString(1, movimientoAlmacen.getRucCompanyia());
                ps.setString(2, movimientoAlmacen.getCodEstablecimiento());
                ps.setInt(3, movimientoAlmacen.getCodCentroc());
                ps.setInt(4, movimientoAlmacen.getCodAlmacen());
                ps.setInt(5, movimientoAlmacen.getCodArea());
                ps.setString(6, movimientoAlmacen.getAnyo());
                ps.setString(7, formatoFechaMes.format(movimientoAlmacen.getFecMovimiento()));
                ps.setString(8, movimientoAlmacen.getCodTipoConcepto());
                ps.setString(9, movimientoAlmacen.getCodTipoProducto());
                ps.setString(10, correlativo);
                ps.setString(11, movimientoAlmacen.getFecCreacion());
                ps.setString(12, movimientoAlmacen.getHorCreacion());
                ps.setInt(13, movimientoAlmacen.getCodUsuarioCreacion());

            } else {
                sql = "UPDATE AIMAR_CodigosAlmacen \n"
                        + "SET numerador=?, fec_actualizacion=?, hor_actualizacion=?, cod_usuario_actualizacion=? "
                        + "WHERE (\n"
                        + "((ruc_companyia)=?) \n"
                        + "AND ((COD_establecimiento)=?) \n"
                        + "AND ((cod_centroc)=?) \n"
                        + "AND ((Cod_Ai_Almacen)=? "
                        + "AND COD_AREA=?) \n"
                        + "AND ((Mes)=?) \n"
                        + "AND ((Cod_TipoConcepto) = ?)\n"
                        + ") \n"
                        + "AND Anyo=? ;";

                ps = cn.prepareStatement(sql);
                ps.setString(1, correlativo);
                ps.setString(2, movimientoAlmacen.getFecCreacion());
                ps.setString(3, movimientoAlmacen.getHorCreacion());
                ps.setInt(4, movimientoAlmacen.getCodUsuarioCreacion());
                ps.setString(5, movimientoAlmacen.getRucCompanyia());
                ps.setString(6, movimientoAlmacen.getCodEstablecimiento());
                ps.setInt(7, movimientoAlmacen.getCodCentroc());
                ps.setInt(8, movimientoAlmacen.getCodAlmacen());
                ps.setInt(9, movimientoAlmacen.getCodArea());
                ps.setString(10, formatoFechaMes.format(movimientoAlmacen.getFecMovimiento()));
                ps.setString(11, movimientoAlmacen.getCodTipoConcepto());
                ps.setString(12, movimientoAlmacen.getAnyo());

            }

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

        return correlativo;
    }

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    public void newRelMovAlmDetND(AimarMovAlmacenCab movimientoAlmacen, AvmovMovNotaDespachoCab notaDespacho) {
        Connection cn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO AVMOV_REL_ND_MOVINV ("
                + "`id_MovValeCab`,"
                + "`IdMovAlmCab`,"
                + "`ruc_companyia`, "
                + "`num_vale`, "
                + "`cod_establecimiento`, "
                + "`cod_centroc`, "
                + "`cod_area`, "
                + "`cod_almacen`, "
                + "`Cod_TipoProducto`, "
                + "`num_movimiento`, "
                + "`fec_creacion`, "
                + "`hor_creacion`, "
                + " `cod_usuario_creacion`"
                + ") "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?); ";

        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        movimientoAlmacen.setFecCreacion(formatoFecha.format(fechaActual));
        movimientoAlmacen.setHorCreacion(formatoHora.format(fechaActual));
        try {
            cn = Service.getConexion();
            ps = cn.prepareStatement(sql);
            ps.setInt(1, notaDespacho.getIdMovValeCab());
            ps.setInt(2, movimientoAlmacen.getIdMovAlmCab());
            ps.setString(3, movimientoAlmacen.getRucCompanyia());
            ps.setString(4, notaDespacho.getNumVale());
            ps.setString(5, movimientoAlmacen.getCodEstablecimiento());
            ps.setInt(6, movimientoAlmacen.getCodCentroc());
            ps.setInt(7, movimientoAlmacen.getCodArea());
            ps.setInt(8, movimientoAlmacen.getCodAlmacen());
            ps.setString(9, movimientoAlmacen.getCodTipoProducto());
            ps.setString(10, movimientoAlmacen.getNumMovimiento());
            ps.setString(11, movimientoAlmacen.getFecCreacion());
            ps.setString(12, movimientoAlmacen.getHorCreacion());
            ps.setInt(13, movimientoAlmacen.getCodUsuarioCreacion());

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
    }

}
