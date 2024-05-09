package com.prueba.demo.controller;

import com.prueba.demo.model.ResponseModel;
import com.prueba.demo.model.Usuario;
import com.prueba.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin(origins = "http//localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/crear")
    public ResponseEntity<ResponseModel> crearUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.crearUsuario(usuario), HttpStatus.OK);
    }

    @PutMapping(value = "/actualizar")
    public ResponseEntity<ResponseModel> actualziarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.actualziarUsuario(usuario), HttpStatus.OK);
    }

    @GetMapping(value = "/eliminar/{idUsuario}")
    public ResponseEntity<String> eliminarUsuario(@PathVariable long idUsuario){
        usuarioService.eliminarUsuario(idUsuario);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(value = "/detalle/{idUsuario}")
    public ResponseEntity<String> detalleUsuario(@PathVariable long idUsuario){
        usuarioService.getUsuarioByID(idUsuario);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}



