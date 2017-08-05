package sys.model;

public class AvmovFacturaNdDet implements java.io.Serializable {

    private int idFacturaDet;
    private int idFacturaCab;
    private int idNotaDespachoDet;
    private String rucCompanyia;
    private String numFactura;
    private String codProducto;
    private int numCntdProducto;
    private String codMedida;
    private Double numPrecioUnitario;
    private String codMonedaOrigen;
    private Double numPrecioOrigen;
    private Double numImporteProducto;
    private int flgEstadoGuiaRemision;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;

    //Extras
    private String ZnomProducto;
    
    //Edicion
    private boolean nuevo;
    private boolean editado;

    public AvmovFacturaNdDet() {
    }

    public int getIdFacturaDet() {
        return idFacturaDet;
    }

    public void setIdFacturaDet(int idFacturaDet) {
        this.idFacturaDet = idFacturaDet;
    }

    public int getIdFacturaCab() {
        return idFacturaCab;
    }

    public void setIdFacturaCab(int idFacturaCab) {
        this.idFacturaCab = idFacturaCab;
    }

    public int getIdNotaDespachoDet() {
        return idNotaDespachoDet;
    }

    public void setIdNotaDespachoDet(int idNotaDespachoDet) {
        this.idNotaDespachoDet = idNotaDespachoDet;
    }


    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public int getNumCntdProducto() {
        return numCntdProducto;
    }

    public void setNumCntdProducto(int numCntdProducto) {
        this.numCntdProducto = numCntdProducto;
    }

    public String getCodMedida() {
        return codMedida;
    }

    public void setCodMedida(String codMedida) {
        this.codMedida = codMedida;
    }

    public Double getNumPrecioUnitario() {
        return numPrecioUnitario;
    }

    public void setNumPrecioUnitario(Double numPrecioUnitario) {
        this.numPrecioUnitario = numPrecioUnitario;
    }

    public String getCodMonedaOrigen() {
        return codMonedaOrigen;
    }

    public void setCodMonedaOrigen(String codMonedaOrigen) {
        this.codMonedaOrigen = codMonedaOrigen;
    }

    public Double getNumPrecioOrigen() {
        return numPrecioOrigen;
    }

    public void setNumPrecioOrigen(Double precioOrigen) {
        this.numPrecioOrigen = precioOrigen;
    }

    public Double getNumImporteProducto() {
        return numImporteProducto;
    }

    public void setNumImporteProducto(Double numImporteProducto) {
        this.numImporteProducto = numImporteProducto;
    }

    public int getFlgEstadoGuiaRemision() {
        return flgEstadoGuiaRemision;
    }

    public void setFlgEstadoGuiaRemision(int flgEstadoGuiaRemision) {
        this.flgEstadoGuiaRemision = flgEstadoGuiaRemision;
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

    public String getZnomProducto() {
        return ZnomProducto;
    }

    public void setZnomProducto(String ZnomProducto) {
        this.ZnomProducto = ZnomProducto;
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
