package basico;

import java.util.Scanner;

//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//antecessor e seu sucessor.

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");

		int numero = entrada.nextInt();

		int variavel = 1;

		int antecessor = numero - variavel;
		int sucessor = numero + variavel;

		System.out.println("O sucessor de " + numero + " é: " + sucessor + " e o antecessor é: " + antecessor);

		entrada.close();
	}

}
