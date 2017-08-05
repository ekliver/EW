package sys.model;

public class AgmaeDepartamento  implements java.io.Serializable {


     private int codDepartamento;
     private String desDepartamento;
     private String cesDepartamento;
     private String fecCreacion;
     private String horCreacion;
     private int codUsuarioCreacion;
     private String fecActualizacion;
     private String horActualizacion;
     private int codUsuarioActualizacion;

    public AgmaeDepartamento() {
    }

   
    public int getCodDepartamento() {
        return this.codDepartamento;
    }
    
    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    public String getDesDepartamento() {
        return this.desDepartamento;
    }
    
    public void setDesDepartamento(String desDepartamento) {
        this.desDepartamento = desDepartamento;
    }
    public String getCesDepartamento() {
        return this.cesDepartamento;
    }
    
    public void setCesDepartamento(String cesDepartamento) {
        this.cesDepartamento = cesDepartamento;
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


