package br.pucrs.poo;

public abstract class Bagagem
{
    private String nome;
    private double peso;
    private Prioridade prioridade;

    public Bagagem(String nome, double peso, Prioridade prioridade)
    {
        this.nome = nome;
        this.peso = peso;
        this.prioridade = prioridade;
    }

    public String getNome()
    {
        return nome;
    }
    public double getPeso()
    {
        return peso;
    }
    public Prioridade getPrioridade()
    {
        return prioridade;
    }

    public abstract double calcularCusto();

    @Override
    public String toString()
    {
        return "Cliente: " + getNome();
    }
}
