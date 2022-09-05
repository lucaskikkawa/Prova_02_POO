package instrumento.corda;

import instrumento.Instrumento;

public class Guitarra extends Instrumento implements Distorcao {
    private final int numeroCordas;

    public Guitarra(String marca, int numeroLoteFabricacao, int numeroCordas) {
        super(marca, numeroLoteFabricacao);
        this.numeroCordas = numeroCordas;
    }

    public String emitirSom(){
        return "A Guitarra está emitindo um som normal.";
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public String emitirSomDistorcido(){
        return "A Guitarra está emitindo um som distorcido.";
    }

    public String toString(){
        String message = "Guitarra com " + getNumeroCordas() + " cordas";
        return message;
    }
}
