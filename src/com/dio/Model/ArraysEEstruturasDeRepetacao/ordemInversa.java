package com.dio.Model.ArraysEEstruturasDeRepetacao;

public class ordemInversa {
    //Criar um vetor de seis numeros, e mostrar na forma inversa

    public static void main(String[] args) {

        int count = 0;

        int [] vetor = {-5, -6, 15, 50, 8, 4};
        System.out.println(vetor);
        System.out.println("Vetor: ");
        while(count < (vetor.length))
        {
            System.out.println(vetor[count]);
            count++;
        }

        for(int i =(vetor.length -1); 1 >=0; i-- ){
            System.out.println(vetor[i] + "");
        }

    }
}
