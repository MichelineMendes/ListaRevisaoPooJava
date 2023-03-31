package Exercicio01;

/*1. Faça um algoritmo que receba via constutor a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
Obs.: Leve em consideração o ano com 365 dias e o mês com 30
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
*/

public class Calcula {


    public static void main(String[] args) {
        Idade idade = new Idade(40, 9, 45);
        int novaIdade = idade.diasVida();
        System.out.println("A idade em dias é : " + novaIdade);
    }
}