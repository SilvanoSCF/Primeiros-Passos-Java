package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int cont = 0;
        int numero = 0;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Informe uma quantodade de numeros: ");
        quantNumeros = scan.nextInt();


        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();


            if (numero % 2 ==0) quantPares++;             // numero mod 2 == 0 ou seja se a divisão destes numeros tiver o resto como 0, numero impar.
            else quantImpares++;

            cont++;

        }while(cont < quantNumeros);

        System.out.println("Numeros Solicitador: " + quantNumeros);
        System.out.println("Quantidade par " + quantPares);
        System.out.println("Quantidade impar " + quantImpares);

    }

}
