package sys.dao;

import java.util.List;
import sys.model.AgmaePersona;

public interface ClienteDAO {

    public List<AgmaePersona> listarClientes();

    public AgmaePersona consultarObjCliente(int codCliente);

}
