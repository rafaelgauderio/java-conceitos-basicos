package entidades;

public class Metodos {

	private String titulo = "Conceitos de programa��o orientada a objetos\n";

	// construtor vazio
	public Metodos() {

	}

	// construtor com argumentos
	public Metodos(String titulo) {
		super();
		titulo = this.titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public static void vantagens() {

		System.out.println("---VANTAGENS---");
		System.out.println("\n1 - Fornece estrutura modular para os programas");
		System.out.println("2 - Mais f�cil de dar manuten��o no software");
		System.out.println("3 - Tem muito reuso de c�digo, o que deixa o desenvolvimento mais r�pido");
		System.out.println("4 - Objetos podem ser utilizados em apli��es diferentes");
		System.out.println("5 - Objetos podem ser reatilizados em aplica��es diferentes");
		System.out.println(
				"6 - Ao inv�s de operar apenas com tipos de dados primitivos, podemos construtir novos tipo de dados");
		System.out.println("7 - Encalsulamento: N�o � necess�rio conhecer a implemtenta��o interna de um objeto para poder utiliz�-lo");
		System.out.println("8 - Encapsulamento, Heran�a, Polimorfismo");

	}

	public void abstracao() {

		System.out.println(
				"\n---ABSTRA��O---" + "\nIsolar os objetos que queremos representar do ambiente complexo que se situam,"
						+ "\ne nesses obejtos podemos representar somente as caracter�sitcas"
						+ "\nque s�o relevantes para o problema em quest�o");

	}

	public void mensagens() {
		System.out.println("\n---MENSAGENS---" + "\nOs objetos se comunicam por mensagens."
				+ "\nMensagem � um sinal enviado de um objeto a outro, solicitando um servi�o,"
				+ "\nusando uma opera��o programa no objeto chamado."
				+ "\nObjetos precisam ter um associa��o para poder trocar mensagens."
				+ "\nQuando um mensagem � recebida, uma opera��o � INVOCADA no objeto chamado."
				+ "\nExistem v�rios formatos de mensagens: procedures (functions), passagens de sinas entre threads,"
				+ "\nacionamento de eventos.");

	}

	public String classe() {

		return "\n---CLASSES---"
				+ "\nUma classe representa um conceito e classifica objetos que tenham propriedades similares."
				+ "\nS�o os Blocos de constru��o mais importantes em OO."
				+ "\nS�o uma cole��o de objetos descritos com o s mesmos atritutos e m�todos."
				+ "\nS�o uma esp�ficie de MOLDE para cria��o de objetos."
				+ "\nconjunto de Classes ==  Namespace"
				+ "\nDeclarar classes sempre com Letra Inicial Mai�scula."
				+ "\nClasses podem ser representados em diagramas UML ";
	}
	
	public String objeto() {
		return "\n---OBJETO---"
				+ "\n� uma inst�ncia de classe. Ou seja, uma ocorr�ncia espef�fica de uma classe."
				+ "\n� a inst�ncia da classe na mem�ria da m�quina em tempo de execu��o."
				+ "\nUm objeto � uma constru��o de software que encapsula estado e comportamento."
				+ "\nUma �nica Classe pode gerar v�rios objetos com valores diferentes."				
				+ "\nRepresenta entidades de um mundo real. Como pessoas, conta correntes, motos, carros, figuras geom�tricas, etc."
				+ "\nPossui atributos (caracter�sticas pr�prias) e m�todos (executa a��es, fun��es)."
				+ "\nAtributos e m�todos vem da classe que originou o objeto."
				+ "\nExemplo: Classe seria a planta de uma casa e o Objeto e casa f�sica constru�da em si.";
	}
	
	public String atributos() {
		return "\n---ATRIBUTOS---"
				+ "\nCaracter�stica particular de uma ocorr�ncia de classe"
				+ "\nExistem 2 tipos: est�ticos (data de nascimento) e din�micos (Peso).";
				
	}
	
	public void metodos() {
		System.out.println("\n---M�TODO---"
				+ "\nSimilar a fun��es e procedimentos"
				+ "\nL�gica contida em uma classe para atribuir comportamentos."
				+ "\nAto de INVOCAR (chamar) um m�todo � a passagem de mensagens para o objeto."
				+ "\nUm m�todo deve apenas uma �nica funcionalidade. Objeto pode realizar ou sofrer a��es pela m�todos."
				+ "\nExemplo: Classe Carro tem o m�todo ligar, desligar, trocar marcha...");
		
	}
	
	public void heranca() {
		
		System.out.println("\n---HERAN�A---"
				+ "\nRelacionamento entre Classes, onde uma classe 'herda' os membros (atributos e m�todos) de outra classe."
				+ "\nServe para criar classes mais complexas sem repeti��o de c�digo."
				+ "\nExemplo: conta corrente e conta poupan�a herdam os m�todos e atributos de Classe conta banc�ria gen�rica."
				+ "\nExemplo: Mam�fero classe pai de Baleia, Gatos, Macacos que seriam as classes filhos"
				+ "\nClasse Pai tem as caracter�sticas e m�todos comuns a todas as classes filhos.");
	}
	
	public void encapsulamento() {
		System.out.println("\n---ENCAPSULAMENTO---"
				+ "\nProtege os dados: public, protected, private"
				+ "\nComunica��o de atributos e m�todos em uma classe, deixando vis�vel apenas o necess�rio"
				+ "\npara a comunica��o entre objetos."
				+ "\nPermite Ocultar a complexidade do c�digo."
				+ "\nN�o � preciso saber o funcionamento interno da calsse para poder utilizar seus m�todos.");
		
	}
	
	public void polimorfismo () {
		System.out.println("\n---POLIMORFISMO---"
				+ "\nMultiplas formas."
				+ "\nUm opera��o de um objeto pode assumir mais um comportamento dependendo"
				+ "\nda chamada recebida, tratando e desenvolvendo respostas distintas"
				+ "\nAcontece quando umn objeto tem um comportamento diferente para uma mesma situa��o"
				+ "\nExemplo: Na Classe Gato e Macaco h� um comportamento em comum: Andar."
				+ "\nEntretanto, cada uma dessas classes implementa o m�todo de maneira distintas."
				+ "\nGatos e Humanos andam de maneira distintas (de quatro ou duas patas");
	}
	
}



