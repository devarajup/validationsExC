package com.cjss.validations.model;

public class ErrorType {
    private  String message;
    private String code;
    private  String error;
    private  String classType;
    private String idReq;

    public ErrorType(String message, String code, String error, String classType, String idReq) {
        this.message = message;
        this.code = code;
        this.error = error;
        this.classType = classType;
        this.idReq = idReq;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getIdReq() {
        return idReq;
    }

    public void setIdReq(String idReq) {
        this.idReq = idReq;
    }
}
