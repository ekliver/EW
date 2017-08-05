package sys.clasesAuxiliares;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import sys.util.Service;

public class reportesNotaDespacho {

    public void getReporteNotaDespacho(String ruta, String numVale) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Connection conexion;

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
        conexion = DriverManager.getConnection("jdbc:odbc:access", "", "");
//    Class.forName("com.mysql.jdbc.Driver").newInstance();
//    conexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/facturacion","root","root");

        //Se define los parametros que el reporte necesita
        Map parameter = new HashMap();
//    parameter.put("codCliente", codC);
//    parameter.put("codVendedor", codV);
//    parameter.put("codFactura", codF);

        parameter.put("numVale", numVale);

        try {

            File file = new File(ruta);
            //para poder invocar los elementos externos de la aplicacion
            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            httpServletResponse.setContentType("application/pdf");
            httpServletResponse.addHeader("Content-Type", "application/pdf");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conexion);

            JRExporter jrExporter = null;
            jrExporter = new JRPdfExporter();

            jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            jrExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, httpServletResponse.getOutputStream());

            if (jrExporter != null) {
                try {
                    jrExporter.exportReport();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getReporteFactura(String ruta, int idFac) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Connection conexion;

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
        conexion = DriverManager.getConnection("jdbc:odbc:access", "", "");

        Map parameter = new HashMap();

        parameter.put("idFac", idFac);

        try {

            File file = new File(ruta);

            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            httpServletResponse.setContentType("application/pdf");
            httpServletResponse.addHeader("Content-Type", "application/pdf");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conexion);

            JRExporter jrExporter = null;
            jrExporter = new JRPdfExporter();

            jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            jrExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, httpServletResponse.getOutputStream());

            if (jrExporter != null) {
                try {
                    jrExporter.exportReport();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getReporteGuiaRemision(String ruta, int idGR) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Connection conexion;

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
        conexion = DriverManager.getConnection("jdbc:odbc:access", "", "");

        Map parameter = new HashMap();

        parameter.put("idGR", idGR);

        try {

            File file = new File(ruta);

            HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
            httpServletResponse.setContentType("application/pdf");
            httpServletResponse.addHeader("Content-Type", "application/pdf");

            JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(file.getPath());

            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conexion);

            JRExporter jrExporter = null;
            jrExporter = new JRPdfExporter();

            jrExporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            jrExporter.setParameter(JRExporterParameter.OUTPUT_STREAM, httpServletResponse.getOutputStream());

            if (jrExporter != null) {
                try {
                    jrExporter.exportReport();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
