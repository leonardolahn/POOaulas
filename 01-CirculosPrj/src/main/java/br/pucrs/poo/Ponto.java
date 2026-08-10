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

    public void mover(double novoX, double novoY)
    {
        this.coordX = novoX;
        this.coordY = novoY;
    }

    @Override
    public String toString()
    {
        return "Coordenada X: " + coordX +
               "\nCoordenada Y: " + coordY;
    }
}
