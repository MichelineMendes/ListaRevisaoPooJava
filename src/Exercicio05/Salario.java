package Exercicio05;
/* Crie um algoritmo que receba via construtor o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$1320,00)*/
public class Salario {
    private float salario;
    private float salarioMinimo;

    public Salario(float salario, float salarioMinimo) {
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public void calcularSalariosMinimos() {
        float quantidade = salario / salarioMinimo;
        System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidade);
    }



}
