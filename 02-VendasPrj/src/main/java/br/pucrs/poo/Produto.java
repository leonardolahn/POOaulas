package br.pucrs.poo;

public class Produto
{
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int umCodigo, String umNome, double umPreco)
    {
        this.codigo = umCodigo;
        this.nome = umNome;
        this.preco = umPreco;
    }

    public int getCodigo()
    {
        return codigo;
    }
    public String getNome()
    {
        return nome;
    }
    public double getPreco()
    {
        return preco;
    }

    @Override
    public String toString()
    {
        return String.format("Código: %d%nNome: %s%nPreço: %.2f", codigo, nome, preco);
    }
}
