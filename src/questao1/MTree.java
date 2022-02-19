package questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @brief impreme uma escada com n degraus e n arteiscos por degrau
 * 
 * centralizado a direita
 * */
public class MTree {

	public static void main(String[] args) {

		System.out.print("Digite o numero de degraus: ");
		Scanner input = new Scanner(System.in);
		Tree arv = new Tree();
			
		try {
			int number = input.nextInt();
			arv.ImprimeArv(number);
			input.close();
		} catch (InputMismatchException e) {
            System.out.println("Entrada inválida, digite um número inteiro!");
        }

	}
}
