package instrumento.corda;

import instrumento.Instrumento;

public class Violao extends Instrumento implements Distorcao {
    private final int numeroCordas;

    public Violao(String marca, int numeroLoteFabricacao, int numeroCordas) {
        super(marca, numeroLoteFabricacao);
        this.numeroCordas = numeroCordas;
    }


    public String emitirSom(){
        return "O Violão está emitindo um som normal.";
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public String emitirSomDistorcido(){
        return "O Violão está emitindo um som distorcido.";
    }

    public String toString() {
        String message = "Violão com " + getNumeroCordas() + " cordas";
        return message;
    }
}
