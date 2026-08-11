package br.pucrs.poo;

public class Cliente
{
    private String nome;
    private String codigo;

    public Cliente(String nome, String codigo)
    {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome()
    {
        return this.nome;
    }
    public String getCodigo()
    {
        return this.codigo;
    }

    @Override
    public String toString()
    {
        return String.format("Nome: %s%nCódigo: %s", nome, codigo);
    }
}

