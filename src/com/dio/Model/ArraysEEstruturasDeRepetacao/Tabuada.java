package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Informe um numero de 1 a 9 ");
        //int y = scan.nextInt();

        for (int y = 2; y < 10; y++) {

            System.out.println("Tabuada de "+ y);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + y + " = " + (i * y));
            }
            System.out.println("***********");

        }
    }
}