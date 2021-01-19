package entidades;

public class Metodos {

	private String titulo = "Conceitos de programação orientada a objetos\n";

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
		System.out.println("2 - Mais fácil de dar manutenção no software");
		System.out.println("3 - Tem muito reuso de código, o que deixa o desenvolvimento mais rápido");
		System.out.println("4 - Objetos podem ser utilizados em aplições diferentes");
		System.out.println("5 - Objetos podem ser reatilizados em aplicações diferentes");
		System.out.println(
				"6 - Ao invés de operar apenas com tipos de dados primitivos, podemos construtir novos tipo de dados");
		System.out.println("7 - Encalsulamento: Não é necessário conhecer a implemtentação interna de um objeto para poder utilizá-lo");
		System.out.println("8 - Encapsulamento, Herança, Polimorfismo");

	}

	public void abstracao() {

		System.out.println(
				"\n---ABSTRAÇÃO---" + "\nIsolar os objetos que queremos representar do ambiente complexo que se situam,"
						+ "\ne nesses obejtos podemos representar somente as caracterísitcas"
						+ "\nque são relevantes para o problema em questão");

	}

	public void mensagens() {
		System.out.println("\n---MENSAGENS---" + "\nOs objetos se comunicam por mensagens."
				+ "\nMensagem é um sinal enviado de um objeto a outro, solicitando um serviço,"
				+ "\nusando uma operação programa no objeto chamado."
				+ "\nObjetos precisam ter um associação para poder trocar mensagens."
				+ "\nQuando um mensagem é recebida, uma operação é INVOCADA no objeto chamado."
				+ "\nExistem vários formatos de mensagens: procedures (functions), passagens de sinas entre threads,"
				+ "\nacionamento de eventos.");

	}

	public String classe() {

		return "\n---CLASSES---"
				+ "\nUma classe representa um conceito e classifica objetos que tenham propriedades similares."
				+ "\nSão os Blocos de construção mais importantes em OO."
				+ "\nSão uma coleção de objetos descritos com o s mesmos atritutos e métodos."
				+ "\nSão uma espéficie de MOLDE para criação de objetos."
				+ "\nconjunto de Classes ==  Namespace"
				+ "\nDeclarar classes sempre com Letra Inicial Maiúscula."
				+ "\nClasses podem ser representados em diagramas UML ";
	}
	
	public String objeto() {
		return "\n---OBJETO---"
				+ "\nÉ uma instância de classe. Ou seja, uma ocorrência espefífica de uma classe."
				+ "\nÉ a instância da classe na memória da máquina em tempo de execução."
				+ "\nUm objeto é uma construção de software que encapsula estado e comportamento."
				+ "\nUma única Classe pode gerar vários objetos com valores diferentes."				
				+ "\nRepresenta entidades de um mundo real. Como pessoas, conta correntes, motos, carros, figuras geométricas, etc."
				+ "\nPossui atributos (características próprias) e métodos (executa ações, funções)."
				+ "\nAtributos e métodos vem da classe que originou o objeto."
				+ "\nExemplo: Classe seria a planta de uma casa e o Objeto e casa física construída em si.";
	}
	
	public String atributos() {
		return "\n---ATRIBUTOS---"
				+ "\nCaracterística particular de uma ocorrência de classe"
				+ "\nExistem 2 tipos: estáticos (data de nascimento) e dinâmicos (Peso).";
				
	}
	
	public void metodos() {
		System.out.println("\n---MÉTODO---"
				+ "\nSimilar a funções e procedimentos"
				+ "\nLógica contida em uma classe para atribuir comportamentos."
				+ "\nAto de INVOCAR (chamar) um método é a passagem de mensagens para o objeto."
				+ "\nUm método deve apenas uma única funcionalidade. Objeto pode realizar ou sofrer ações pela métodos."
				+ "\nExemplo: Classe Carro tem o método ligar, desligar, trocar marcha...");
		
	}
	
	public void heranca() {
		
		System.out.println("\n---HERANÇA---"
				+ "\nRelacionamento entre Classes, onde uma classe 'herda' os membros (atributos e métodos) de outra classe."
				+ "\nServe para criar classes mais complexas sem repetição de código."
				+ "\nExemplo: conta corrente e conta poupança herdam os métodos e atributos de Classe conta bancária genérica."
				+ "\nExemplo: Mamífero classe pai de Baleia, Gatos, Macacos que seriam as classes filhos"
				+ "\nClasse Pai tem as características e métodos comuns a todas as classes filhos.");
	}
	
	public void encapsulamento() {
		System.out.println("\n---ENCAPSULAMENTO---"
				+ "\nProtege os dados: public, protected, private"
				+ "\nComunicação de atributos e métodos em uma classe, deixando visível apenas o necessário"
				+ "\npara a comunicaçõo entre objetos."
				+ "\nPermite Ocultar a complexidade do código."
				+ "\nNão é preciso saber o funcionamento interno da calsse para poder utilizar seus métodos.");
		
	}
	
	public void polimorfismo () {
		System.out.println("\n---POLIMORFISMO---"
				+ "\nMultiplas formas."
				+ "\nUm operação de um objeto pode assumir mais um comportamento dependendo"
				+ "\nda chamada recebida, tratando e desenvolvendo respostas distintas"
				+ "\nAcontece quando umn objeto tem um comportamento diferente para uma mesma situação"
				+ "\nExemplo: Na Classe Gato e Macaco há um comportamento em comum: Andar."
				+ "\nEntretanto, cada uma dessas classes implementa o método de maneira distintas."
				+ "\nGatos e Humanos andam de maneira distintas (de quatro ou duas patas");
	}
	
}



