package br.pucrs.poo;
import java.util.ArrayList;
import java.util.List;

public class Venda
{
    private Cliente cliente;
    List<ItemVenda> itens;

    public Venda(Cliente cliente)
    {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void inserir(int umaQtde, Produto umProd)
    {
        ItemVenda item = new ItemVenda(umaQtde, umProd);
        itens.add(item);
    }

    public void inserir(Produto prod)
    {
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
        return String.format("===NOTA FISCAL=== %nCliente: %s%nItens da Compra: %s%nValor Total: %s%n", cliente, itens, valorTotal());
    }
}
