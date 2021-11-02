package com.dio.Model.Operadores;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Operadores {

    public static void main(String[] args) {

        // Relacionais

        // Similaridade      Igualdade ==     Diferença !=

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        String s1 = "um";
        String s2 = "dois";
        String s3 = "tres";
        boolean b1 = false;
        boolean b2 = true;

        short sh1 = 10;

        System.out.println( sh1 == n1);

        System.out.println( n3 >= (n1+n2));
        System.out.println( n3 > n1);
        System.out.println(n3 == (n1+n2));
        System.out.println(n2 != n1);

        // Operadores Logicos
        //tipos
        //Conjunção
        //Disjunção
        //Disjunção Exclusiva
        //Negação

        System.out.println(n1 < n2 && n3 > n2 );
        System.out.println(n1 < n2 || n3 > n2 );
        System.out.println(n1 > n2 && n3 > n2 );
        System.out.println(n1 > n2 || n3 > n2 );

        System.out.println(b1 != b2);
        System.out.println(b1 == b2);


        //System.out.println(n3 > n2);


    }




}
