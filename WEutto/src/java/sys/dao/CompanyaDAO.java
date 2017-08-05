package sys.dao;

import java.util.List;
import sys.model.AgmaeCompanya;

public interface CompanyaDAO {

    public List<AgmaeCompanya> listarCompanyas();

    public AgmaeCompanya consultarObjCompanya(String rucCompanya);
}
