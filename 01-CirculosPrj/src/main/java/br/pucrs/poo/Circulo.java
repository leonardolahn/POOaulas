package br.pucrs.poo;

public class Circulo
{
    private double raio;

    public Circulo()
    {
        this.raio = 1;
    }

    public Circulo(Ponto umX, Ponto umY, double raio)
    {
        this.coordX = umX;
        this.coordY = umY;
        this.raio = raio;
    }

    public void mover(Ponto novoX, Ponto novoY)
    {
        this.coordX = novoX;
        this.coordY = novoY;
    }

    public void zoom(double fator)
    {
        this.raio = raio * fator;
    }

    public double area()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    public String toString()
    {
        return "Raio: " + raio;
    }
}

