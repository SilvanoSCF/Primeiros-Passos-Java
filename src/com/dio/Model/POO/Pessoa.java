package com.dio.Model.POO;

public class Pessoa {

    public enum TipoPessoa{Fisica, Juridica}

    public Integer codigo;
    public String nome;
    public String documento;
    public TipoPessoa tipo;
}
