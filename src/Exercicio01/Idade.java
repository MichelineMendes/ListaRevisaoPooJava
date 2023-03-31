package Exercicio01;

public class Idade {
    private final int dias;
    public int anos;
    public int meses;



    public Idade(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }


    public int diasVida(){
       int novaIdade;
        novaIdade = anos * 365 + meses * 30 + dias;
        return novaIdade;
    }


}
