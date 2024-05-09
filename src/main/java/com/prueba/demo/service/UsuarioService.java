package com.prueba.demo.service;

import com.prueba.demo.model.ResponseModel;
import com.prueba.demo.model.Usuario;

public interface UsuarioService {
    ResponseModel crearUsuario(Usuario usuario);
    ResponseModel actualziarUsuario(Usuario usuario);
    ResponseModel getUsuarioByID(long idUsuario);
    ResponseModel eliminarUsuario(long idUsuario);

}
