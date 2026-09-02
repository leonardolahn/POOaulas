package br.pucrs.poo;
public abstract class Imovel
{
    private String proprietario;
    private int areaConstruida;
    private Geo geo;
    private static double VR;

    public Imovel(String prop, int area, Geo geo)
    {
        this.proprietario = prop;
        this.areaConstruida = area;
        this.geo = geo;
    }

    public String getProprietario()
    {
        return proprietario;
    }

    public int getAreaConstruida()
    {
        return areaConstruida;
    }

    public static double getVR()
    {
        return VR;
    }

    public static void setVR(double novoVR)
    {
        VR = novoVR;
    }

    public abstract double calculaImposto();

    @Override
    public String toString()
    {
        return String.format(
            "Proprietário: %s\n" +
            "Área Construída: %d\n" +
            "Geolocalização: %s",
            proprietario,
            areaConstruida,
            geo.toString()
        );
    }
}
