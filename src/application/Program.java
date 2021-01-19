package application;

import java.util.Scanner;

import entidades.Metodos;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String [] pilares = {"Encapsulamento","Herança","Poliformismo"};
		
		// Metodos abstracao = new Metodos();
		Metodos metodos = new Metodos();
		Metodos titulo = new Metodos();
		
		System.out.println(titulo.getTitulo().toUpperCase());
		System.out.println("Os 3 pilares da Programação orientada a objetos são citados abaixo:");		
		for (int i=0 ; i<pilares.length ; i++) {
			System.out.println((i+1)+"-"+pilares[i]);		
			
			
		}
		
		Program.estatico();
		Metodos.vantagens();
		metodos.abstracao();
		metodos.mensagens();
		System.out.println(metodos.classe());
		System.out.println(metodos.objeto());
		System.out.println(metodos.atributos());
		metodos.metodos();
		metodos.heranca();
		metodos.encapsulamento();
		metodos.polimorfismo();
		metodos.comportamento();
		metodos.estado();
		

		/*
		System.out.println("\nInforme um novo título: ");
		String novoTitulo = scanner.nextLine();
		// instanciando objeto com argumentos (tem que ter um construtor com argumentos
		// na classe métodos)
		Metodos newTitulo = new Metodos(novoTitulo);
		newTitulo.setTitulo(novoTitulo);
		System.out.println("Novo título em minúsculo: " + newTitulo.getTitulo().toLowerCase());
		*/
		scanner.close();
	}

	public static String estatico() {

		return "\nUm médoto declarado como estático é possivel ser chamado sem estancioar um objeto";

	}

}
