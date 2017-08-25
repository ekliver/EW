
package sys.model;

import java.io.Serializable;

public class AimarPresentaciones implements Serializable{
    private int codPresentacion;
    private String desPresentacion;
    private int valEquivalencia;
    private String codProducto;

    public int getCodPresentacion() {
        return codPresentacion;
    }

    public void setCodPresentacion(int codPresentacion) {
        this.codPresentacion = codPresentacion;
    }

    public String getDesPresentacion() {
        return desPresentacion;
    }

    public void setDesPresentacion(String desPresentacion) {
        this.desPresentacion = desPresentacion;
    }

    public int getValEquivalencia() {
        return valEquivalencia;
    }

    public void setValEquivalencia(int valEquivalencia) {
        this.valEquivalencia = valEquivalencia;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }
    
    
}
