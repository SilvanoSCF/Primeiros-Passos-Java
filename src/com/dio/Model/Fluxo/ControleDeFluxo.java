package com.dio.Model.Fluxo;

public class ControleDeFluxo {

    public static void main(String[] args) {


        /*
        Conceito Controle de fluxo
        Estruturas que tem a capacidade de direcionar o fluxo de execução do código

        Definição IF - Else , Switch e operador ternãrio
        Repetição For While do While
        Interrupção  Break Continue e return
         */

        // Estruturas de descisão

        // avalia uma condição booleana ou variavel para direcionar o fluxo de execução
        // if     switch    operador ternário

        int condicao = 1;

        if (condicao >=20)
        {
            System.out.println("Numero maior ou igual a 20.");
        }else if (condicao >= 1)
        {
            System.out.println("Numero maior que 1.");
        }else
        {
            System.out.println("Numero Menor que zero");
        }

        ///////////////////////////////////////////////////////////////////////

        int numero = 2;
        switch (numero){

            case 1 :
                System.out.println("Numero 1");
                break;
            case 2 :
                System.out.println("Numero 2");
                break;
            default:
                System.out.println("Nenhuma das alternativas");
                break;
        }
    /*
        Boas praticas
        Switch é para valores exatos e if para expressoes boleanas
        Evitar usar o default do switch para "Cases genericos"
        Evitar o efeito "Flecha" dos ifs
        Evitar muitos ifs aninhados
        Usar a boa pratica de aula 2 para diminuir o tamanhoif
     */



    /* Blocos

    é um grupo de 0 ou mais codigos quais trabalaham em conjunto
     para executar uma operação

     Tipos

      Locais : dentro de métodos
      Estáticos : dentro de classes
      instancia : dentro de classes
     */



    }






}
