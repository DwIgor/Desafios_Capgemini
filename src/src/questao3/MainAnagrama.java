package src.questao3;
/*
 *  Classe questao3, algoritmo que mostre na tela uma escada de tamanho a quantidade de anagramas de um palavra x
 * 
 */


public class MainAnagrama {
	 public static void main(String[] args) {
		     /**
			 * Comando de repeticao que verifica a quantidade de anagramas que a palavra fornecida pelo usuario gera 
			 * 
			 * @brief -> deve explicacao de funcao 	
			 */
	        String str = "ovo"; 
	        
	        int size = str.length(); 
	        Anag a = new Anag(); 
	        StringUt b = new StringUt();
	        a.anagm(str, 0, size - 1);
	               
	        b.compararSubstring(b.geradorNSubstring(str));
	
		}
	}
