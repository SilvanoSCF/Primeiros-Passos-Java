package com.dio.Model;

public class TiposDeDados {

    //Tipos de dados, operadores matemáticos tipos de dados operadores aritméticosem java

    //Tipo correto de variavel

    int i;

    //Boa pratica de Programação estilo camelo
    int cadastroProduto;

    // Para variaveis do tipo final, toda em Maiusculo
    final int NUMERO = 10;

    ///////////////

    //Não são boas praticas de programação
    // Variaveis comuns iniciadas em maiusculo

    int Z;

    // Uma variavel final não sendo toda maiuscula ex:

    //Final int produtoUM;

    // Não é uma boa pratica, variaveis iniciadas com numero

   // int 1numero;


    ////////////////////////////

    //Tipos de dados.

    // Titificação

    //Estatica (forte)  x  Dinamico (fraco)
    //Primitivos   x   Composto    tipos abicos numericos e textuais     Orientaçãoa objetos struct
    //tipos   textual, numerico,     logico     e   objeto

    // Numeral:

    byte b = 15;   // -128 ate 127
    Short s = - 15768; // -32768 ate 32767
    int numeralInt = 87656434;  //-2147483648 ate 2147468647
    long numeralLong = 674356347538L;  // -9223372036854775808 ATE 9223372036854775807
    float numeralFloat = 3.149F;  // 340282347E+38F   --   Necessario colocar o F no final para identificar como float
    double numeroalDouble = 3.1488D; // 179769313486231570E+308  sem necessidade de colocar o d no final, por ja associar .

    // Textual

    char c = 't';   // Caracteres de 16 bits unicode
    String textualS = "String especial";   // Tipo especial;


    // Logico

    boolean bol = false;
    boolean bols = true;  // true ou false

    // pós-fixado;  exp++ ou exp--
    // Prefixado : ++exp ou --exp
    // Aritmético: + - * / %
    //Atribuição: =  +=  -=  *= /= %=


    // Casting converções

    // casting o que é:: é a transformação de uma determinada variavel
    // de tipo menos especifico para um tipo mais especifico ou vice versa.

    //tipos
    // Upcast(implicito)   menor para maior
    // Downcoast(explicito)  quano pegamos uma variavel complexa e transformamos em uma variavel de menos capacidade






}
