package basico;

/* . Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.
*/

public class ExercicioUm {

	public static void main(String[] args) {

		int a1 = 8;
		int b1 = 9;
		int c1 = 7;
		int media1 = (a1 + b1 + c1) / 3;

		int a2 = 4;
		int b2 = 5;
		int c2 = 6;
		int media2 = (a2 + b2 + c2) / 3;

		System.out.println("A soma duas duas medias e " + media1 + media2);

		int mediaGeral = (media1 + media2) / 2;

		System.out.println("A media das medias e " + mediaGeral);

	}

}
