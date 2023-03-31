package Exercicio04;


public class Main {
    public static void main(String[] args) {
        Ipi ipi = new Ipi(2,3,632.2,598.1,5);
        double novoImposto = ipi.Ipi();
        System.out.println("O valor total é : " + novoImposto);
    }
}
