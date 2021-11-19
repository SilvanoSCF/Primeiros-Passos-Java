package com.dio.Model.ArraysEEstruturasDeRepetacao;

import java.util.Random;
public class ArrayMultidimencional {
    public static void main(String[] args) {
        Random ran = new Random();

        int [][] M = new int [4][4];

        for( int i = 0; i < M.length; i++)
        {
            for (int j = 0; j < M[i].length; j++)
            {
                M[i][j] = ran.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int [] linha : M)
        {
            for (int elementoDaColuna : linha)
            {
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();


        }


    }


}
