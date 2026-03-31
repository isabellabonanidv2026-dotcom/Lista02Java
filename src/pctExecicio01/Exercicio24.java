package pctExecicio01;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;
		int idade;
		System.out.println("Informe a sua idade");
		idade = receba.nextInt();

		if (idade <= 20 || idade <= 10) {
			System.out.println("Pode usar atendimento prioritário");
		} else {
			System.out.println("Não pode usar atendimento prioritário");
		}
	}
}
