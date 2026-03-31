package pctExecicio01;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;

		System.out.println("Informe sua idade");
		num = receba.nextInt();

		if (num >= 18) {
			System.out.println("você é maior de idade");
			System.out.println("Informe sua  idade novamente");
			num = receba.nextInt();
		
		}  if (num >= 60 ) {
			System.out.println("você já pode ser considerado um senhor");
		} else if (num<=59) {
			System.out.println("você não é um senhor");
		}
	}
}