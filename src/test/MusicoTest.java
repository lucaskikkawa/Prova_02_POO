package test;

import instrumento.Instrumento;
import instrumento.corda.Guitarra;
import instrumento.piano.Armario;
import instrumento.piano.Piano;
import musico.Musico;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicoTest {

    Musico musico;
    Guitarra guitarra;
    Piano piano;

    Armario armario;


    @Before
    public void instanciarMusico(){
        musico = new Musico("Beethoven");
        guitarra = new Guitarra("qualquer",10,5);
        armario = new Armario("Lisa");
        piano = new Piano("qualquer",10,10,10,true,armario);

        ArrayList<Instrumento> teste = musico.getInstrumentos();
        teste.add(guitarra);
        teste.add(piano);

        musico.setInstrumentos(teste);
    }

    @Test
    public void testeTocarInstrumento(){
        String mensagem = musico.tocarInstrumento();
        assertEquals("A Guitarra está emitindo um som normal.\n" +
                "A Guitarra está emitindo um som distorcido.\n" +
                "O Piano está emitindo um som normal." + '\n',mensagem);

    }

    @Test

    public void testeToString(){
        String mensagem = musico.toString();
        assertEquals("Nome do músico: Beethoven\n" +
                "Toco o instrumento Guitarra com 5 cordas\n" +
                "Toco o instrumento Marca do instrumento: qualquer\n" +
                "Numero do lote de fabricacao:10\n",mensagem);
    }


}