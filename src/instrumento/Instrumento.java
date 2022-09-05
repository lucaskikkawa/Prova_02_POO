package instrumento;

public abstract class Instrumento {
    protected String marca;
    protected int numeroLoteFabricacao;

    public Instrumento(String marca, int numeroLoteFabricacao) {
        this.marca = marca;
        this.numeroLoteFabricacao = numeroLoteFabricacao;
    }

    public abstract String emitirSom();

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNumeroLoteFabricacao(int numeroLoteFabricacao) {
        this.numeroLoteFabricacao = numeroLoteFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroLoteFabricacao() {
        return numeroLoteFabricacao;
    }

    public String toString(){
        String message = "Marca do instrumento: " + getMarca() +
                "\n" + "Numero do lote de fabricacao:" + getNumeroLoteFabricacao();

        return message;
    }

}
