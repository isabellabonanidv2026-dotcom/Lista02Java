package pctExecicio01;
	import java.util.Scanner;

	public class Exercicio12 {

		public static void main(String[] args) {
			Scanner receba = new Scanner(System.in);
			int num;

			System.out.println("Informe sua idade");
			num = receba.nextInt();

			if (num <= 12) {
				System.out.println("Oii criança");
			} else if (num >= 13 && num <= 17) {
				System.out.println("Eai adolecente");
			} else {
				System.out.println("Como anda a vida adulta?");
			}
		}
	}
