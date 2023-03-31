package Exercicio02;

public class CalculaMedia {
    public static void main(String[] args) {
        Media media = new Media();

        System.out.println("Média dos números 8, 9 e 7: " + media.media1);
        System.out.println("Média dos números 4, 5 e 6: " + media.media2);
        System.out.println("Soma das duas médias: " + media.mediaTotal);
        System.out.println("Média das médias: " + media.mediaMedias);
    }
}
