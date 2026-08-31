package br.pucrs.poo;

public class Pix extends Pagamento
{
    private String chaveDestino;

    public Pix(double umValor, String chaveDestino)
    {
        super(umValor);
        this.chaveDestino = chaveDestino;
    }

    @Override
    public boolean processar()
    {
        System.out.println(
            "Pix de " + getValor() +
            " para " + chaveDestino
        );
        return true;
    }
}
