package sys.model;

/**
 * @Fecha 2017 - 04 - 29
 * @author Kliver Isidro
 * @email jekliver@gmail.com
 */

public class AgmaeTiposPersona  implements java.io.Serializable {


     private String tipPersona;
     private String desTipPersona;
     private String desAbrevTipPersona;
     private String cesStatus;
     private String cesTipoPersona;
     private String fecCreacion;
     private String horCreacion;
     private int codUsuarioCreacion;
     private String fecActualizacion;
     private String horActualizacion;
     private int codUsuarioActualizacion;

    public AgmaeTiposPersona() {
    }

	
    public AgmaeTiposPersona(String tipPersona) {
        this.tipPersona = tipPersona;
    }
    public AgmaeTiposPersona(String tipPersona, String desTipPersona, String desAbrevTipPersona, String cesStatus, String cesTipoPersona, String fecCreacion, String horCreacion, int codUsuarioCreacion, String fecActualizacion, String horActualizacion, int codUsuarioActualizacion) {
       this.tipPersona = tipPersona;
       this.desTipPersona = desTipPersona;
       this.desAbrevTipPersona = desAbrevTipPersona;
       this.cesStatus = cesStatus;
       this.cesTipoPersona = cesTipoPersona;
       this.fecCreacion = fecCreacion;
       this.horCreacion = horCreacion;
       this.codUsuarioCreacion = codUsuarioCreacion;
       this.fecActualizacion = fecActualizacion;
       this.horActualizacion = horActualizacion;
       this.codUsuarioActualizacion = codUsuarioActualizacion;
    }
   
    public String getTipPersona() {
        return this.tipPersona;
    }
    
    public void setTipPersona(String tipPersona) {
        this.tipPersona = tipPersona;
    }
    public String getDesTipPersona() {
        return this.desTipPersona;
    }
    
    public void setDesTipPersona(String desTipPersona) {
        this.desTipPersona = desTipPersona;
    }
    public String getDesAbrevTipPersona() {
        return this.desAbrevTipPersona;
    }
    
    public void setDesAbrevTipPersona(String desAbrevTipPersona) {
        this.desAbrevTipPersona = desAbrevTipPersona;
    }
    public String getCesStatus() {
        return this.cesStatus;
    }
    
    public void setCesStatus(String cesStatus) {
        this.cesStatus = cesStatus;
    }
    public String getCesTipoPersona() {
        return this.cesTipoPersona;
    }
    
    public void setCesTipoPersona(String cesTipoPersona) {
        this.cesTipoPersona = cesTipoPersona;
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




}


