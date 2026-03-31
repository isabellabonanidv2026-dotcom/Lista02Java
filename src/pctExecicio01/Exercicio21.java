package pctExecicio01;


	import java.util.Scanner;

	public class Exercicio21 {

		public static void main(String[] args) {
			Scanner receba = new Scanner(System.in);
			int num;

			System.out.println("Informe sua idade");
			num = receba.nextInt();

			if (num >= 18) {
				System.out.println("você é maior de idade,pode ter carteira de motorista");
				
				System.out.println("Informe sua  idade novamente");
				num = receba.nextInt();
			
			}  if (num <= 70 ) {
				System.out.println("você ainda ´pode ter a carteira de motorista");
			} else if (num>=64) {
				System.out.println("você não pode ter a carteira de motorista ");
			}
		}
	}