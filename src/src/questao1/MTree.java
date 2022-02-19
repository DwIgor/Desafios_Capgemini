package src.questao1;

import java.util.Scanner;

public class MTree {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Tree arvore = new Tree();
		int number = input.nextInt();
		
		arvore.ImprimeArvore(number);
		input.close();
	}
}
