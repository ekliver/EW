package sys.model;

import java.util.Date;

public class AimarMovAlmacenCab  implements java.io.Serializable {


     private int idMovAlmCab;
     private String rucCompanyia;
     private String anyo;
     private String codEstablecimiento;
     private int codCentroc;
     private int codArea;
     private int codAlmacen;
     private String codTipoProducto;
     private String numMovimiento;
     private String codTipoConcepto;
     private String numDocumento;
     private int codPersona;
     private Date fecMovimiento;
     private String codConcepto;
     private String codDocumento;
     private Double tipCambio;
     private String codMoneda;
     private String f1tipprv;
     private String codEstablecimientoDes;
     private int codCentrocDes;
     private int codAlmacenDes;
     private int codAreaDes;
     private String numMovimientoDes;
     private String numFactura;
     private String numOrden;
     private String numImp;
     private String partida;
     private String f4ordtra;
     private String f4fecult;
     private String f2coduse;
     private String refere;
     private String f4contable;
     private int f4correlativo;
     private String flgOrigen;
     private String fecCreacion;
     private String horCreacion;
     private int codUsuarioCreacion;
     private String fecActualizacion;
     private String horActualizacion;
     private int codUsuarioActualizacion;
     private String exportado;
     private String importado;
     private String fecImportacion;
     private String horImportacion;
     private int codUsuarioImp;
     private String numMovImportado;
     private String flgFormVoucher;
     private String codSubConcepto;
     private String flgAsientoContable;
     private int idActivofijo;
     private String fecAsiento;
     private String annoAsiento;
     private String mesAsiento;
     private String tipoAsiento;
     private int numAsiento;
     private String fecCreacionAsiento;
     private String horCreacionAsiento;
     private int codUsuarioAsiento;
     private String codCentron;
     private String desGlosa;
     private String flgTranscodigos;
     private String flgEditando;
     private String desObservacion;
     private int codUsuarioEditando;
     private String fecUsuarioEditando;
     private String horUsuarioEditando;
private AgmaePersona agmaePersona;
     
     
    public AimarMovAlmacenCab() {
         agmaePersona=new AgmaePersona();
    }

    public int getIdMovAlmCab() {
        return idMovAlmCab;
    }

    public void setIdMovAlmCab(int idMovAlmCab) {
        this.idMovAlmCab = idMovAlmCab;
    }

    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getAnyo() {
        return anyo;
    }

    public void setAnyo(String anyo) {
        this.anyo = anyo;
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

    public String getCodTipoProducto() {
        return codTipoProducto;
    }

    public void setCodTipoProducto(String codTipoProducto) {
        this.codTipoProducto = codTipoProducto;
    }

    public String getNumMovimiento() {
        return numMovimiento;
    }

    public void setNumMovimiento(String numMovimiento) {
        this.numMovimiento = numMovimiento;
    }

    public String getCodTipoConcepto() {
        return codTipoConcepto;
    }

    public void setCodTipoConcepto(String codTipoConcepto) {
        this.codTipoConcepto = codTipoConcepto;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public Date getFecMovimiento() {
        return fecMovimiento;
    }

    public void setFecMovimiento(Date fecMovimiento) {
        this.fecMovimiento = fecMovimiento;
    }

    public String getCodConcepto() {
        return codConcepto;
    }

    public void setCodConcepto(String codConcepto) {
        this.codConcepto = codConcepto;
    }

    public String getCodDocumento() {
        return codDocumento;
    }

    public void setCodDocumento(String codDocumento) {
        this.codDocumento = codDocumento;
    }

    public Double getTipCambio() {
        return tipCambio;
    }

    public void setTipCambio(Double tipCambio) {
        this.tipCambio = tipCambio;
    }

    public String getCodMoneda() {
        return codMoneda;
    }

    public void setCodMoneda(String codMoneda) {
        this.codMoneda = codMoneda;
    }

    public String getF1tipprv() {
        return f1tipprv;
    }

    public void setF1tipprv(String f1tipprv) {
        this.f1tipprv = f1tipprv;
    }

    public String getCodEstablecimientoDes() {
        return codEstablecimientoDes;
    }

    public void setCodEstablecimientoDes(String codEstablecimientoDes) {
        this.codEstablecimientoDes = codEstablecimientoDes;
    }

    public int getCodCentrocDes() {
        return codCentrocDes;
    }

    public void setCodCentrocDes(int codCentrocDes) {
        this.codCentrocDes = codCentrocDes;
    }

    public int getCodAlmacenDes() {
        return codAlmacenDes;
    }

    public void setCodAlmacenDes(int codAlmacenDes) {
        this.codAlmacenDes = codAlmacenDes;
    }

    public int getCodAreaDes() {
        return codAreaDes;
    }

    public void setCodAreaDes(int codAreaDes) {
        this.codAreaDes = codAreaDes;
    }

    public String getNumMovimientoDes() {
        return numMovimientoDes;
    }

    public void setNumMovimientoDes(String numMovimientoDes) {
        this.numMovimientoDes = numMovimientoDes;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(String numOrden) {
        this.numOrden = numOrden;
    }

    public String getNumImp() {
        return numImp;
    }

    public void setNumImp(String numImp) {
        this.numImp = numImp;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getF4ordtra() {
        return f4ordtra;
    }

    public void setF4ordtra(String f4ordtra) {
        this.f4ordtra = f4ordtra;
    }

    public String getF4fecult() {
        return f4fecult;
    }

    public void setF4fecult(String f4fecult) {
        this.f4fecult = f4fecult;
    }

    public String getF2coduse() {
        return f2coduse;
    }

    public void setF2coduse(String f2coduse) {
        this.f2coduse = f2coduse;
    }

    public String getRefere() {
        return refere;
    }

    public void setRefere(String refere) {
        this.refere = refere;
    }

    public String getF4contable() {
        return f4contable;
    }

    public void setF4contable(String f4contable) {
        this.f4contable = f4contable;
    }

    public int getF4correlativo() {
        return f4correlativo;
    }

    public void setF4correlativo(int f4correlativo) {
        this.f4correlativo = f4correlativo;
    }

    public String getFlgOrigen() {
        return flgOrigen;
    }

    public void setFlgOrigen(String flgOrigen) {
        this.flgOrigen = flgOrigen;
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

    public String getExportado() {
        return exportado;
    }

    public void setExportado(String exportado) {
        this.exportado = exportado;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }

    public String getFecImportacion() {
        return fecImportacion;
    }

    public void setFecImportacion(String fecImportacion) {
        this.fecImportacion = fecImportacion;
    }

    public String getHorImportacion() {
        return horImportacion;
    }

    public void setHorImportacion(String horImportacion) {
        this.horImportacion = horImportacion;
    }

    public int getCodUsuarioImp() {
        return codUsuarioImp;
    }

    public void setCodUsuarioImp(int codUsuarioImp) {
        this.codUsuarioImp = codUsuarioImp;
    }

    public String getNumMovImportado() {
        return numMovImportado;
    }

    public void setNumMovImportado(String numMovImportado) {
        this.numMovImportado = numMovImportado;
    }

    public String getFlgFormVoucher() {
        return flgFormVoucher;
    }

    public void setFlgFormVoucher(String flgFormVoucher) {
        this.flgFormVoucher = flgFormVoucher;
    }

    public String getCodSubConcepto() {
        return codSubConcepto;
    }

    public void setCodSubConcepto(String codSubConcepto) {
        this.codSubConcepto = codSubConcepto;
    }

    public String getFlgAsientoContable() {
        return flgAsientoContable;
    }

    public void setFlgAsientoContable(String flgAsientoContable) {
        this.flgAsientoContable = flgAsientoContable;
    }

    public int getIdActivofijo() {
        return idActivofijo;
    }

    public void setIdActivofijo(int idActivofijo) {
        this.idActivofijo = idActivofijo;
    }

    public String getFecAsiento() {
        return fecAsiento;
    }

    public void setFecAsiento(String fecAsiento) {
        this.fecAsiento = fecAsiento;
    }

    public String getAnnoAsiento() {
        return annoAsiento;
    }

    public void setAnnoAsiento(String annoAsiento) {
        this.annoAsiento = annoAsiento;
    }

    public String getMesAsiento() {
        return mesAsiento;
    }

    public void setMesAsiento(String mesAsiento) {
        this.mesAsiento = mesAsiento;
    }

    public String getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(String tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public String getFecCreacionAsiento() {
        return fecCreacionAsiento;
    }

    public void setFecCreacionAsiento(String fecCreacionAsiento) {
        this.fecCreacionAsiento = fecCreacionAsiento;
    }

    public String getHorCreacionAsiento() {
        return horCreacionAsiento;
    }

    public void setHorCreacionAsiento(String horCreacionAsiento) {
        this.horCreacionAsiento = horCreacionAsiento;
    }

    public int getCodUsuarioAsiento() {
        return codUsuarioAsiento;
    }

    public void setCodUsuarioAsiento(int codUsuarioAsiento) {
        this.codUsuarioAsiento = codUsuarioAsiento;
    }

    public String getCodCentron() {
        return codCentron;
    }

    public void setCodCentron(String codCentron) {
        this.codCentron = codCentron;
    }

    public String getDesGlosa() {
        return desGlosa;
    }

    public void setDesGlosa(String desGlosa) {
        this.desGlosa = desGlosa;
    }

    public String getFlgTranscodigos() {
        return flgTranscodigos;
    }

    public void setFlgTranscodigos(String flgTranscodigos) {
        this.flgTranscodigos = flgTranscodigos;
    }

    public String getFlgEditando() {
        return flgEditando;
    }

    public void setFlgEditando(String flgEditando) {
        this.flgEditando = flgEditando;
    }

    public String getDesObservacion() {
        return desObservacion;
    }

    public void setDesObservacion(String desObservacion) {
        this.desObservacion = desObservacion;
    }

    public int getCodUsuarioEditando() {
        return codUsuarioEditando;
    }

    public void setCodUsuarioEditando(int codUsuarioEditando) {
        this.codUsuarioEditando = codUsuarioEditando;
    }

    public String getFecUsuarioEditando() {
        return fecUsuarioEditando;
    }

    public void setFecUsuarioEditando(String fecUsuarioEditando) {
        this.fecUsuarioEditando = fecUsuarioEditando;
    }

    public String getHorUsuarioEditando() {
        return horUsuarioEditando;
    }

    public void setHorUsuarioEditando(String horUsuarioEditando) {
        this.horUsuarioEditando = horUsuarioEditando;
    }

    public AgmaePersona getAgmaePersona() {
        return agmaePersona;
    }

    public void setAgmaePersona(AgmaePersona agmaePersona) {
        this.agmaePersona = agmaePersona;
    }





}


