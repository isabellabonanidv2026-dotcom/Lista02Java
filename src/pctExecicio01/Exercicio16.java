package pctExecicio01;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;

		System.out.println("Informe seu numero");
		num = receba.nextInt();

		if (num >= 0) {
			System.out.println("Numero positivo");
		} else if (num>=50) {
			num = receba.nextInt();
			System.out.println("Seu numero é maior que 50");
			
		} else  {
			System.out.println("Seu numero é menor que 50");
		}
	}
}