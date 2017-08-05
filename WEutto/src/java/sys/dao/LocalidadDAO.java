/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;

import sys.model.AgmaeEstablecimiento;
import sys.model.AgmaeUsuario;


/**
 *
 * @author Pc
 */
public interface LocalidadDAO {

    public List<AgmaeEstablecimiento> listarEstablecimientos(AgmaeUsuario usuario);

    public AgmaeEstablecimiento consultarObjEstablecimiento(String rucCompanya, String codEstablecimiento);

}
