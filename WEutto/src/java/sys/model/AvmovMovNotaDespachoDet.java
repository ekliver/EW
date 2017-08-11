package sys.model;

public class AvmovMovNotaDespachoDet implements java.io.Serializable {

    private int idMovValeProducto;
    private int idMovValeCab;
    private String rucCompanyia;
    private String numVale;
    private String codEstablecimiento;
    private int codCentroc;
    private int codArea;
    private int codAlmacen;
    private int codCampo;
    private int codSector;
    private String codProducto;
    private String ctdDosis;
    private String numTancadas;
    private int numHas;
    private int ctdTotal;
    private int ctdMovimiento;
    private int preVta;
    private int impVta;
    private int valVtaSol;
    private int impVtaSol;
    private int valVtaDol;
    private int impVtaDol;
    private String exportado;
    private String importado;
    private String fecImportacion;
    private String horImportacion;
    private int codUsuarioImp;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    private AimarProductos aimarProductos;
    private int codPresentacion;
    private int numCantidadPresentacion;
    private int flgEstadoFactura;
    private int flgEstadoGuiaRemision;
    private String codMedida;

    private AgmaeCentrocosto agmaeCentrocosto;
    private AgmaeArea agmaeArea;
    private AimarAlmacen aimarAlmacen;

    //Temp
    private int stockActual;
    private int stockFecha;
    private int idMovDet;

    //Consulta
    private String nomCompanya;
    private String nomProducto;
    private String nomPresentacion;
    private int numPresentacionEquivalencia;

    private String nomMedida;

    //Edicion
    private boolean nuevo;
    private boolean editado;

    public AvmovMovNotaDespachoDet() {
        aimarProductos = new AimarProductos();

        agmaeCentrocosto = new AgmaeCentrocosto();
        agmaeArea = new AgmaeArea();
        aimarAlmacen = new AimarAlmacen();

    }

    public int getIdMovValeProducto() {
        return idMovValeProducto;
    }

    public void setIdMovValeProducto(int idMovValeProducto) {
        this.idMovValeProducto = idMovValeProducto;
    }

    public int getIdMovValeCab() {
        return idMovValeCab;
    }

    public void setIdMovValeCab(int idMovValeCab) {
        this.idMovValeCab = idMovValeCab;
    }

    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getNumVale() {
        return numVale;
    }

    public void setNumVale(String numVale) {
        this.numVale = numVale;
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

    public int getCodCampo() {
        return codCampo;
    }

    public void setCodCampo(int codCampo) {
        this.codCampo = codCampo;
    }

    public int getCodSector() {
        return codSector;
    }

    public void setCodSector(int codSector) {
        this.codSector = codSector;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCtdDosis() {
        return ctdDosis;
    }

    public void setCtdDosis(String ctdDosis) {
        this.ctdDosis = ctdDosis;
    }

    public String getNumTancadas() {
        return numTancadas;
    }

    public void setNumTancadas(String numTancadas) {
        this.numTancadas = numTancadas;
    }

    public int getNumHas() {
        return numHas;
    }

    public void setNumHas(int numHas) {
        this.numHas = numHas;
    }

    public int getCtdTotal() {
        return ctdTotal;
    }

    public void setCtdTotal(int ctdTotal) {
        this.ctdTotal = ctdTotal;
    }

    public int getCtdMovimiento() {
        return ctdMovimiento;
    }

    public void setCtdMovimiento(int ctdMovimiento) {
        this.ctdMovimiento = ctdMovimiento;
    }

    public int getPreVta() {
        return preVta;
    }

    public void setPreVta(int preVta) {
        this.preVta = preVta;
    }

    public int getImpVta() {
        return impVta;
    }

    public void setImpVta(int impVta) {
        this.impVta = impVta;
    }

    public int getValVtaSol() {
        return valVtaSol;
    }

    public void setValVtaSol(int valVtaSol) {
        this.valVtaSol = valVtaSol;
    }

    public int getImpVtaSol() {
        return impVtaSol;
    }

    public void setImpVtaSol(int impVtaSol) {
        this.impVtaSol = impVtaSol;
    }

    public int getValVtaDol() {
        return valVtaDol;
    }

    public void setValVtaDol(int valVtaDol) {
        this.valVtaDol = valVtaDol;
    }

    public int getImpVtaDol() {
        return impVtaDol;
    }

    public void setImpVtaDol(int impVtaDol) {
        this.impVtaDol = impVtaDol;
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

    public AimarProductos getAimarProductos() {
        return aimarProductos;
    }

    public void setAimarProductos(AimarProductos aimarProductos) {
        this.aimarProductos = aimarProductos;
    }

    public int getNumCantidadPresentacion() {
        return numCantidadPresentacion;
    }

    public void setNumCantidadPresentacion(int numCantidadPresentacion) {
        this.numCantidadPresentacion = numCantidadPresentacion;
    }

    public int getFlgEstadoFactura() {
        return flgEstadoFactura;
    }

    public void setFlgEstadoFactura(int flgEstadoFactura) {
        this.flgEstadoFactura = flgEstadoFactura;
    }

    public int getFlgEstadoGuiaRemision() {
        return flgEstadoGuiaRemision;
    }

    public void setFlgEstadoGuiaRemision(int flgEstadoGuiaRemision) {
        this.flgEstadoGuiaRemision = flgEstadoGuiaRemision;
    }

    public AgmaeCentrocosto getAgmaeCentrocosto() {
        return agmaeCentrocosto;
    }

    public void setAgmaeCentrocosto(AgmaeCentrocosto agmaeCentrocosto) {
        this.agmaeCentrocosto = agmaeCentrocosto;
    }

    public AgmaeArea getAgmaeArea() {
        return agmaeArea;
    }

    public void setAgmaeArea(AgmaeArea agmaeArea) {
        this.agmaeArea = agmaeArea;
    }

    public AimarAlmacen getAimarAlmacen() {
        return aimarAlmacen;
    }

    public void setAimarAlmacen(AimarAlmacen aimarAlmacen) {
        this.aimarAlmacen = aimarAlmacen;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockFecha() {
        return stockFecha;
    }

    public void setStockFecha(int stockFecha) {
        this.stockFecha = stockFecha;
    }

    public int getIdMovDet() {
        return idMovDet;
    }

    public void setIdMovDet(int idMovDet) {
        this.idMovDet = idMovDet;
    }

    
    
    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public String getNomCompanya() {
        return nomCompanya;
    }

    public void setNomCompanya(String nomCompanya) {
        this.nomCompanya = nomCompanya;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getNomPresentacion() {
        return nomPresentacion;
    }

    public void setNomPresentacion(String nomPresentacion) {
        this.nomPresentacion = nomPresentacion;
    }

    public int getNumPresentacionEquivalencia() {
        return numPresentacionEquivalencia;
    }

    public void setNumPresentacionEquivalencia(int numPresentacionEquivalencia) {
        this.numPresentacionEquivalencia = numPresentacionEquivalencia;
    }

    public String getCodMedida() {
        return codMedida;
    }

    public void setCodMedida(String codMedida) {
        this.codMedida = codMedida;
    }

    public String getNomMedida() {
        return nomMedida;
    }

    public void setNomMedida(String nomMedida) {
        this.nomMedida = nomMedida;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isEditado() {
        return editado;
    }

    public void setEditado(boolean editado) {
        this.editado = editado;
    }

}
