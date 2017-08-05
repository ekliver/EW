package sys.model;

public class AvmovGuiaRemisionDet implements java.io.Serializable {

    private int idGuiaRemisionDet;
    private int idGuiaRemisionCab;
    private int numCantidadProducto;
    private String codProducto;
    private String codMedida;
    private String codTipoDocumentoOrigen;
    private int idOrigen;
    private int flgEstado;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;

    //Extras
    private String ZnomProducto;
    private String ZnomTipoDocumentoOrigen;

    //Edicion
    private boolean nuevo;
    private boolean editado;

    public AvmovGuiaRemisionDet() {
    }

    public int getIdGuiaRemisionDet() {
        return idGuiaRemisionDet;
    }

    public void setIdGuiaRemisionDet(int idGuiaRemisionDet) {
        this.idGuiaRemisionDet = idGuiaRemisionDet;
    }

    public int getIdGuiaRemisionCab() {
        return idGuiaRemisionCab;
    }

    public void setIdGuiaRemisionCab(int idGuiaRemisionCab) {
        this.idGuiaRemisionCab = idGuiaRemisionCab;
    }

    public int getNumCantidadProducto() {
        return numCantidadProducto;
    }

    public void setNumCantidadProducto(int numCantidadProducto) {
        this.numCantidadProducto = numCantidadProducto;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getCodMedida() {
        return codMedida;
    }

    public void setCodMedida(String codMedida) {
        this.codMedida = codMedida;
    }
    
    

    public String getCodTipoDocumentoOrigen() {
        return codTipoDocumentoOrigen;
    }

    public void setCodTipoDocumentoOrigen(String codTipoDocumentoOrigen) {
        this.codTipoDocumentoOrigen = codTipoDocumentoOrigen;
    }

    public int getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(int idOrigen) {
        this.idOrigen = idOrigen;
    }

    public int getFlgEstado() {
        return flgEstado;
    }

    public void setFlgEstado(int flgEstado) {
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

    public String getZnomProducto() {
        return ZnomProducto;
    }

    public void setZnomProducto(String ZnomProducto) {
        this.ZnomProducto = ZnomProducto;
    }

    public String getZnomTipoDocumentoOrigen() {
        return ZnomTipoDocumentoOrigen;
    }

    public void setZnomTipoDocumentoOrigen(String ZnomTipoDocumentoOrigen) {
        this.ZnomTipoDocumentoOrigen = ZnomTipoDocumentoOrigen;
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
