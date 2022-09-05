# Prova_02_POO
2ª Prova Prática da disciplina Programação Orientada a Objetos

-------------------------------------------------------------------------------------

Nota referente a esta prova: 8.0

-------------------------------------------------------------------------------------


Deve ser desenvolvido um "Sistema de controle de músicos e instrumentos", de acordo com as informações abaixo (sem consulta):

1) Domínio da aplicação:

Classe: musico.Musico

 Atributos: nome, ArrayList<Instrumento> instrumentos

 Métodos: getters, setters, tocarInstrumento(), toString()



Classe:instrumento.Instrumento

 Atributos: marca, numeroLoteFabricacao

 Métodos: getters, setters, emitirSom(), toString()



Interface: instrumento.corda.Distorcao 

 Métodos: emitirSomDistorcido()



Classe: instrumento.corda.Guitarra

 Atributos: numeroCordas

 Metodos:  emitirSom(), emitirSomDistorcido(), getNumCordas(), toString()



Classe: instrumento.corda.Violao

 Atributos: numeroCordas

 Metodos:  emitirSom(), emitirSomDistorcido(), getNumCordas(), toString()

 

Classe: instrumento.piano.Piano

 Atributos: numeroPedais, numeroTeclas,  Boolean digital,  Armario armario; ArrayList<EfeitoSonoro> efeitosSonoros

 Métodos: getters, setters, toString, adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro), emitirSom()

	

Classe: instrumento.piano.EfeitoSonoro

 Atributos: String efeitoSonoro



Classe: instrumento.piano.Armario

 Atributos: tipoMadeira

 Métodos: getters, setters		



2) Detalhes de implementação:

No métodos tocarInstrumento(), da classe Musico, deve-se percorre a lista de instrumentos do músico e chama o método emitirSom(), verificando também se o instrumento tem Distorção para chamar o métodos emitirSomDistorcao()
Os métodos emitirSom() e emitirSomDistorcido(), implementados nos instrumentos, devem retornar strings indicando qual instrumento está emitindo o som (normal ou distorcido)


3) Tarefas

a) Repositório

* Crie um repositório privado no Github, adicione o professor como membro (@paulormm).

> Os commits devem mostrar a evolução do desenvolvimento das partes do código

b) Diagramas (fazer usando uma ferramenta de sua preferência)

Faça um diagrama de classes
c) Implementação

* Classes

* Classe abstrata

* Interface

* Testes Automatizados

4) Critérios de avaliação

Diagramas: 0,5
Classes (heranças e classes abstratas) e interface do pacote musico e instrumento: 2,0
Método tocarInstrumento(): 0,5
Métodos toString: 0,5
Testes de unidade automatizados (100% de cobertura de testes para os pacotes musico e instrumento): 4,0
Repositório (organização e commits): 0,5
