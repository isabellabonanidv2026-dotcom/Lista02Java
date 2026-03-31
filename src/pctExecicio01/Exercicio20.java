package pctExecicio01;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;

		System.out.println("Informe sua idade");
		num = receba.nextInt();

		if (num >= 18) {
			System.out.println("você é maior de idade");
			
			System.out.println("Informe sua  idade novamente");
			num = receba.nextInt();
		
		}  if (num >= 65 ) {
			System.out.println("você já pode se aposentar");
		} else if (num<=64) {
			System.out.println("você não pode se aposentar");
		}
	}
}