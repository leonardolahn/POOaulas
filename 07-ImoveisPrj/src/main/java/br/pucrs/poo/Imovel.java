package br.pucrs.poo;
public abstract class Imovel
{
    private String proprietario;
    private int areaConstruida;
    private Geo geo;

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

    public abstract calculaImposto();

    @Override
    public String toString()
    {
        return String.format(
            "Proprietário: %s\n" +
            "Área Construída: %d\n" +
            "Coordenadas Geográficas: %s",
            proprietario,
            areaConstruida,
            geo.toString()
        );
    }
}
