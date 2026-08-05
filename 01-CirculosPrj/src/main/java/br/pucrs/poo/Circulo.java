package br.pucrs.poo;

public class Circulo
{
    private double raio;
    private Ponto centro;

    public Circulo()
    {
        this.raio = 1;
        this.centro = new Ponto(0, 0);
    }

    public Circulo(double umX, double umY, double raio)
    {
        this.raio = raio;
        this.centro = new Ponto(umX, umY);
    }

    public void mover(double novoX, double novoY)
    {
        this.centro = new Ponto(novoX, novoY);
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
        return "Centro do círculo: " + centro +
               "\nRaio: " + raio;
    }
}

