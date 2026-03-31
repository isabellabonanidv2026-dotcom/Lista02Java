package pctExecicio01;


import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
int num;
		
		System.out.println("Informe sua nota");
		num = receba.nextInt();

	if (num >=7  ) {
			System.out.println("Parabens não fez nada alem da sua obrigação:)");
		} else {
			System.out.println("Infelizmente você não passou de ano:(");
		}
	}
}

