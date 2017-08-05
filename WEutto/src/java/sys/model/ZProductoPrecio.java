package sys.model;

import java.util.List;

/**
 * @Fecha 2017 - 04 - 29
 * @author Kliver Isidro
 * @email jekliver@gmail.com
 */
public class ZProductoPrecio implements java.io.Serializable {

    private String codProducto;
    private AimarProductos aimarProductos;
    private Double precioProducto;
    private String fecCreacion;
    private String horCreacion;
    private int codUsuarioCreacion;
    private String fecActualizacion;
    private String horActualizacion;
    private int codUsuarioActualizacion;

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public AimarProductos getAimarProductos() {
        return aimarProductos;
    }

    public void setAimarProductos(AimarProductos aimarProductos) {
        this.aimarProductos = aimarProductos;
    }

    public Double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Double precioProducto) {
        this.precioProducto = precioProducto;
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
    
    

}
