package com.prueba.demo.repository.implement;

import com.prueba.demo.model.Usuario;
import com.prueba.demo.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioRepositoryImpl implements UsuarioRepository {
    @Override
    public boolean crearUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public boolean actualziarUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public Usuario getUsuarioByID(long idUsuario) {
        return null;
    }

    @Override
    public boolean eliminarUsuario(long idUsuario) {
        return false;
    }

    @Override
    public boolean existeUsuario(String email) {
        return false;
    }
}
