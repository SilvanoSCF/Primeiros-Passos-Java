package com.dio.Model.DesafiosMatematicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matematicos {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println("Informe o primeiro valor: ");
        int a = Integer.parseInt(st.nextToken());
        System.out.println("Informe o Segundo valor: ");
        int b = Integer.parseInt(st.nextToken());
        int total = a + b;

        System.out.println("Total esperado é: ");
        System.out.println("X = " + total);


    }
}
