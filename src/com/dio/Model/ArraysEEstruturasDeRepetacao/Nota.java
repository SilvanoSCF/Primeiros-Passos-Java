package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

/*
   Solicitação de um numero de 0 a 10, senão retorno para nova solicitação.
*/
public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Informe um valor de 0 a 10");
        nota = scan.nextInt();

        while(nota < 0 || nota >10){

            System.out.println(nota + " não é um valor que corresponde ao solicitado, Informe um valor de 0 a 10.");
            nota = scan.nextInt();

        }

        System.out.println(nota + " é um valor que atende a solicitação.");
        System.out.println("Fim do Processo");





    }

}
