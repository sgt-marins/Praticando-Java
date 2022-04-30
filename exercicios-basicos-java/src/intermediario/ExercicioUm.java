package intermediario;

import java.util.Scanner;

//Write a Java program to find the number of days in a month

public class ExercicioUm {

	public static void main(String[] args) {

		String nomeDoMes = "";
		int numeroDeDias = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número do mês (entre 1 e 12): ");
		int mes = entrada.nextInt();

		if (mes > 12 || mes < 1) {
			while (mes > 12 || mes < 1) {
				System.out.println("Mês inválido. Tente novamente!!");
				mes = entrada.nextInt();
			}
		} else {
			switch (mes) {
			case 1:
				nomeDoMes = "Janeiro";
				numeroDeDias = 31;
				break;
			case 2:
				nomeDoMes = "Fevereiro";
				numeroDeDias = 28;
				break;
			case 3:
				nomeDoMes = "Março";
				numeroDeDias = 31;
				break;
			case 4:
				nomeDoMes = "Abril";
				numeroDeDias = 30;
				break;
			case 5:
				nomeDoMes = "Maio";
				numeroDeDias = 31;
				break;
			case 6:
				nomeDoMes = "Junho";
				numeroDeDias = 30;
				break;
			case 7:
				nomeDoMes = "Julho";
				numeroDeDias = 31;
				break;
			case 8:
				nomeDoMes = "Agosto";
				numeroDeDias = 31;
				break;
			case 9:
				nomeDoMes = "Setembro";
				numeroDeDias = 30;
				break;
			case 10:
				nomeDoMes = "Outubro";
				numeroDeDias = 31;
				break;
			case 11:
				nomeDoMes = "Novembro";
				numeroDeDias = 30;
				break;
			case 12:
				nomeDoMes = "Dezembro";
				numeroDeDias = 31;
				break;

				
			}
		}

		System.out.println("Mês: " + nomeDoMes + "\nQuantidade de dias: " + numeroDeDias);
		entrada.close();
	}

}
