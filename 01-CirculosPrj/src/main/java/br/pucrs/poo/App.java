package br.pucrs.poo;

public class App
{
    public static void main(String[] args)
    {
        Circulo c1, c2, c3;
        c1 = new Circulo();
        c2 = new Circulo(2, 4, 6);
        c3 = new Circulo(6, 7, 8);

        c1.mover(7, 4);
        System.out.println(c1.toString());

        c2.zoom(2);
        System.out.println(c2.toString());

        double area = c3.area();
        System.out.println("Área do Círculo: " + area);

        Circulo[] circulos = new Circulo[3];
        circulos[0] = c1;
        circulos[1] = c2;
        circulos[2] = c3;

        for (Circulo c : circulos)
        {
            System.out.println(c.toString());
        }
    }
}

