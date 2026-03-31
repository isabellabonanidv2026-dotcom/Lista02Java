package pctExecicio01;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num1;
int num2;
		System.out.println("Informe sua nota");
		num1 = receba.nextInt();

		System.out.println("Informe sua frequencia ");
		num2 = receba.nextInt();
		
		if (num1 >= 6) {
			System.out.println("você foi aprovado");
		}else if( num1 <= 5) {
			System.out.println("você foi reprovado");
		
		}  if (num2 >= 75 ) {
			System.out.println("Um aluno de exelencia");
		} else if (num2 <=74) {
			System.out.println("você não foi aprovado por conta da sua frequencia ");
		}
	}
}