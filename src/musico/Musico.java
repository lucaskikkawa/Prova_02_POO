package musico;

import java.util.ArrayList;
import instrumento.Instrumento;
import instrumento.corda.Distorcao;
import instrumento.corda.Guitarra;
import instrumento.corda.Violao;

public class  Musico   {
    String nome;
    ArrayList<Instrumento> instrumentos = new ArrayList<>();

    public Musico(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public String tocarInstrumento(){
        String mensagem = "";
        for (Instrumento instrumento: instrumentos){
            mensagem += instrumento.emitirSom() + "\n";
            if (instrumento instanceof Guitarra || instrumento instanceof Violao){
                mensagem += ((Distorcao) instrumento).emitirSomDistorcido() + "\n";
            }
        }

        return mensagem;
    }

    public String toString(){
        String mensagem = "Nome do músico: " + getNome() + "\n";
        for (Instrumento instrumento: instrumentos){
            mensagem += "Toco o instrumento " + instrumento.toString() + '\n';
        }

        return mensagem;
    }

}
