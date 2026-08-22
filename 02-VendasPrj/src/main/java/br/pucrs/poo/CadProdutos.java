package br.pucrs.poo;
import java.util.ArrayList;

public class CadProdutos
{
    private ArrayList<Produto> lista;

    private CadProdutos()
    {
        lista = new ArrayList<>();
    }

    private static CadProdutos instance;

    public static CadProdutos getInstance()
    {
        if (instance == null)
        {
            instance = new CadProdutos();
        }
        return instance;
    }

    public void inserir(Produto prod)
    {
        lista.add(prod);
    }

    public void inserir(int umCod, String umNome, double umPreco)
    {
        lista.add(new Produto(umCod, umNome, umPreco));
    }

    public Produto pesquisar(int cod)
    {
        for (Produto prod : lista)
        {
            if (prod.getCodigo() == cod)
            {
                return prod;
            }
        }
        return null;
    }

    public String toString()
    {
        StringBuilder aux = new StringBuilder("\nCadastro de Produtos\n- - - - - - - - - -\n");
        for (Produto umProd : lista)
        {
            aux.append(umProd.toString() + "\n");
        }
        return aux.toString();
    }
}
