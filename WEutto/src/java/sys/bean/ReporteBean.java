/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
public class ReporteBean implements Serializable {

    private BarChartModel barVentas;
    private PieChartModel pieModel1;

    public ReporteBean() {

        pieModel1 = new PieChartModel();
        barVentas = new BarChartModel();

        ChartSeries mes = new ChartSeries();

        mes.setLabel("Meses");
        mes.set("Enero", 52);
        mes.set("Marzo", 60);
        mes.set("Abril", 110);
        mes.set("Mayo", 135);
        mes.set("Junio", 120);

        barVentas.addSeries(mes);
barVentas.setSeriesColors("4DCDFC");
        barVentas.setTitle("Bar Chart");
        barVentas.setLegendPosition("ne");

        Axis xAxis = barVentas.getAxis(AxisType.X);
        xAxis.setLabel("Ventas del año");

        Axis yAxis = barVentas.getAxis(AxisType.Y);
        yAxis.setLabel("Soles");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    public BarChartModel getBarVentas() {
        return barVentas;
    }

    public void setBarVentas(BarChartModel barVentas) {
        this.barVentas = barVentas;
    }

    public PieChartModel getPieModel1() {

        return pieModel1;
    }

    public void setPieModel1(PieChartModel pieModel1) {
        this.pieModel1 = pieModel1;
    }

    public void datosPie() {
        pieModel1.set("Brand 1", 540);
        pieModel1.set("Brand 2", 325);
        pieModel1.set("Brand 3", 702);
        pieModel1.set("Brand 4", 421);

        pieModel1.setTitle("Simple Pie");
        pieModel1.setLegendPosition("w");
    }

}
