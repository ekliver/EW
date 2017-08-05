/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import sys.model.AgmaeUsuario;

public interface UsuarioDAO {

    public AgmaeUsuario obtenerDatosPorUsuario(AgmaeUsuario usuario);

    public AgmaeUsuario login(AgmaeUsuario usuario);
}
