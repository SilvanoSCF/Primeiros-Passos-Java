package com.dio;

import java.util.Objects;

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

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.CPF = cpf;
    }


}
