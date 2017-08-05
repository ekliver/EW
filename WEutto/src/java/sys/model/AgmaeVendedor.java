package sys.model;

import java.io.Serializable;

public class AgmaeVendedor implements Serializable{
private int codVendedor;
private String nomVendedor;

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }


}
