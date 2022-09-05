package test;

import instrumento.Instrumento;
import instrumento.corda.Guitarra;
import instrumento.corda.Violao;
import instrumento.piano.Armario;
import instrumento.piano.EfeitoSonoro;
import instrumento.piano.Piano;
import musico.Musico;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class InstrumentoTest {

    Guitarra guitarra;
    Piano piano;

    Violao violao;

    Armario armario;

    EfeitoSonoro efeitosonoro;
    @Before
    public void instanciarInstrumentos(){
        guitarra = new Guitarra("qualquer",10,5);
        violao = new Violao("qualquer",10,5);
        armario = new Armario("Lisa");
        piano = new Piano("qualquer",10,10,10,true,armario);
        efeitosonoro = new EfeitoSonoro("Blang");
    }

    @Test

    public void testeCordas(){
        String guitarraSomNormal = guitarra.emitirSom();
        String guitarraSomDistorcido = guitarra.emitirSomDistorcido();
        String violaoSomNormal = violao.emitirSom();
        String violaoSomDistorcido = violao.emitirSomDistorcido();

        assertEquals("A Guitarra está emitindo um som normal.",guitarraSomNormal);
        assertEquals("A Guitarra está emitindo um som distorcido.",guitarraSomDistorcido);
        assertEquals("O Violão está emitindo um som normal.",violaoSomNormal);
        assertEquals("O Violão está emitindo um som distorcido.",violaoSomDistorcido);

    }

    @Test

    public void testePiano(){
        String mensagem = piano.emitirSom();
        assertEquals("O Piano está emitindo um som normal.",mensagem);
    }

    @Test
    public void testeAdicionarEfeitoSonoro(){
        piano.adicionarEfeitoSonoro(efeitosonoro);
        assertEquals(1,piano.getEfeitosSonoros().size());
    }

}