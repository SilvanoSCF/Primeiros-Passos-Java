package com.dio.Model.POO;

import java.util.List;

public class Cliente extends Pessoa{

    public Integer codigo;
    public String nome;
    public Integer cpf;

    private List<Endereco> enderecos;

    public void adicionaEndereco (Endereco endereco)
    {
        if (endereco ==null)
        {
            throw new NullPointerException("Endereço não pode ser nulo !!!");
        }
        if (endereco.cep == null)
        {
            throw new NullPointerException("Cep não pode ser nulo !!!");
        }
    }

}
