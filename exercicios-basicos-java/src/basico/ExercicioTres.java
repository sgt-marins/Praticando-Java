package basico;

import java.util.Scanner;

//Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu
//antecessor e seu sucessor.

public class ExercicioTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");

		int numero = entrada.nextInt();

		int variavel = 1;

		int antecessor = numero - variavel;
		int sucessor = numero + variavel;

		System.out.println("O sucessor de " + numero + " �: " + sucessor + " e o antecessor �: " + antecessor);

		entrada.close();
	}

}
