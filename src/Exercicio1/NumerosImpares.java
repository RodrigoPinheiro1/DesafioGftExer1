package Exercicio1;

public class NumerosImpares {

    private int numInicial;
    private int numFinal;


    public int mostrarNumeros() {
        int i =0;



            for (i = numInicial; i <= numFinal; i++) {

                if (i % 2 == 1) {

                    System.out.print(i + " ");

                }

            }


        return i ;
    }

    @Override
    public String toString() {
        return
                "numInicial=" + numInicial +
                ", numFinal=" + numFinal +
                '}';
    }

    public int getNumInicial() {
        return numInicial;
    }

    public void setNumInicial(int numInicial) {
        this.numInicial = numInicial;
    }

    public int getNumFinal() {
        return numFinal;
    }

    public void setNumFinal(int numFinal) {
        this.numFinal = numFinal;
    }
}
