package br.pucrs.poo;
import java.util.ArrayList;
import java.util.List;

public class Venda
{
    private List<ItemVenda> itens;
    private Cliente cliente;

    public Venda(Cliente cliente)
    {
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public void inserir(int umaQtde, Produto prod)
    {
        itens.add(new ItemVenda(umaQtde, prod));
    }

    public void inserir(Produto prod)
    {
        //DRY
        inserir(1, prod);
    }

    public double valorTotal()
    {
        double valorTotal = 0;
        for (ItemVenda item : itens)
        {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    @Override
    public String toString()
    {
        StringBuilder recibo = new StringBuilder();
        recibo.append(cliente.getNome() + "\n");
        for (ItemVenda item : itens)
        {
            recibo.append(item.getNome());
            recibo.append(item.getValor() + "\n");
        }
        return recibo.toString();
    }

}
