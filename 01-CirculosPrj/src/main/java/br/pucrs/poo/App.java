package br.pucrs.poo;

public class App
{
    public static void main(String[] args)
    {
        Circulo c1, c2, c3;
        c1 = new Circulo();
        c2 = new Circulo(2, 3, 4);
        c3 = new Circulo(9, 8, 7);

        c1.mover(4, 5);
        System.out.println(c1.toString());

        c2.zoom(2);
        System.out.println(c2.toString());

        double area = c3.area();
        System.out.println("Área do círculo: " + area);

        Circulo[] lista = new Circulo[3];
        lista[0] = c1;
        lista[1] = c2;
        lista[2] = c3;

        for (Circulo c : lista)
        {
            System.out.println(c);
        }
    }
}

