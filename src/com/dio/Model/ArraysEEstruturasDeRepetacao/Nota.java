package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Scanner;

/*
    Exercício para treinar o while em uma solicitação de um numero de 0 a 10 e sendo encerrado ao informar outro numero.
*/
public class Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Informe um valor de 0 a 10");
        while(true){
            nota = scan.nextInt();
            if (nota >= 0 && nota <=10){
                System.out.println("Nota ");
            }else{
                System.out.println("Valor Não corresponde ao pedido.");
                break;
            }


        }





    }

}
