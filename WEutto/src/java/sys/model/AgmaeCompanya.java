package sys.model;

import java.io.Serializable;

public class AgmaeCompanya implements Serializable{
private String rucCompanya;
private String desCompanyia;

    public String getRucCompanya() {
        return rucCompanya;
    }

    public void setRucCompanya(String rucCompanya) {
        this.rucCompanya = rucCompanya;
    }

    public String getDesCompanyia() {
        return desCompanyia;
    }

    public void setDesCompanyia(String desCompanyia) {
        this.desCompanyia = desCompanyia;
    }
}
