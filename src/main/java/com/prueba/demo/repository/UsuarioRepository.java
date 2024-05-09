package com.prueba.demo.repository;

import com.prueba.demo.model.ResponseModel;
import com.prueba.demo.model.Usuario;

public interface UsuarioRepository {
    boolean crearUsuario(Usuario usuario);
    boolean actualziarUsuario(Usuario usuario);
    Usuario getUsuarioByID(long idUsuario);
    boolean eliminarUsuario(long idUsuario);
    boolean existeUsuario(String email);
}
