package br.com.dio.java.collections.exceptions;

public class ParametrosInvalidosException extends RuntimeException {

    public ParametrosInvalidosException(String mensagem, Throwable ex) {
        super(mensagem, ex);
    }


    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}