package br.senai.sp.posto;

import java.util.Scanner;

public class posto {
    public static void main(String[] args) {

        String nome;
        float gasolina, alcool;
        double vantagem;

        Scanner teclado = new Scanner(System.in);

        while(true){

            System.out.println("#######################################################");
            System.out.println("============ Bem vindo ===========");
            System.out.println("Qual o seu nome? ");
            nome = teclado.next();
            System.out.println("Qual o preço da gasolina? ");
            gasolina = teclado.nextFloat();
            System.out.println("Qual o preço do alcool? ");
            alcool = teclado.nextFloat();
            System.out.println("#######################################################");

            vantagem = gasolina * 0.7;

            if (vantagem > alcool){
                System.out.println("É melhor abastecer com a alcool.");
            }
            else{
                System.out.println("É melhor abastecer com a gasolina.");
            }
        }
    }
}
