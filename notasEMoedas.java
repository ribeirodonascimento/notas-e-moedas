import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double valor = s.nextDouble();
        double notas100 = (valor / 100);
        valor %= 100;
        int nota100 = (int) notas100;
        double notas50 = (valor / 50);
        valor %= 50;
        int nota50 = (int) notas50;
        double notas20 = (valor / 20);
        valor %= 20;
        int nota20 = (int) notas20;
        double notas10 = (valor / 10);
        valor %= 10;
        int nota10 = (int) notas10;
        double notas5 = (valor / 5);
        valor %= 5;
        int nota5 = (int) notas5;
        double notas2 = (valor / 2);
        valor %= 2;
        int nota2 = (int) notas2;
        double moedas1 = (valor / 1);
        valor %= 1;
        int moeda1 = (int) moedas1;
        double moedas050 = (valor / 0.50);
        valor %= 0.50;
        int moeda50 = (int) moedas050;
        double moedas025 = (valor / 0.25);
        valor %= 0.25;
        int moeda25 = (int) moedas025;
        double moedas010 = (valor / 0.10);
        valor %= 0.10;
        int moeda10 = (int) moedas010;
        double moedas005 = (valor / 0.05);
        valor %= 0.05;
        int moeda5 = (int) moedas005;
        double moedas001 = (valor / 0.01);
        valor %= 0.01;
        int moed1 = (int) (moedas001 + 0.01);
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moed1  + " moeda(s) de R$ 0.01");


    }

}