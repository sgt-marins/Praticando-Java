package basico;

import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%.

public class ExercicioDois {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu saldo: ");

		double saldo = entrada.nextDouble();

		double valorReajuste = saldo * 0.01;

		double saldoReajustado = saldo + valorReajuste;

		System.out.println("Saldo reajustado: " + saldoReajustado);

		entrada.close();

	}

}
