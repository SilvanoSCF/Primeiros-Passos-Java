package com.dio.Model;

import com.dio.Main;

/**
 * Estrutura de Repetição e Condições em teste.
 * @author Silvano filho
 * @version 1.1.0
 *
 */
public class EstruturaDeRepeticaoERepeticao {



    public static void main(String[] args) {

        int numero = 2;

        if (numero > 9){
            System.out.println("Numero maior que 9");
        }else{
            System.out.println("Numero menor que 9");
        }

        switch (numero){
            case 1:
                System.out.println("Numero é um");
                break;
            case 2:
                System.out.println("Numero é dois");
                break;


        }



    }



}
