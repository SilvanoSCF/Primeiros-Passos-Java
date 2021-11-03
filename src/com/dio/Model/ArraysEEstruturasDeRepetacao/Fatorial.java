package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

public class Fatorial {

    // Ex 5! = 5 x 4 x 3 x 2 x 1 = 120  Fatorial
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial;
        int multiplicacao = 1;
        System.out.println("Fatorial :");
        fatorial = scan.nextInt();

        for (int i = fatorial; i > 1; i--)
        {
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }


}
