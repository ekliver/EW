package sys.agregar;
// Generated 29-abr-2017 17:18:09 by Hibernate Tools 4.3.1



/**
 * AgmaeTiposAnexos generated by hbm2java
 */
public class AgmaeTiposAnexos  implements java.io.Serializable {


     private String tipAnexo;
     private String desTipoAnexo;
     private String desTipoAnexoAbrev;
     private String cesTipoAnexo;
     private String fecCreacion;
     private String horCreacion;
     private Integer codUsuarioCreacion;
     private String fecActualizacion;
     private String horActualizacion;
     private Integer codUsuarioActualizacion;

    public AgmaeTiposAnexos() {
    }

	
    public AgmaeTiposAnexos(String tipAnexo) {
        this.tipAnexo = tipAnexo;
    }
    public AgmaeTiposAnexos(String tipAnexo, String desTipoAnexo, String desTipoAnexoAbrev, String cesTipoAnexo, String fecCreacion, String horCreacion, Integer codUsuarioCreacion, String fecActualizacion, String horActualizacion, Integer codUsuarioActualizacion) {
       this.tipAnexo = tipAnexo;
       this.desTipoAnexo = desTipoAnexo;
       this.desTipoAnexoAbrev = desTipoAnexoAbrev;
       this.cesTipoAnexo = cesTipoAnexo;
       this.fecCreacion = fecCreacion;
       this.horCreacion = horCreacion;
       this.codUsuarioCreacion = codUsuarioCreacion;
       this.fecActualizacion = fecActualizacion;
       this.horActualizacion = horActualizacion;
       this.codUsuarioActualizacion = codUsuarioActualizacion;
    }
   
    public String getTipAnexo() {
        return this.tipAnexo;
    }
    
    public void setTipAnexo(String tipAnexo) {
        this.tipAnexo = tipAnexo;
    }
    public String getDesTipoAnexo() {
        return this.desTipoAnexo;
    }
    
    public void setDesTipoAnexo(String desTipoAnexo) {
        this.desTipoAnexo = desTipoAnexo;
    }
    public String getDesTipoAnexoAbrev() {
        return this.desTipoAnexoAbrev;
    }
    
    public void setDesTipoAnexoAbrev(String desTipoAnexoAbrev) {
        this.desTipoAnexoAbrev = desTipoAnexoAbrev;
    }
    public String getCesTipoAnexo() {
        return this.cesTipoAnexo;
    }
    
    public void setCesTipoAnexo(String cesTipoAnexo) {
        this.cesTipoAnexo = cesTipoAnexo;
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
    public Integer getCodUsuarioCreacion() {
        return this.codUsuarioCreacion;
    }
    
    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
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
    public Integer getCodUsuarioActualizacion() {
        return this.codUsuarioActualizacion;
    }
    
    public void setCodUsuarioActualizacion(Integer codUsuarioActualizacion) {
        this.codUsuarioActualizacion = codUsuarioActualizacion;
    }




}


