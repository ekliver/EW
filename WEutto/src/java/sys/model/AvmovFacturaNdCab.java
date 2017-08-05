package sys.model;

import java.util.Date;

public class AvmovFacturaNdCab implements java.io.Serializable {

    private int idFacturaCab;
    private String numSerie;
    private String numFactura;
    private String numMovimiento;
    private int idNotaDespachoCab;
    private String rucCompanyia;
    private String codEstablecimiento;
    private int codCentroc;
    private int codArea;
    private int codAlmacen;
    private String numAnyio;
    private Date fecFactura;
    private String numNotaDespacho;
    private int codPersona;
    private String numSerieGuiaRemision;
    private String numGuiaRemision;
    private String codMoneda;
    private Double valDolar;
    private String flgTipoFactura;
    private int flgMonedaDiferente;
    private Double valIgv;
    private Double numImporteSubtotal;
    private Double numImporteIgv;
    private Double numImporteTotal;
    private String desImporteTotal;
    private String flgPrioridad;
    private String flgEstado;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    private String codTipoDocumento;

    //Add
    private String ZnomMoneda;
    private String ZabrMoneda;
    private String ZnomCompanya;
    private String ZrucPersona;
    private String ZnomPersona;
    private String ZdirPersona;
    private String ZdisPersona;
    private Double ZvalorSubTotalSol;
    private Double ZvalorIgvSol;
    private Double ZvalorTotalSol;
    private Double ZvalorSubTotalDolar;
    private Double ZvalorIgvDolar;
    private Double ZvalorTotalDolar;
    private String ZnomPrioridad;
    private String ZnomEstado;
    
//Estado de botones
    private String ZestadoImprimir;
    private String ZestadoEditar;
    private String ZestadoAnular;
    private String zestadoGuiaRemision;
    
    
    public AvmovFacturaNdCab() {
    }

    public int getIdFacturaCab() {
        return idFacturaCab;
    }

    public void setIdFacturaCab(int idFacturaCab) {
        this.idFacturaCab = idFacturaCab;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getNumMovimiento() {
        return numMovimiento;
    }

    public void setNumMovimiento(String numMovimiento) {
        this.numMovimiento = numMovimiento;
    }

    public int getIdNotaDespachoCab() {
        return idNotaDespachoCab;
    }

    public void setIdNotaDespachoCab(int idNotaDespachoCab) {
        this.idNotaDespachoCab = idNotaDespachoCab;
    }

 

    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getCodEstablecimiento() {
        return codEstablecimiento;
    }

    public void setCodEstablecimiento(String codEstablecimiento) {
        this.codEstablecimiento = codEstablecimiento;
    }

    public int getCodCentroc() {
        return codCentroc;
    }

    public void setCodCentroc(int codCentroc) {
        this.codCentroc = codCentroc;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public int getCodAlmacen() {
        return codAlmacen;
    }

    public void setCodAlmacen(int codAlmacen) {
        this.codAlmacen = codAlmacen;
    }

    public String getNumAnyio() {
        return numAnyio;
    }

    public void setNumAnyio(String numAnyio) {
        this.numAnyio = numAnyio;
    }

    public Date getFecFactura() {
        return fecFactura;
    }

    public void setFecFactura(Date fecFactura) {
        this.fecFactura = fecFactura;
    }

    public String getNumNotaDespacho() {
        return numNotaDespacho;
    }

    public void setNumNotaDespacho(String numNotaDespacho) {
        this.numNotaDespacho = numNotaDespacho;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNumGuiaRemision() {
        return numGuiaRemision;
    }

    public void setNumGuiaRemision(String numGuiaRemision) {
        this.numGuiaRemision = numGuiaRemision;
    }

    public String getCodMoneda() {
        return codMoneda;
    }

    public void setCodMoneda(String codMoneda) {
        this.codMoneda = codMoneda;
    }

    public Double getValDolar() {
        return valDolar;
    }

    public void setValDolar(Double valDolar) {
        this.valDolar = valDolar;
    }

    public String getFlgTipoFactura() {
        return flgTipoFactura;
    }

    public void setFlgTipoFactura(String flgTipoFactura) {
        this.flgTipoFactura = flgTipoFactura;
    }

    public int getFlgMonedaDiferente() {
        return flgMonedaDiferente;
    }

    public void setFlgMonedaDiferente(int flgMonedaDiferente) {
        this.flgMonedaDiferente = flgMonedaDiferente;
    }

    public Double getValIgv() {
        return valIgv;
    }

    public void setValIgv(Double valIgv) {
        this.valIgv = valIgv;
    }

    public Double getNumImporteSubtotal() {
        return numImporteSubtotal;
    }

    public void setNumImporteSubtotal(Double numImporteSubtotal) {
        this.numImporteSubtotal = numImporteSubtotal;
    }

    public Double getNumImporteIgv() {
        return numImporteIgv;
    }

    public void setNumImporteIgv(Double numImporteIgv) {
        this.numImporteIgv = numImporteIgv;
    }

    public Double getNumImporteTotal() {
        return numImporteTotal;
    }

    public void setNumImporteTotal(Double numImporteTotal) {
        this.numImporteTotal = numImporteTotal;
    }

    public String getDesImporteTotal() {
        return desImporteTotal;
    }

    public void setDesImporteTotal(String desImporteTotal) {
        this.desImporteTotal = desImporteTotal;
    }

    public String getFlgPrioridad() {
        return flgPrioridad;
    }

    public void setFlgPrioridad(String flgPrioridad) {
        this.flgPrioridad = flgPrioridad;
    }

    public String getFlgEstado() {
        return flgEstado;
    }

    public void setFlgEstado(String flgEstado) {
        this.flgEstado = flgEstado;
    }

    public String getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getHorCreacion() {
        return horCreacion;
    }

    public void setHorCreacion(String horCreacion) {
        this.horCreacion = horCreacion;
    }

    public int getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(int codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public String getFecActualizacion() {
        return fecActualizacion;
    }

    public void setFecActualizacion(String fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public String getHorActualizacion() {
        return horActualizacion;
    }

    public void setHorActualizacion(String horActualizacion) {
        this.horActualizacion = horActualizacion;
    }

    public int getCodUsuarioActualizacion() {
        return codUsuarioActualizacion;
    }

    public void setCodUsuarioActualizacion(int codUsuarioActualizacion) {
        this.codUsuarioActualizacion = codUsuarioActualizacion;
    }

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }
    
    
    public String getZnomMoneda() {
        return ZnomMoneda;
    }

    public void setZnomMoneda(String ZnomMoneda) {
        this.ZnomMoneda = ZnomMoneda;
    }

    public String getZabrMoneda() {
        return ZabrMoneda;
    }

    public void setZabrMoneda(String ZabrMoneda) {
        this.ZabrMoneda = ZabrMoneda;
    }

    public String getZnomCompanya() {
        return ZnomCompanya;
    }

    public void setZnomCompanya(String ZnomCompanya) {
        this.ZnomCompanya = ZnomCompanya;
    }

    public String getZrucPersona() {
        return ZrucPersona;
    }

    public void setZrucPersona(String ZrucPersona) {
        this.ZrucPersona = ZrucPersona;
    }

    public String getZnomPersona() {
        return ZnomPersona;
    }

    public void setZnomPersona(String ZnomPersona) {
        this.ZnomPersona = ZnomPersona;
    }

    public String getZdirPersona() {
        return ZdirPersona;
    }

    public void setZdirPersona(String ZdirPersona) {
        this.ZdirPersona = ZdirPersona;
    }

    public String getZdisPersona() {
        return ZdisPersona;
    }

    public void setZdisPersona(String ZdisPersona) {
        this.ZdisPersona = ZdisPersona;
    }

    public Double getZvalorSubTotalSol() {
        return ZvalorSubTotalSol;
    }

    public void setZvalorSubTotalSol(Double ZvalorSubTotalSol) {
        this.ZvalorSubTotalSol = ZvalorSubTotalSol;
    }

    public Double getZvalorIgvSol() {
        return ZvalorIgvSol;
    }

    public void setZvalorIgvSol(Double ZvalorIgvSol) {
        this.ZvalorIgvSol = ZvalorIgvSol;
    }

    public Double getZvalorTotalSol() {
        return ZvalorTotalSol;
    }

    public void setZvalorTotalSol(Double ZvalorTotalSol) {
        this.ZvalorTotalSol = ZvalorTotalSol;
    }

    public Double getZvalorSubTotalDolar() {
        return ZvalorSubTotalDolar;
    }

    public void setZvalorSubTotalDolar(Double ZvalorSubTotalDolar) {
        this.ZvalorSubTotalDolar = ZvalorSubTotalDolar;
    }

    public Double getZvalorIgvDolar() {
        return ZvalorIgvDolar;
    }

    public void setZvalorIgvDolar(Double ZvalorIgvDolar) {
        this.ZvalorIgvDolar = ZvalorIgvDolar;
    }

    public Double getZvalorTotalDolar() {
        return ZvalorTotalDolar;
    }

    public void setZvalorTotalDolar(Double ZvalorTotalDolar) {
        this.ZvalorTotalDolar = ZvalorTotalDolar;
    }

    public String getZnomPrioridad() {
        return ZnomPrioridad;
    }

    public void setZnomPrioridad(String ZnomPrioridad) {
        this.ZnomPrioridad = ZnomPrioridad;
    }

    public String getZnomEstado() {
        return ZnomEstado;
    }

    public void setZnomEstado(String ZnomEstado) {
        this.ZnomEstado = ZnomEstado;
    }

    public String getZestadoImprimir() {
        return ZestadoImprimir;
    }

    public void setZestadoImprimir(String ZestadoImprimir) {
        this.ZestadoImprimir = ZestadoImprimir;
    }

    public String getZestadoEditar() {
        return ZestadoEditar;
    }

    public void setZestadoEditar(String ZestadoEditar) {
        this.ZestadoEditar = ZestadoEditar;
    }

    public String getZestadoAnular() {
        return ZestadoAnular;
    }

    public void setZestadoAnular(String ZestadoAnular) {
        this.ZestadoAnular = ZestadoAnular;
    }

    public String getZestadoGuiaRemision() {
        return zestadoGuiaRemision;
    }

    public void setZestadoGuiaRemision(String zestadoGuiaRemision) {
        this.zestadoGuiaRemision = zestadoGuiaRemision;
    }

    public String getNumSerieGuiaRemision() {
        return numSerieGuiaRemision;
    }

    public void setNumSerieGuiaRemision(String numSerieGuiaRemision) {
        this.numSerieGuiaRemision = numSerieGuiaRemision;
    }

    
}
