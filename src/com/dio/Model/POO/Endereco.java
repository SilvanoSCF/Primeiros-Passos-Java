package com.dio.Model.POO;

public class Endereco {

    public enum TipoEndereco {Residencial, Entrega, Trabalho}

    public String rua;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
    public TipoEndereco tipo;

}
