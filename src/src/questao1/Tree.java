package src.questao1;
/*
 *  Classe questao1, algoritmo que mostre na tela uma escada de tamanho n
 * 
 *
 */
public class Tree {

	public void ImprimeArvore(int n) {
		/**
		 * Comando de repeticao que gera a quantidade de degraus
		 * 		 
		 * @param int numberSteps -> número degraus desejados
		 * 
		 * @brief -> deve explicacao de funcao 
		 * 
	     * @return -> tipo do retorno e qual o retorno da funcao	
	  	 */

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0 ; j--) {
				System.out.print(" ");
			}
		
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
		
			System.out.println();
		}
	}
}
