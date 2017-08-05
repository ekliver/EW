package sys.model;

public class AimarMovAlmacenDet implements java.io.Serializable {

    private int idMovAlmDet;
    private int idMovAlmCab;
    private String rucCompanyia;
    private String anyo;
    private String codEstablecimiento;
    private int codCentroc;
    private int codArea;
    private int codAlmacen;
    private String numMovimiento;
    private int idCam;
    private String codProducto;
    private String codTipoProducto;
    private int codSector;
    private int numCantidad;
    private double valVtaProd;
    private double impItem;
    private String jcg;
    private String refere;
    private double valVtaSol;
    private double impItemSol;
    private double valVtaDol;
    private double impItemDol;
    private int f3saldoc;
    private int f3saldom;
    private int f3salpep;
    private String f2codalm;
    private String f4fecval;
    private int f4correla;
    private int f4correlativo;
    private int flgUltimoCostoProm;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    private int costoPromSoles;
    private int costoPromDolar;
    private String exportado;
    private String importado;
    private String fecImportacion;
    private String horImportacion;
    private int codUsuarioImp;
    private String nroOrden;
    private int corrOrden;
    private int corrOrdenDetalle;
    private String flgAjustado;
    private String fecAjustado;
    private String horAjustado;
    private int codUsuarioAjustado;
    private int codPresentacion;
    private int numCantidadPresentacion;
    private String codUm;
    private int valEquivalencia;
    private int codCampoMostrar;
    private int ctdFactura;
    private String codTransferido;
    private int idActivofijo;
    private String codActivofijo;
    private int idNotaDespachoDet;

    private AimarProductos aimarProductos;

    public AimarMovAlmacenDet() {
        aimarProductos = new AimarProductos();
    }

    public int getIdMovAlmDet() {
        return idMovAlmDet;
    }

    public void setIdMovAlmDet(int idMovAlmDet) {
        this.idMovAlmDet = idMovAlmDet;
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

    public String getNumMovimiento() {
        return numMovimiento;
    }

    public void setNumMovimiento(String numMovimiento) {
        this.numMovimiento = numMovimiento;
    }

    public int getIdCam() {
        return idCam;
    }

    public void setIdCam(int idCam) {
        this.idCam = idCam;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCodTipoProducto() {
        return codTipoProducto;
    }

    public void setCodTipoProducto(String codTipoProducto) {
        this.codTipoProducto = codTipoProducto;
    }

    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public int getNumCantidad() {
        return numCantidad;
    }

    public void setNumCantidad(int numCantidad) {
        this.numCantidad = numCantidad;
    }

    public Double getValVtaProd() {
        return valVtaProd;
    }

    public void setValVtaProd(Double valVtaProd) {
        this.valVtaProd = valVtaProd;
    }

    public double getImpItem() {
        return impItem;
    }

    public void setImpItem(double impItem) {
        this.impItem = impItem;
    }

    public String getJcg() {
        return jcg;
    }

    public void setJcg(String jcg) {
        this.jcg = jcg;
    }

    public String getRefere() {
        return refere;
    }

    public void setRefere(String refere) {
        this.refere = refere;
    }

    public double getValVtaSol() {
        return valVtaSol;
    }

    public void setValVtaSol(double valVtaSol) {
        this.valVtaSol = valVtaSol;
    }

    public double getImpItemSol() {
        return impItemSol;
    }

    public void setImpItemSol(double impItemSol) {
        this.impItemSol = impItemSol;
    }

    public double getValVtaDol() {
        return valVtaDol;
    }

    public void setValVtaDol(double valVtaDol) {
        this.valVtaDol = valVtaDol;
    }

    public double getImpItemDol() {
        return impItemDol;
    }

    public void setImpItemDol(double impItemDol) {
        this.impItemDol = impItemDol;
    }

    public int getF3saldoc() {
        return f3saldoc;
    }

    public void setF3saldoc(int f3saldoc) {
        this.f3saldoc = f3saldoc;
    }

    public int getF3saldom() {
        return f3saldom;
    }

    public void setF3saldom(int f3saldom) {
        this.f3saldom = f3saldom;
    }

    public int getF3salpep() {
        return f3salpep;
    }

    public void setF3salpep(int f3salpep) {
        this.f3salpep = f3salpep;
    }

    public String getF2codalm() {
        return f2codalm;
    }

    public void setF2codalm(String f2codalm) {
        this.f2codalm = f2codalm;
    }

    public String getF4fecval() {
        return f4fecval;
    }

    public void setF4fecval(String f4fecval) {
        this.f4fecval = f4fecval;
    }

    public int getF4correla() {
        return f4correla;
    }

    public void setF4correla(int f4correla) {
        this.f4correla = f4correla;
    }

    public int getF4correlativo() {
        return f4correlativo;
    }

    public void setF4correlativo(int f4correlativo) {
        this.f4correlativo = f4correlativo;
    }

    public int getFlgUltimoCostoProm() {
        return flgUltimoCostoProm;
    }

    public void setFlgUltimoCostoProm(int flgUltimoCostoProm) {
        this.flgUltimoCostoProm = flgUltimoCostoProm;
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

    public int getCostoPromSoles() {
        return costoPromSoles;
    }

    public void setCostoPromSoles(int costoPromSoles) {
        this.costoPromSoles = costoPromSoles;
    }

    public int getCostoPromDolar() {
        return costoPromDolar;
    }

    public void setCostoPromDolar(int costoPromDolar) {
        this.costoPromDolar = costoPromDolar;
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

    public String getNroOrden() {
        return nroOrden;
    }

    public void setNroOrden(String nroOrden) {
        this.nroOrden = nroOrden;
    }

    public int getCorrOrden() {
        return corrOrden;
    }

    public void setCorrOrden(int corrOrden) {
        this.corrOrden = corrOrden;
    }

    public int getCorrOrdenDetalle() {
        return corrOrdenDetalle;
    }

    public void setCorrOrdenDetalle(int corrOrdenDetalle) {
        this.corrOrdenDetalle = corrOrdenDetalle;
    }

    public String getFlgAjustado() {
        return flgAjustado;
    }

    public void setFlgAjustado(String flgAjustado) {
        this.flgAjustado = flgAjustado;
    }

    public String getFecAjustado() {
        return fecAjustado;
    }

    public void setFecAjustado(String fecAjustado) {
        this.fecAjustado = fecAjustado;
    }

    public String getHorAjustado() {
        return horAjustado;
    }

    public void setHorAjustado(String horAjustado) {
        this.horAjustado = horAjustado;
    }

    public int getCodUsuarioAjustado() {
        return codUsuarioAjustado;
    }

    public void setCodUsuarioAjustado(int codUsuarioAjustado) {
        this.codUsuarioAjustado = codUsuarioAjustado;
    }

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public int getNumCantidadPresentacion() {
        return numCantidadPresentacion;
    }

    public void setNumCantidadPresentacion(int numCantidadPresentacion) {
        this.numCantidadPresentacion = numCantidadPresentacion;
    }

    public String getCodUm() {
        return codUm;
    }

    public void setCodUm(String codUm) {
        this.codUm = codUm;
    }

    public int getValEquivalencia() {
        return valEquivalencia;
    }

    public void setValEquivalencia(int valEquivalencia) {
        this.valEquivalencia = valEquivalencia;
    }

    public int getCodCampoMostrar() {
        return codCampoMostrar;
    }

    public void setCodCampoMostrar(int codCampoMostrar) {
        this.codCampoMostrar = codCampoMostrar;
    }

    public int getCtdFactura() {
        return ctdFactura;
    }

    public void setCtdFactura(int ctdFactura) {
        this.ctdFactura = ctdFactura;
    }

    public String getCodTransferido() {
        return codTransferido;
    }

    public void setCodTransferido(String codTransferido) {
        this.codTransferido = codTransferido;
    }

    public int getIdActivofijo() {
        return idActivofijo;
    }

    public void setIdActivofijo(int idActivofijo) {
        this.idActivofijo = idActivofijo;
    }

    public String getCodActivofijo() {
        return codActivofijo;
    }

    public void setCodActivofijo(String codActivofijo) {
        this.codActivofijo = codActivofijo;
    }

    public int getIdNotaDespachoDet() {
        return idNotaDespachoDet;
    }

    public void setIdNotaDespachoDet(int idNotaDespachoDet) {
        this.idNotaDespachoDet = idNotaDespachoDet;
    }

    
    
    public AimarProductos getAimarProductos() {
        return aimarProductos;
    }

    public void setAimarProductos(AimarProductos aimarProductos) {
        this.aimarProductos = aimarProductos;
    }

}
