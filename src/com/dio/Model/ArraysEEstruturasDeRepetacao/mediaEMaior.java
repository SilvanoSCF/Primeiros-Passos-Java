package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

public class mediaEMaior {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int maior = 0;
        int soma = 0;
        int media = 0;
        int numero;

        System.out.println("Informe os valores das notas: ");
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt() ;
            if (numero > maior) maior = numero; // Se o numero for maior que a variavel 'maior', atribuir o valor do numero a variavel maior.
            soma = soma+numero;
            count++;
            media = (soma / count);
            System.out.println(media);
            System.out.println(numero);
        }while(count < 5);

        System.out.println("A média dos valores é: "+media); // Informar a média dos valores solicitados.
        System.out.println("O maior valor é o: "+maior); // Informar a maior nota solicitada.

    }

}
