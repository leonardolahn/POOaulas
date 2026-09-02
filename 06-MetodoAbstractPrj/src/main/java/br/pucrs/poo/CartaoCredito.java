package br.pucrs.poo;

public class CartaoCredito extends Pagamento
{
    private String numeroMascarado;
    private int parcelas;

    public CartaoCredito(double umValor, String umNumeroMascarado, int umaParcela)
    {
        super(umValor);
        this.numeroMascarado = umNumeroMascarado;
        this.parcelas = umaParcela;
    }

    @Override
    public boolean processar()
    {
        System.out.println(
            "Transferência em Crédito de " + getValor() +
            " para o número " + numeroMascarado +
            " em " + parcelas + " parcelas."
        );
        return true;
    }
}
