package sys.model;

import java.util.Date;

public class AvmovMovNotaDespachoCab implements java.io.Serializable {

    private int idMovValeCab;
    private String rucCompanyia;
    private int codPersona;
    private String numVale;
    private String codEstablecimiento;
    private int codCentroc;
    private int codArea;
    private int codAlmacen;
    private int codCampo;
    private int codSector;
    private String codTipoDocumento;
    private int codTipoaplicacion;
    private Date fecVale;
    private String usoEquipos;
    private String fecJustificacion;
    private String numMovimiento;
    private String nomOperador;
    private int numArea;
    private int numLitrosxcilindro;
    private int numLitrosSegunBidon;
    private int numTancadasxBidon;
    private int numLitrosxCilindros;
    private int numGastoAgua;
    private String exportado;
    private String importado;
    private String fecImportacion;
    private String horImportacion;
    private int codUsuarioImp;
    private int correlativoMov;
    private String flgMochila;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    private String flgMovstock;
    private String fecMovstock;
    private String horMovstock;
    private int codUsuarioMovStock;
    private int codSupervisor;
    private int codAplicador;
    private int idPeriodoreingreso;
    private int flgTipocalculo;
    private int ctdCilindro;
    private int gastoTotal;
    private int gastoHa;
    private String flgPreAplicacion;
    private String estPreAplicacion;
    private String flgTienepreAplicacion;
    private int flgCorrelativoAplicacion;
    private int codCampoMostrar;
    private String desCampoMostrar;
    private String codConcepto;
    private int idCultivo;
    private int idCultivoEstFenologico;

    private int codVendedor;
    private String desObservacion;
    private int codPrioridad;
    private String flgEstado;
    private int flgEstadoFactura;

    private AgmaePersona agmaePersona;
    private AgmaeEstablecimiento agmaeEstablecimiento;
    private AgmaeCentrocosto agmaeCentrocosto;
    private AgmaeArea agmaeArea;
    private AimarAlmacen aimarAlmacen;
    private AgmaeVendedor agmaeVendedor;

//    CONSULTA
    private String zRucPersona;
    private String zNomPersona;
    private String zNomCompanya;
    private String zNomEstablecimiento;
    private String zNomCentro;
    private String zNomArea;
    private String zNomAlmacen;
    private String zNomPrioridad;
    private Double ZvalorTotalSol;
    private Double ZvalorTotalDolar;
    private String ZnomEstadoFactura;
    private String ZdesEstadoFactura;
    private String ZnomEstado;

    //Estado de botones
    private String ZestadoImprimir;
    private String ZestadoEditar;
    private String ZestadoAnular;
    private String zestadoFactura;
    private String zestadoGuiaRemision;

    public AvmovMovNotaDespachoCab() {
        agmaePersona = new AgmaePersona();
        agmaeEstablecimiento = new AgmaeEstablecimiento();
        agmaeCentrocosto = new AgmaeCentrocosto();
        agmaeArea = new AgmaeArea();
        aimarAlmacen = new AimarAlmacen();
        agmaeVendedor = new AgmaeVendedor();
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

    public int getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
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

    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    public int getCodTipoaplicacion() {
        return codTipoaplicacion;
    }

    public void setCodTipoaplicacion(int codTipoaplicacion) {
        this.codTipoaplicacion = codTipoaplicacion;
    }

    public Date getFecVale() {
        return fecVale;
    }

    public void setFecVale(Date fecVale) {
        this.fecVale = fecVale;
    }

    public String getUsoEquipos() {
        return usoEquipos;
    }

    public void setUsoEquipos(String usoEquipos) {
        this.usoEquipos = usoEquipos;
    }

    public String getFecJustificacion() {
        return fecJustificacion;
    }

    public void setFecJustificacion(String fecJustificacion) {
        this.fecJustificacion = fecJustificacion;
    }

    public String getNumMovimiento() {
        return numMovimiento;
    }

    public void setNumMovimiento(String numMovimiento) {
        this.numMovimiento = numMovimiento;
    }

    public String getNomOperador() {
        return nomOperador;
    }

    public void setNomOperador(String nomOperador) {
        this.nomOperador = nomOperador;
    }

    public int getNumArea() {
        return numArea;
    }

    public void setNumArea(int numArea) {
        this.numArea = numArea;
    }

    public int getNumLitrosxcilindro() {
        return numLitrosxcilindro;
    }

    public void setNumLitrosxcilindro(int numLitrosxcilindro) {
        this.numLitrosxcilindro = numLitrosxcilindro;
    }

    public int getNumLitrosSegunBidon() {
        return numLitrosSegunBidon;
    }

    public void setNumLitrosSegunBidon(int numLitrosSegunBidon) {
        this.numLitrosSegunBidon = numLitrosSegunBidon;
    }

    public int getNumTancadasxBidon() {
        return numTancadasxBidon;
    }

    public void setNumTancadasxBidon(int numTancadasxBidon) {
        this.numTancadasxBidon = numTancadasxBidon;
    }

    public int getNumLitrosxCilindros() {
        return numLitrosxCilindros;
    }

    public void setNumLitrosxCilindros(int numLitrosxCilindros) {
        this.numLitrosxCilindros = numLitrosxCilindros;
    }

    public int getNumGastoAgua() {
        return numGastoAgua;
    }

    public void setNumGastoAgua(int numGastoAgua) {
        this.numGastoAgua = numGastoAgua;
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

    public int getCorrelativoMov() {
        return correlativoMov;
    }

    public void setCorrelativoMov(int correlativoMov) {
        this.correlativoMov = correlativoMov;
    }

    public String getFlgMochila() {
        return flgMochila;
    }

    public void setFlgMochila(String flgMochila) {
        this.flgMochila = flgMochila;
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

    public String getFlgMovstock() {
        return flgMovstock;
    }

    public void setFlgMovstock(String flgMovstock) {
        this.flgMovstock = flgMovstock;
    }

    public String getFecMovstock() {
        return fecMovstock;
    }

    public void setFecMovstock(String fecMovstock) {
        this.fecMovstock = fecMovstock;
    }

    public String getHorMovstock() {
        return horMovstock;
    }

    public void setHorMovstock(String horMovstock) {
        this.horMovstock = horMovstock;
    }

    public int getCodUsuarioMovStock() {
        return codUsuarioMovStock;
    }

    public void setCodUsuarioMovStock(int codUsuarioMovStock) {
        this.codUsuarioMovStock = codUsuarioMovStock;
    }

    public int getCodSupervisor() {
        return codSupervisor;
    }

    public void setCodSupervisor(int codSupervisor) {
        this.codSupervisor = codSupervisor;
    }

    public int getCodAplicador() {
        return codAplicador;
    }

    public void setCodAplicador(int codAplicador) {
        this.codAplicador = codAplicador;
    }

    public int getIdPeriodoreingreso() {
        return idPeriodoreingreso;
    }

    public void setIdPeriodoreingreso(int idPeriodoreingreso) {
        this.idPeriodoreingreso = idPeriodoreingreso;
    }

    public int getFlgTipocalculo() {
        return flgTipocalculo;
    }

    public void setFlgTipocalculo(int flgTipocalculo) {
        this.flgTipocalculo = flgTipocalculo;
    }

    public int getCtdCilindro() {
        return ctdCilindro;
    }

    public void setCtdCilindro(int ctdCilindro) {
        this.ctdCilindro = ctdCilindro;
    }

    public int getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(int gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public int getGastoHa() {
        return gastoHa;
    }

    public void setGastoHa(int gastoHa) {
        this.gastoHa = gastoHa;
    }

    public String getFlgPreAplicacion() {
        return flgPreAplicacion;
    }

    public void setFlgPreAplicacion(String flgPreAplicacion) {
        this.flgPreAplicacion = flgPreAplicacion;
    }

    public String getEstPreAplicacion() {
        return estPreAplicacion;
    }

    public void setEstPreAplicacion(String estPreAplicacion) {
        this.estPreAplicacion = estPreAplicacion;
    }

    public String getFlgTienepreAplicacion() {
        return flgTienepreAplicacion;
    }

    public void setFlgTienepreAplicacion(String flgTienepreAplicacion) {
        this.flgTienepreAplicacion = flgTienepreAplicacion;
    }

    public int getFlgCorrelativoAplicacion() {
        return flgCorrelativoAplicacion;
    }

    public void setFlgCorrelativoAplicacion(int flgCorrelativoAplicacion) {
        this.flgCorrelativoAplicacion = flgCorrelativoAplicacion;
    }

    public int getCodCampoMostrar() {
        return codCampoMostrar;
    }

    public void setCodCampoMostrar(int codCampoMostrar) {
        this.codCampoMostrar = codCampoMostrar;
    }

    public String getDesCampoMostrar() {
        return desCampoMostrar;
    }

    public void setDesCampoMostrar(String desCampoMostrar) {
        this.desCampoMostrar = desCampoMostrar;
    }

    public String getCodConcepto() {
        return codConcepto;
    }

    public void setCodConcepto(String codConcepto) {
        this.codConcepto = codConcepto;
    }

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public int getIdCultivoEstFenologico() {
        return idCultivoEstFenologico;
    }

    public void setIdCultivoEstFenologico(int idCultivoEstFenologico) {
        this.idCultivoEstFenologico = idCultivoEstFenologico;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getDesObservacion() {
        return desObservacion;
    }

    public void setDesObservacion(String desObservacion) {
        this.desObservacion = desObservacion;
    }

    public int getCodPrioridad() {
        return codPrioridad;
    }

    public void setCodPrioridad(int codPrioridad) {
        this.codPrioridad = codPrioridad;
    }

    public String getFlgEstado() {
        return flgEstado;
    }

    public void setFlgEstado(String flgEstado) {
        this.flgEstado = flgEstado;
    }

    public AgmaePersona getAgmaePersona() {
        return agmaePersona;
    }

    public void setAgmaePersona(AgmaePersona agmaePersona) {
        this.agmaePersona = agmaePersona;
    }

    public AgmaeEstablecimiento getAgmaeEstablecimiento() {
        return agmaeEstablecimiento;
    }

    public void setAgmaeEstablecimiento(AgmaeEstablecimiento agmaeEstablecimiento) {
        this.agmaeEstablecimiento = agmaeEstablecimiento;
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

    public AgmaeVendedor getAgmaeVendedor() {
        return agmaeVendedor;
    }

    public void setAgmaeVendedor(AgmaeVendedor agmaeVendedor) {
        this.agmaeVendedor = agmaeVendedor;
    }

    public String getZRucPersona() {
        return zRucPersona;
    }

    public void setZRucPersona(String zRucPersona) {
        this.zRucPersona = zRucPersona;
    }

    public String getZNomPersona() {
        return zNomPersona;
    }

    public void setZNomPersona(String zNomPersona) {
        this.zNomPersona = zNomPersona;
    }

    public String getZNomCompanya() {
        return zNomCompanya;
    }

    public void setZNomCompanya(String zNomCompanya) {
        this.zNomCompanya = zNomCompanya;
    }

    public String getZNomEstablecimiento() {
        return zNomEstablecimiento;
    }

    public void setZNomEstablecimiento(String zNomEstablecimiento) {
        this.zNomEstablecimiento = zNomEstablecimiento;
    }

    public String getZNomCentro() {
        return zNomCentro;
    }

    public void setZNomCentro(String zNomCentro) {
        this.zNomCentro = zNomCentro;
    }

    public String getZNomArea() {
        return zNomArea;
    }

    public void setZNomArea(String zNomArea) {
        this.zNomArea = zNomArea;
    }

    public String getZNomAlmacen() {
        return zNomAlmacen;
    }

    public void setZNomAlmacen(String zNomAlmacen) {
        this.zNomAlmacen = zNomAlmacen;
    }

    public String getZNomPrioridad() {
        return zNomPrioridad;
    }

    public void setZNomPrioridad(String zNomPrioridad) {
        this.zNomPrioridad = zNomPrioridad;
    }

    public Double getZvalorTotalSol() {
        return ZvalorTotalSol;
    }

    public void setZvalorTotalSol(Double ZvalorTotalSol) {
        this.ZvalorTotalSol = ZvalorTotalSol;
    }

    public Double getZvalorTotalDolar() {
        return ZvalorTotalDolar;
    }

    public void setZvalorTotalDolar(Double ZvalorTotalDolar) {
        this.ZvalorTotalDolar = ZvalorTotalDolar;
    }

    public int getFlgEstadoFactura() {
        return flgEstadoFactura;
    }

    public void setFlgEstadoFactura(int flgEstadoFactura) {
        this.flgEstadoFactura = flgEstadoFactura;
    }

    public String getZnomEstadoFactura() {
        return ZnomEstadoFactura;
    }

    public void setZnomEstadoFactura(String ZnomEstadoFactura) {
        this.ZnomEstadoFactura = ZnomEstadoFactura;
    }

    public String getZdesEstadoFactura() {
        return ZdesEstadoFactura;
    }

    public void setZdesEstadoFactura(String ZdesEstadoFactura) {
        this.ZdesEstadoFactura = ZdesEstadoFactura;
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

    public String getZestadoFactura() {
        return zestadoFactura;
    }

    public void setZestadoFactura(String zestadoFactura) {
        this.zestadoFactura = zestadoFactura;
    }

    public String getZestadoGuiaRemision() {
        return zestadoGuiaRemision;
    }

    public void setZestadoGuiaRemision(String zestadoGuiaRemision) {
        this.zestadoGuiaRemision = zestadoGuiaRemision;
    }

}
