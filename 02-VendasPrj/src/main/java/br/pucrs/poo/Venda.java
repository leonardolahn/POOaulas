package br.pucrs.poo;
import java.util.ArrayList;
import java.util.List;

public class Venda
{
    List<ItemVenda> itens;
    private Cliente cliente;

    public Venda()
    {
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public void inserir(int umaQtde, Produto prod)
    {
        ItemVenda item = new ItemVenda(umaQtde, prod);
        itens.add(item);
    }

    public void inserir(Produto prod)
    {
        inserir(1, prod);
    }

    public double valorTotal()
    {
        int valorTotal = 0;
        for (ItemVenda item : itens)
        {
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    @Override
    public String toString()
    {
        return String.format("===NOTA FISCAL===%nCliente: %s%nItens da venda: %s%nValor Total: %.2f", cliente, itens, valorTotal());
    }
}
