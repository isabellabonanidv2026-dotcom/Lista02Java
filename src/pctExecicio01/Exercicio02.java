package pctExecicio01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

		int num;
		System.out.println("Informe o número que você quiser");
		num = receba.nextInt();

		if (num == 0) {
			System.out.println("Seu número é igual a 20...");
			
		} else {
			System.out.println("Seu número é maior que 0...");
		}
	}
}


