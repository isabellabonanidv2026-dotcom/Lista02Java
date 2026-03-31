package pctExecicio01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
int num1;int num2;
		
		System.out.println("Informe os numero");
		num1 = receba.nextInt();
num2 = receba.nextInt();
	if (num1 > num2  ) {
			System.out.println("O numero maior é numero 1");
	} else {
			System.out.println("O numero menor é numero 1");
		}
	}
}