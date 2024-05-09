package com.prueba.demo.service.implment;

import com.prueba.demo.constants.Message;
import com.prueba.demo.model.ResponseModel;
import com.prueba.demo.model.Usuario;
import com.prueba.demo.repository.UsuarioRepository;
import com.prueba.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public ResponseModel crearUsuario(Usuario usuario) {
        ResponseModel response;
        try {
            validarUsuario(usuario);
            boolean existe = usuarioRepository.existeUsuario(usuario.getEmail());
            if (existe){
                throw new Exception(Message.USUARIO_EXISTE);
            }
            response = new ResponseModel(Message.SUCCESS);
        }catch (Exception e){
            response = new ResponseModel(e.getMessage(),501);
        }
        return response;
    }

    @Override
    public ResponseModel actualziarUsuario(Usuario usuario) {
        ResponseModel response;
        try {
            boolean existe = usuarioRepository.existeUsuario(usuario.getEmail());
            if (existe){
                throw new Exception(Message.USUARIO_EXISTE);
            }
            usuarioRepository.actualziarUsuario(usuario);
            response = new ResponseModel(Message.SUCCESS);
        }catch (Exception e){
           response = new ResponseModel(e.getMessage(),501);
        }
        return response;
    }

    @Override
    public ResponseModel getUsuarioByID(long idUsuario) {

        return null;
    }

    @Override
    public ResponseModel eliminarUsuario(long idUsuario) {
        return null;
    }

    private void validarUsuario(Usuario usuario) throws Exception {
        if (!validateRegex(Message.EMAIL_REGEX,usuario.getEmail())){
            throw new Exception(Message.CORREO_INVALIDO);
        }
        if (usuario.getPass().length() < 8){
            throw new Exception(Message.MESSAGE_PASS);
        }
        if (!validateRegex(Message.MAYUSCULA_MINUSCULA_REGEX,usuario.getPass())){
            throw new Exception(Message.LETRA_MAYUSCULA_MINUSCULA);
        }
        if (!validateRegex(Message.DIGITO_REGEX,usuario.getPass())){
            throw new Exception(Message.DIGITO);
        }
        if (!validateRegex(Message.CARACTER_ESPECIAL_REGEX,usuario.getPass())){
            throw new Exception(Message.CARACTER);
        }
    }

    private boolean validateRegex(String regex, String valor){
        Pattern pattern  = Pattern.compile(regex);
        Matcher matcher =  pattern.matcher(valor);
        return matcher.matches();
    }
}
