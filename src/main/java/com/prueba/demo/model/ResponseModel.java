package com.prueba.demo.model;

public class ResponseModel {
    private String message;
    private int codigo;
    private boolean success;

    public ResponseModel(String message, int codigo) {
        this.message = message;
        this.codigo = codigo;
        this.success = false;
    }

    public ResponseModel(String message) {
        this.message = message;
        this.codigo = 200;
        this.success = true;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
