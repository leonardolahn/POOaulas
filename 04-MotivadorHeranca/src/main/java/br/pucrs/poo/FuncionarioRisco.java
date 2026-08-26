package br.pucrs.poo;

public class FuncionarioRisco extends Funcionario
{
    // 1. Atributo novo: qual o tipo e nome?


    // 2. Construtor: quais parâmetros recebe?
    public FuncionarioRisco(/* ... */)
    {
        super(/* quais argumentos passam pra Funcionario? */);
        // atribuir o atributo novo aqui
    }

    // 3. Sobrescrita do cálculo do salário líquido
    public double getSalarioLiquido()
    {
        // usa super.getSalarioLiquido() e acrescenta 25%
    }

    // 4. Sobrescrita do toString
    public String toString()
    {
        // usa super.toString() e acrescenta a info da categoria de risco
    }
}
