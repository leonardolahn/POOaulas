package br.pucrs.poo;
public class Boleto extends Pagamento
{
    private String codigoBarras;

    public Boleto(double umValor, String umCodigoBarras)
    {
        super(umValor);
        this.codigoBarras = umCodigoBarras;
    }

    @Override
    public boolean processar()
    {
        System.out.println(
            "Boleto de R$ " + getValor() +
            " com o código de barras " + codigoBarras
        );
        return true;
    }
}
