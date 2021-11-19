package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Random;

public class numerosAleatorios {

    public static void main(String[] args) {



    Random ran = new Random();

    int[] nAleatorio = new int[90];


    for ( int i = 0; i < nAleatorio.length; i++)
    {
        int numero = ran.nextInt(100);

        nAleatorio[i] = numero;


        System.out.println("\n NUmeros Aleatórios ");
        for (int numeros : nAleatorio  ) {
            System.out.println(numero +" ");
        }

        System.out.println("\n NUmeros Aleatórios ");
        for (int numeros : nAleatorio  ) {
            System.out.println(numero+1 + " ");
        }
    }


    }
}
