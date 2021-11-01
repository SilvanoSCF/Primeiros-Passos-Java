package com.dio;

import java.util.Objects;

/**
 * Classe Pessoa
 * @Autor Silvano filho
 *
 */
public class Pessoa {

    String nome;
    String CPF;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return getNome().equals(pessoa.getNome()) && getCPF().equals(pessoa.getCPF());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCPF());
    }

    @Override
    public String toString() {
        return "Pessoa - " +
                "nome: '" + nome + '\'' +
                ", CPF: '" + CPF + '\'' +
                '.';
    }

    /**
     * Método void Calculo, solicita um valor para ser modificado, e testando Cpf e Nome da pessoa.
     * @param calculo
     */
    public void Calculo(int calculo)
    {
       this.getCPF();
       this.getNome();
       calculo = calculo + 3;
       System.out.println(calculo);
       System.out.println(getCPF());
       System.out.println(getNome());



    }

    /**
     * Método Construtor de Pessoa
     * @param nome
     * @param cpf
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }


}
