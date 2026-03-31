package pctExecicio01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
int num;
		
		System.out.println("Informe o numero");
		num = receba.nextInt();

	if (num >0  ) {
			System.out.println("seu numero é positivo");
		} else {
			System.out.println("O seu numero é negativo");
		}
	}
}
