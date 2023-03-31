package Exercicio04;

//*4. Escrever um algoritmo que receba via construtor:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/


public class Ipi {
    public int quant1;
    public int quant2;
    public double valor1;
    public double valor2;
    public double ipi;
    public double imposto;

    public Ipi(int quant1, int quant2, double valor1, double valor2, double ipi) {
        this.quant1 = quant1;
        this.quant2 = quant2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.ipi = ipi;
    }


    public double Ipi (){
        double imposto;
        imposto = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
        double total = imposto;
        return total;
    }


}
