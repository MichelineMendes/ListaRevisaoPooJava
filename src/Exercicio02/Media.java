package Exercicio02;
/* Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6.
A soma das duas médias. A média das médias.
*/

public class Media {
    int media1;
    int media2;
    int mediaTotal;
    int mediaMedias;

    public Media() {
        this.calcularMedia1();
        this.calcularMedia2();
        this.calcularMediaTotal();
        this.calcularMediaMedias();
    }

    public float calcularMedia1() {
        media1 = (8 + 9 + 7) / 3;
        return media1;
    }
    public float calcularMedia2(){
        media2 = media2 = (4 + 5 + 6) / 3;
        return media2;
    }

    public float calcularMediaTotal() {
        mediaTotal = media1 + media2;
        return mediaTotal;
    }

    public float calcularMediaMedias() {
        mediaMedias = mediaTotal / 2;
        return mediaMedias;
    }
}