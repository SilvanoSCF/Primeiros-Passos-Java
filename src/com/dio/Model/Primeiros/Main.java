package com.dio.Model.Primeiros;

import com.dio.Model.Primeiros.Order;
import com.dio.Model.Primeiros.Pessoa;

public class Main {

    public static void main(String[] args) {


        Pessoa p = new Pessoa("Silvano", "10377155780");

        p.Calculo(123);

        System.out.println(p);

        Order o = new Order("Sitema");

        System.out.println(o);



    }

}
