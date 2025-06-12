package model;

import java.util.Scanner;

public class Frota {

    Scanner input = new Scanner(System.in);
    String model,mark,plate;
    int days,year,specific;
    float capacity;

    public Carros registrarCarro(){
        System.out.println("Digite quantos dias vai querer de aluguel?");
        int days = Integer.parseInt(input.nextLine());
        System.out.println("Digite o modelo do carro");
        String model = input.nextLine();
        System.out.println("Digite a marca");
        String mark = input.nextLine();
        System.out.println("Digite a placa do carro: ");
        String plate = input.nextLine();
        System.out.println("Digite o ano de fabricação: ");
        int year = Integer.parseInt(input.nextLine());
        System.out.println("Digite o numero de portas do carro: ");
        int specific = Integer.parseInt(input.nextLine());

        Carros novo = new Carros(model, mark, plate, year, days, specific);
        return novo;
    }

    public Van registraVan(){
        System.out.println("Digite quantos dias vai querer de aluguel?");
        int days = Integer.parseInt(input.nextLine());
        System.out.println("Digite o modelo da Van");
        String model = input.nextLine();
        System.out.println("Digite a marca");
        String mark = input.nextLine();
        System.out.println("Digite a placa: ");
        String plate = input.nextLine();
        System.out.println("Digite o ano de fabricação: ");
        int year = Integer.parseInt(input.nextLine());
        System.out.println("Capacidade de passageiros: ");
        int specific = Integer.parseInt(input.nextLine());

        Van nova = new Van(model, mark, plate, days, year, specific);
        return nova;
    }
}
