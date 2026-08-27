package br.pucrs.poo;

public class FuncionarioRisco extends Funcionario
{
    // 1. Atributo novo: qual o tipo e nome?
    private CategoriasRisco categorias;

    // 2. Construtor: quais parâmetros recebe?
    public FuncionarioRisco(String matricula, String nome,
                            double salarioBruto, CategoriasRisco categorias)
    {
        super(matricula, nome, salarioBruto);
        this.categorias = categorias;
    }

    // 3. Sobrescrita do cálculo do salário líquido
    public double getSalarioLiquido()
    {
        // usar super.getSalarioLiquido() e acrescenta 25%
        return super.getSalarioLiquido() * 1.25;
    }

    // 4. Sobrescrita do toString
    @Override
    public String toString()
    {
        // usar super.toString() e acrescenta a info da categoria de risco
        return super.toString() +
               "\nCategorias de Risco: " + categorias;
    }
}
