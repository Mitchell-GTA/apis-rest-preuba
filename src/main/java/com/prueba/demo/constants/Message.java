package com.prueba.demo.constants;

import javax.swing.plaf.PanelUI;

public final class Message {
    public static final String MESSAGE_PASS = "Se requiere al menos 8 caracteres";
    public static final String SUCCESS = "Operacion exitosa";
    public static final String LETRA_MAYUSCULA_MINUSCULA = "La constraseña requiere al menos una letra mayúscula y una minúscula";
    public static final String USUARIO_EXISTE = "El usuario no exista en la base de datos";
    public static final String CORREO_INVALIDO = "Correo electrónico válido";
    public static final String DIGITO = "La contraseña requiere al menos un dígito.";
    public static final String CARACTER = "La contraseña requiere al menos un carácter especial";
    public static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final String MAYUSCULA_MINUSCULA_REGEX = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$";
    public static final String DIGITO_REGEX = "^(?=.*\\d)";
    public static final String CARACTER_ESPECIAL_REGEX = "^(?=.*[!@#$%])";
}
