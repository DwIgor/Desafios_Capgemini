package src.questao1;

/*
 *  Classe questao1, algoritmo que mostre na tela uma escada de tamanho n
 * 
 */
import java.util.Scanner;

public class MTree {
	
	public static void main(String[] args) {
		
		/**
		 * Comando de repeticao que gera a quantidade de degraus seguindo o que o usuario digitar
		 * 
		 * 
		 * @brief -> deve explicacao de funcao 	
		 */
		Scanner input = new Scanner(System.in);
		Tree arvore = new Tree();
		int number = input.nextInt();
		
		arvore.ImprimeArvore(number);
		input.close();
	}
}
