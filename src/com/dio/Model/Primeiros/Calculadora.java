package com.dio.Model.Primeiros;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Informe o primeiro valor: /n");
        a = scan.nextInt();

        System.out.println("Informe o segundo valor: /n");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Subtrair: "+ subtrair);
        System.out.println("Multiplicar: "+ multiplicar);
        System.out.println("Dividir: "+ dividir);
        System.out.println("Somar: "+ somar);
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static int dividir(int a, int b){
        return a / b;
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

}
