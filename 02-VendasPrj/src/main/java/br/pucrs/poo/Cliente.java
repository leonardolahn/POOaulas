package br.pucrs.poo;

public class Cliente
{
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }
    public String getCpf()
    {
        return cpf;
    }

    @Override
    public String toString()
    {
        return String.format("Nome: %s%nCPF: %s", nome, cpf);
    }
}

