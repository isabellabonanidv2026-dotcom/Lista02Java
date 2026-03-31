package pctExecicio01;

	import java.util.Scanner;
	public class Exercicio14 {
	
		public static void main(String[] args) {
			Scanner receba = new Scanner(System.in);
			int num;

			System.out.println("Informe o numero");
			num = receba.nextInt();

			if (num <=-1) {
				System.out.println("Negativo");
			} else if (num = 0) {
				System.out.println("Zero");
		} else if (num>=1) {
				System.out.println("Positivo");
			}
		}
	}