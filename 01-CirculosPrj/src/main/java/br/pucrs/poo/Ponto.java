package br.pucrs.poo;
public class Ponto
{
    private double coordX;
    private double coordY;

    public Ponto(double umX, double umY)
    {
        this.coordX = umX;
        this.coordY = umY;
    }

    public void mover(double umX, double umY)
    {
        this.coordX = umX;
        this.coordY = umY;
    }

    @Override
    public String toString()
    {
        return "Coordenada X: " + coordX +
               "\nCoordenada Y: " + coordY;
    }
}
