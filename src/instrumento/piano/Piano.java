package instrumento.piano;

import instrumento.Instrumento;

import java.util.ArrayList;

public class Piano extends Instrumento {
    private int numeroPedais;
    private int numeroTeclas;
    private boolean digital;
    private Armario armario;
    static private ArrayList<EfeitoSonoro> efeitosSonoros = new ArrayList<>();

    public Piano(String marca, int numeroLoteFabricacao, int numeroPedais,
                 int numeroTeclas, boolean digital, Armario armario) {
        super(marca, numeroLoteFabricacao);
        this.numeroPedais = numeroPedais;
        this.numeroTeclas = numeroTeclas;
        this.digital = digital;
        this.armario = armario;
    }

    public String emitirSom(){
        return "O Piano está emitindo um som normal.";
    }

    public void adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro){
        efeitosSonoros.add(efeitoSonoro);
    }

    public void setNumeroPedais(int numeroPedais) {
        this.numeroPedais = numeroPedais;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public void setEfeitosSonoros(ArrayList<EfeitoSonoro> efeitosSonoros) {
        this.efeitosSonoros = efeitosSonoros;
    }

    public int getNumeroPedais() {
        return numeroPedais;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public boolean isDigital() {
        return digital;
    }

    public Armario getArmario() {
        return armario;
    }

    public ArrayList<EfeitoSonoro> getEfeitosSonoros() {
        return efeitosSonoros;
    }
}
