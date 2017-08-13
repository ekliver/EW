package sys.model;

/**
 * @Fecha 2017 - 04 - 29
 * @author Kliver Isidro
 * @email jekliver@gmail.com
 */
public class AgmaePersona implements java.io.Serializable {

    private int codPersona;
    private String tipContribuyente;
    private String codAnexo;
    private String tipPersona;
    private String flgIndMadreRespFam;
    private String codAutSalud;
    private int codEstadoCivil;
    private String nomRazonSocial;
    private String flgDiscapacidad;
    private int codIdentificacion;
    private String numIdentificacion;
    private String numRucPersona;
    private String flgIndicadorDomiciliado;
    private int codDepartamento;
    private int codProvincia;
    private int codDistrito;
    private int codZona;
    private String desZona;
    private int codVia;
    private String desVia;
    private String numVia;
    private String desInterior;
    private String codUbigeo;
    private String codPostal;
    private String desApellidoPaterno;
    private String desApellidoMaterno;
    private String desNombre;
    private String tipSexo;
    private String fecNacimiento;
    private int numEdad;
    private String codPais;
    private int codDepartamentoNac;
    private int codProvinciaNac;
    private int codDistritoNac;
    private String codUbigeoNac;
    private String numTelefono;
    private String numFax;
    private String desEmail;
    private String desPaginaWeb;
    private String codTenenciaVivienda;
    private String codTipoVivienda;
    private String codEstadoVivienda;
    private String codUbicacionVivienda;
    private int codProfesion;
    private String codNivelEducativo;
    private String codCentroFormacionp;
    private String flgAapension;
    private String codCatOcupacionalPe;
    private String codConvenioDoblet;
    private String desReferencia;
    private String desActividad;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;
    
    private String desDireccionFacturacion;
    

    private AgmaeTiposPersona agmaeTiposPersona;

    public AgmaePersona() {
        agmaeTiposPersona=new AgmaeTiposPersona();
    }

    public AgmaePersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public AgmaePersona(int codPersona, String tipContribuyente, String codAnexo, String tipPersona, String flgIndMadreRespFam, String codAutSalud, int codEstadoCivil, String nomRazonSocial, String flgDiscapacidad, int codIdentificacion, String numIdentificacion, String numRucPersona, String flgIndicadorDomiciliado, int codDepartamento, int codProvincia, int codDistrito, int codZona, String desZona, int codVia, String desVia, String numVia, String desInterior, String codUbigeo, String codPostal, String desApellidoPaterno, String desApellidoMaterno, String desNombre, String tipSexo, String fecNacimiento, int numEdad, String codPais, int codDepartamentoNac, int codProvinciaNac, int codDistritoNac, String codUbigeoNac, String numTelefono, String numFax, String desEmail, String desPaginaWeb, String codTenenciaVivienda, String codTipoVivienda, String codEstadoVivienda, String codUbicacionVivienda, int codProfesion, String codNivelEducativo, String codCentroFormacionp, String flgAapension, String codCatOcupacionalPe, String codConvenioDoblet, String desReferencia, String desActividad, String fecCreacion, String horCreacion, int codUsuarioCreacion, String fecActualizacion, String horActualizacion, int codUsuarioActualizacion) {
        this.codPersona = codPersona;
        this.tipContribuyente = tipContribuyente;
        this.codAnexo = codAnexo;
        this.tipPersona = tipPersona;
        this.flgIndMadreRespFam = flgIndMadreRespFam;
        this.codAutSalud = codAutSalud;
        this.codEstadoCivil = codEstadoCivil;
        this.nomRazonSocial = nomRazonSocial;
        this.flgDiscapacidad = flgDiscapacidad;
        this.codIdentificacion = codIdentificacion;
        this.numIdentificacion = numIdentificacion;
        this.numRucPersona = numRucPersona;
        this.flgIndicadorDomiciliado = flgIndicadorDomiciliado;
        this.codDepartamento = codDepartamento;
        this.codProvincia = codProvincia;
        this.codDistrito = codDistrito;
        this.codZona = codZona;
        this.desZona = desZona;
        this.codVia = codVia;
        this.desVia = desVia;
        this.numVia = numVia;
        this.desInterior = desInterior;
        this.codUbigeo = codUbigeo;
        this.codPostal = codPostal;
        this.desApellidoPaterno = desApellidoPaterno;
        this.desApellidoMaterno = desApellidoMaterno;
        this.desNombre = desNombre;
        this.tipSexo = tipSexo;
        this.fecNacimiento = fecNacimiento;
        this.numEdad = numEdad;
        this.codPais = codPais;
        this.codDepartamentoNac = codDepartamentoNac;
        this.codProvinciaNac = codProvinciaNac;
        this.codDistritoNac = codDistritoNac;
        this.codUbigeoNac = codUbigeoNac;
        this.numTelefono = numTelefono;
        this.numFax = numFax;
        this.desEmail = desEmail;
        this.desPaginaWeb = desPaginaWeb;
        this.codTenenciaVivienda = codTenenciaVivienda;
        this.codTipoVivienda = codTipoVivienda;
        this.codEstadoVivienda = codEstadoVivienda;
        this.codUbicacionVivienda = codUbicacionVivienda;
        this.codProfesion = codProfesion;
        this.codNivelEducativo = codNivelEducativo;
        this.codCentroFormacionp = codCentroFormacionp;
        this.flgAapension = flgAapension;
        this.codCatOcupacionalPe = codCatOcupacionalPe;
        this.codConvenioDoblet = codConvenioDoblet;
        this.desReferencia = desReferencia;
        this.desActividad = desActividad;
        this.fecCreacion = fecCreacion;
        this.horCreacion = horCreacion;
        this.codUsuarioCreacion = codUsuarioCreacion;
        this.fecActualizacion = fecActualizacion;
        this.horActualizacion = horActualizacion;
        this.codUsuarioActualizacion = codUsuarioActualizacion;
    }

    public int getCodPersona() {
        return this.codPersona;
    }

    public void setCodPersona(int codPersona) {
        this.codPersona = codPersona;
    }

    public String getTipContribuyente() {
        return this.tipContribuyente;
    }

    public void setTipContribuyente(String tipContribuyente) {
        this.tipContribuyente = tipContribuyente;
    }

    public String getCodAnexo() {
        return this.codAnexo;
    }

    public void setCodAnexo(String codAnexo) {
        this.codAnexo = codAnexo;
    }

    public String getTipPersona() {
        return this.tipPersona;
    }

    public void setTipPersona(String tipPersona) {
        this.tipPersona = tipPersona;
    }

    public String getFlgIndMadreRespFam() {
        return this.flgIndMadreRespFam;
    }

    public void setFlgIndMadreRespFam(String flgIndMadreRespFam) {
        this.flgIndMadreRespFam = flgIndMadreRespFam;
    }

    public String getCodAutSalud() {
        return this.codAutSalud;
    }

    public void setCodAutSalud(String codAutSalud) {
        this.codAutSalud = codAutSalud;
    }

    public int getCodEstadoCivil() {
        return this.codEstadoCivil;
    }

    public void setCodEstadoCivil(int codEstadoCivil) {
        this.codEstadoCivil = codEstadoCivil;
    }

    public String getNomRazonSocial() {
        return this.nomRazonSocial;
    }

    public void setNomRazonSocial(String nomRazonSocial) {
        this.nomRazonSocial = nomRazonSocial;
    }

    public String getFlgDiscapacidad() {
        return this.flgDiscapacidad;
    }

    public void setFlgDiscapacidad(String flgDiscapacidad) {
        this.flgDiscapacidad = flgDiscapacidad;
    }

    public int getCodIdentificacion() {
        return this.codIdentificacion;
    }

    public void setCodIdentificacion(int codIdentificacion) {
        this.codIdentificacion = codIdentificacion;
    }

    public String getNumIdentificacion() {
        return this.numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getNumRucPersona() {
        return this.numRucPersona;
    }

    public void setNumRucPersona(String numRucPersona) {
        this.numRucPersona = numRucPersona;
    }

    public String getFlgIndicadorDomiciliado() {
        return this.flgIndicadorDomiciliado;
    }

    public void setFlgIndicadorDomiciliado(String flgIndicadorDomiciliado) {
        this.flgIndicadorDomiciliado = flgIndicadorDomiciliado;
    }

    public int getCodDepartamento() {
        return this.codDepartamento;
    }

    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public int getCodProvincia() {
        return this.codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodDistrito() {
        return this.codDistrito;
    }

    public void setCodDistrito(int codDistrito) {
        this.codDistrito = codDistrito;
    }

    public int getCodZona() {
        return this.codZona;
    }

    public void setCodZona(int codZona) {
        this.codZona = codZona;
    }

    public String getDesZona() {
        return this.desZona;
    }

    public void setDesZona(String desZona) {
        this.desZona = desZona;
    }

    public int getCodVia() {
        return this.codVia;
    }

    public void setCodVia(int codVia) {
        this.codVia = codVia;
    }

    public String getDesVia() {
        return this.desVia;
    }

    public void setDesVia(String desVia) {
        this.desVia = desVia;
    }

    public String getNumVia() {
        return this.numVia;
    }

    public void setNumVia(String numVia) {
        this.numVia = numVia;
    }

    public String getDesInterior() {
        return this.desInterior;
    }

    public void setDesInterior(String desInterior) {
        this.desInterior = desInterior;
    }

    public String getCodUbigeo() {
        return this.codUbigeo;
    }

    public void setCodUbigeo(String codUbigeo) {
        this.codUbigeo = codUbigeo;
    }

    public String getCodPostal() {
        return this.codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getDesApellidoPaterno() {
        return this.desApellidoPaterno;
    }

    public void setDesApellidoPaterno(String desApellidoPaterno) {
        this.desApellidoPaterno = desApellidoPaterno;
    }

    public String getDesApellidoMaterno() {
        return this.desApellidoMaterno;
    }

    public void setDesApellidoMaterno(String desApellidoMaterno) {
        this.desApellidoMaterno = desApellidoMaterno;
    }

    public String getDesNombre() {
        return this.desNombre;
    }

    public void setDesNombre(String desNombre) {
        this.desNombre = desNombre;
    }

    public String getTipSexo() {
        return this.tipSexo;
    }

    public void setTipSexo(String tipSexo) {
        this.tipSexo = tipSexo;
    }

    public String getFecNacimiento() {
        return this.fecNacimiento;
    }

    public void setFecNacimiento(String fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public int getNumEdad() {
        return this.numEdad;
    }

    public void setNumEdad(int numEdad) {
        this.numEdad = numEdad;
    }

    public String getCodPais() {
        return this.codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public int getCodDepartamentoNac() {
        return this.codDepartamentoNac;
    }

    public void setCodDepartamentoNac(int codDepartamentoNac) {
        this.codDepartamentoNac = codDepartamentoNac;
    }

    public int getCodProvinciaNac() {
        return this.codProvinciaNac;
    }

    public void setCodProvinciaNac(int codProvinciaNac) {
        this.codProvinciaNac = codProvinciaNac;
    }

    public int getCodDistritoNac() {
        return this.codDistritoNac;
    }

    public void setCodDistritoNac(int codDistritoNac) {
        this.codDistritoNac = codDistritoNac;
    }

    public String getCodUbigeoNac() {
        return this.codUbigeoNac;
    }

    public void setCodUbigeoNac(String codUbigeoNac) {
        this.codUbigeoNac = codUbigeoNac;
    }

    public String getNumTelefono() {
        return this.numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNumFax() {
        return this.numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getDesEmail() {
        return this.desEmail;
    }

    public void setDesEmail(String desEmail) {
        this.desEmail = desEmail;
    }

    public String getDesPaginaWeb() {
        return this.desPaginaWeb;
    }

    public void setDesPaginaWeb(String desPaginaWeb) {
        this.desPaginaWeb = desPaginaWeb;
    }

    public String getCodTenenciaVivienda() {
        return this.codTenenciaVivienda;
    }

    public void setCodTenenciaVivienda(String codTenenciaVivienda) {
        this.codTenenciaVivienda = codTenenciaVivienda;
    }

    public String getCodTipoVivienda() {
        return this.codTipoVivienda;
    }

    public void setCodTipoVivienda(String codTipoVivienda) {
        this.codTipoVivienda = codTipoVivienda;
    }

    public String getCodEstadoVivienda() {
        return this.codEstadoVivienda;
    }

    public void setCodEstadoVivienda(String codEstadoVivienda) {
        this.codEstadoVivienda = codEstadoVivienda;
    }

    public String getCodUbicacionVivienda() {
        return this.codUbicacionVivienda;
    }

    public void setCodUbicacionVivienda(String codUbicacionVivienda) {
        this.codUbicacionVivienda = codUbicacionVivienda;
    }

    public int getCodProfesion() {
        return this.codProfesion;
    }

    public void setCodProfesion(int codProfesion) {
        this.codProfesion = codProfesion;
    }

    public String getCodNivelEducativo() {
        return this.codNivelEducativo;
    }

    public void setCodNivelEducativo(String codNivelEducativo) {
        this.codNivelEducativo = codNivelEducativo;
    }

    public String getCodCentroFormacionp() {
        return this.codCentroFormacionp;
    }

    public void setCodCentroFormacionp(String codCentroFormacionp) {
        this.codCentroFormacionp = codCentroFormacionp;
    }

    public String getFlgAapension() {
        return this.flgAapension;
    }

    public void setFlgAapension(String flgAapension) {
        this.flgAapension = flgAapension;
    }

    public String getCodCatOcupacionalPe() {
        return this.codCatOcupacionalPe;
    }

    public void setCodCatOcupacionalPe(String codCatOcupacionalPe) {
        this.codCatOcupacionalPe = codCatOcupacionalPe;
    }

    public String getCodConvenioDoblet() {
        return this.codConvenioDoblet;
    }

    public void setCodConvenioDoblet(String codConvenioDoblet) {
        this.codConvenioDoblet = codConvenioDoblet;
    }

    public String getDesReferencia() {
        return this.desReferencia;
    }

    public void setDesReferencia(String desReferencia) {
        this.desReferencia = desReferencia;
    }

    public String getDesActividad() {
        return this.desActividad;
    }

    public void setDesActividad(String desActividad) {
        this.desActividad = desActividad;
    }

    public String getFecCreacion() {
        return this.fecCreacion;
    }

    public void setFecCreacion(String fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public String getHorCreacion() {
        return this.horCreacion;
    }

    public void setHorCreacion(String horCreacion) {
        this.horCreacion = horCreacion;
    }

    public int getCodUsuarioCreacion() {
        return this.codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(int codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public String getFecActualizacion() {
        return this.fecActualizacion;
    }

    public void setFecActualizacion(String fecActualizacion) {
        this.fecActualizacion = fecActualizacion;
    }

    public String getHorActualizacion() {
        return this.horActualizacion;
    }

    public void setHorActualizacion(String horActualizacion) {
        this.horActualizacion = horActualizacion;
    }

    public int getCodUsuarioActualizacion() {
        return this.codUsuarioActualizacion;
    }

    public void setCodUsuarioActualizacion(int codUsuarioActualizacion) {
        this.codUsuarioActualizacion = codUsuarioActualizacion;
    }

    public AgmaeTiposPersona getAgmaeTiposPersona() {
        return agmaeTiposPersona;
    }

    public void setAgmaeTiposPersona(AgmaeTiposPersona agmaeTiposPersona) {
        this.agmaeTiposPersona = agmaeTiposPersona;
    }

    public String getDesDireccionFacturacion() {
        return desDireccionFacturacion;
    }

    public void setDesDireccionFacturacion(String desDireccionFacturacion) {
        this.desDireccionFacturacion = desDireccionFacturacion;
    }

    
    
}
