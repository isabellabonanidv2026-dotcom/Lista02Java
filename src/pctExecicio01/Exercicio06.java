package pctExecicio01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
        double num;
		
		System.out.println("informe o numero");
		num = receba.nextInt();

		if (num % 2 ==0) {
		
			System.out.println("O seu numero é par");
		} else {
			System.out.println("O seu numero é impar");
			
		}
	}
}

	