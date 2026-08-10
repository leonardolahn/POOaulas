package br.pucrs.poo;

public class Circulo
{
    private double raio;
    private Ponto centro;

    public Circulo()
    {
        this.centro = new Ponto(0, 0);
        this.raio = 1;
    }

    public Circulo(double umX, double umY, double raio)
    {
        this.centro = new Ponto(umX, umY);
        this.raio = raio;
    }

    public void mover(double novoX, double novoY)
    {
        //1. criar um novo Ponto
        //this.centro = new Ponto(novoX, novoY);
        //ou
        //2. usar o mover do Ponto
        centro.mover(novoX, novoY);
    }

    public void zoom(double fator)
    {
        this.raio = raio * fator;
    }

    public double area()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString()
    {
        return "Centro do círculo: " + centro.toString() +
               "\nRaio: " + raio;
    }
}

