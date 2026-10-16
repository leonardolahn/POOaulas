package br.pucrs.poo;

public class Teste
{
    public static void main(String[] args)
    {
        // Crie uma matriz 4x4 com valores à sua escolha e imprima:
        int[][] matriz = {
                         {1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}
        };
        int somaP = 0;
        int somaS = 0;
        // (a) a diagonal principal
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++)
        {
            System.out.println(matriz[i][i]);
            somaP += matriz[i][i];
        }

        // (b) a diagonal secundária
        System.out.println("Diagonal secundária: ");
        for (int i = 0; i < matriz.length; i++)
        {
            System.out.println(matriz[i][matriz.length - 1 - i]);
            somaS += matriz[i][matriz.length - 1 - i];
        }

        // (c) a soma de cada diagonal
        System.out.println("Soma da Diagonal Principal: " + somaP);
        System.out.println("Soma da Diagonal Secundária: " + somaS);
    }
}
