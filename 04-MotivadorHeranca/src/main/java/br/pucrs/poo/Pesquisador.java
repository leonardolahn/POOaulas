package br.pucrs.poo;

public class Pesquisador extends Funcionario
{
    // int guardando a categoria
    private int categoria;

    // construtor recebendo as heranças mais a categoria
    public Pesquisador(String matricula, String nome,
                            double salarioBruto, int categoria)
    {
        super(matricula, nome, salarioBruto);
        this.categoria = categoria;
    }

    //método para alterar a categoria
    public void alterar(int novaCategoria)
    {
        this.categoria = novaCategoria;
    }

    public double getSalarioLiquido()
     {
        double salarioLiquido = super.getSalarioLiquido();
        double bonus = 0;

        if (categoria == 1)
        {
            bonus = 1.05;
        }
        else if (categoria == 2)
        {
            bonus = 1.1;
        }
        else if (categoria == 3)
        {
            bonus = 1.20;
        }
        else
        {
            System.out.println("Categoria inválida. Salário líquido permanece sem bônus.");
            bonus = 1;
        }
        return salarioLiquido * bonus;
     }

    @Override
    public String toString()
    {
        return super.toString() +
               "\nCategoria de Pesquisadores: " + categoria;
    }
}
