package sys.model;

import java.util.Date;

public class AvmovGuiaRemisionCab implements java.io.Serializable {

    private int idGuiaRemisionCab;
    private String numSerie;
    private String numGuia;
    private String rucCompanyia;
    private String desPuntoPartida;
    private Date fecEmision;
    private Date fecInicioTraslado;
    private double numCostoMinimo;
    private String desPuntoLlegada;
    private int codPersona;
    private String numPlaca;
    private String dniConductor;
    private int codEmptransporte;
    private int numCantidadProductos;
    private int codPresentacion;
    private int numCantidadPresentacion;
    private int codMotivo;
    private String codTipoDocumento;
    private String flgEstado;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;

    private String znomCompanyia;

    private String zrucPersona;
    private String znomPersona;

    private String znomMarca;
    private String znomConstancia;

    private String zlicConductor;
    private String znomConductor;

    private String zrucEmpresa;
    private String znomEmpresa;
    private String znumTelefono;

//Estado de botones
    private String ZestadoImprimir;
    private String ZestadoEditar;
    private String ZestadoAnular;

    public AvmovGuiaRemisionCab() {
    }

    public int getIdGuiaRemisionCab() {
        return idGuiaRemisionCab;
    }

    public void setIdGuiaRemisionCab(int idGuiaRemisionCab) {
        this.idGuiaRemisionCab = idGuiaRemisionCab;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getNumGuia() {
        return numGuia;
    }

    public void setNumGuia(String numGuia) {
        this.numGuia = numGuia;
    }

    public String getRucCompanyia() {
        return rucCompanyia;
    }

    public void setRucCompanyia(String rucCompanyia) {
        this.rucCompanyia = rucCompanyia;
    }

    public String getDesPuntoPartida() {
        return desPuntoPartida;
    }

    public void setDesPuntoPartida(String desPuntoPartida) {
        this.desPuntoPartida = desPuntoPartida;
    }

    public Date getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(Date fecEmision) {
        this.fecEmision = fecEmision;
    }

    public Date getFecInicioTraslado() {
        return fecInicioTraslado;
    }

    public void setFecInicioTraslado(Date fecInicioTraslado) {
        this.fecInicioTraslado = fecInicioTraslado;
    }

    public double getNumCostoMinimo() {
        return numCostoMinimo;
    }

    public void setNumCostoMinimo(double numCostoMinimo) {
        this.numCostoMinimo = numCostoMinimo;
    }

    public String getDesPuntoLlegada() {
        return desPuntoLlegada;
    }

    public void setDesPuntoLlegada(String desPuntoLlegada) {
        this.desPuntoLlegada = desPuntoLlegada;
    }

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getDniConductor() {
        return dniConductor;
    }

    public void setDniConductor(String dniConductor) {
        this.dniConductor = dniConductor;
    }

    public int getCodEmptransporte() {
        return codEmptransporte;
    }

    public void setCodEmptransporte(int codEmptransporte) {
        this.codEmptransporte = codEmptransporte;
    }

    public int getNumCantidadProductos() {
        return numCantidadProductos;
    }

    public void setNumCantidadProductos(int numCantidadProductos) {
        this.numCantidadProductos = numCantidadProductos;
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
    
    

    public int getCodMotivo() {
        return codMotivo;
    }

    public void setCodMotivo(int codMotivo) {
        this.codMotivo = codMotivo;
    }

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
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

    public String getZnomCompanyia() {
        return znomCompanyia;
    }

    public void setZnomCompanyia(String znomCompanyia) {
        this.znomCompanyia = znomCompanyia;
    }

    public String getZrucPersona() {
        return zrucPersona;
    }

    public void setZrucPersona(String zrucPersona) {
        this.zrucPersona = zrucPersona;
    }

    public String getZnomPersona() {
        return znomPersona;
    }

    public void setZnomPersona(String znomPersona) {
        this.znomPersona = znomPersona;
    }

    public String getZnomMarca() {
        return znomMarca;
    }

    public void setZnomMarca(String znomMarca) {
        this.znomMarca = znomMarca;
    }

    public String getZnomConstancia() {
        return znomConstancia;
    }

    public void setZnomConstancia(String znomConstancia) {
        this.znomConstancia = znomConstancia;
    }

    public String getZlicConductor() {
        return zlicConductor;
    }

    public void setZlicConductor(String zlicConductor) {
        this.zlicConductor = zlicConductor;
    }

    public String getZnomConductor() {
        return znomConductor;
    }

    public void setZnomConductor(String znomConductor) {
        this.znomConductor = znomConductor;
    }

    public String getZrucEmpresa() {
        return zrucEmpresa;
    }

    public void setZrucEmpresa(String zrucEmpresa) {
        this.zrucEmpresa = zrucEmpresa;
    }

    public String getZnomEmpresa() {
        return znomEmpresa;
    }

    public void setZnomEmpresa(String znomEmpresa) {
        this.znomEmpresa = znomEmpresa;
    }

    public String getZnumTelefono() {
        return znumTelefono;
    }

    public void setZnumTelefono(String znumTelefono) {
        this.znumTelefono = znumTelefono;
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

}
