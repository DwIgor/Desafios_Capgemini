package src.questao3;

/*
 *  Classe questao3, algoritmo que mostre na tela uma escada de tamanho a quantidade de anagramas de um palavra x
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUt {

	public List<List<String>> geradorNSubstring(String palavra) {

		List<List<String>> listaDesubstring = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			listaDesubstring.add(new ArrayList<String>(i));
			for (int j = i + 1; j < palavra.length() + 1; j++) {
				listaDesubstring.get(i).add(palavra.substring(i, j));
			}
		}
		return listaDesubstring;
	}

	/**
	 * Comando de repeticao que verifica a quantidade de anagramas que a palavra fornecida pelo usuario gera 
	 * 
	 * 		 
	 * @param int numberSteps -> número repeticoes ocorridas
	 * 
	 * 
	 * @brief -> deve explicacao de funcao 
	 * 
	 * 
     *	@return -> tipo do retorno e qual o retorno da funcao	
  	 */
	public void compararSubstring(List<List<String>> listaDesubstring) {

	
		List<String> lAnagramasRptdEmOrdem = new ArrayList<>();
		for (int i = 0; i < listaDesubstring.size(); i++) {

			for (int j = 0; j < listaDesubstring.get(i).size(); j++) {


				char[] chars = listaDesubstring.get(i).get(j).toCharArray();
				Arrays.sort(chars);
				String sorted = new String(chars);
				lAnagramasRptdEmOrdem.add(sorted);
			}
		}

		contarAnagramasRepetidos(lAnagramasRptdEmOrdem);
	}

	public void contarAnagramasRepetidos(List<String> listaAnagramasRepetido) {

		int contador = 0;
		
		System.out.println("contador: " + contador);
		int i = 0;
		while(i < listaAnagramasRepetido.size()) {
			int j = i + 1;
			while(j < listaAnagramasRepetido.size()) {
				if (listaAnagramasRepetido.get(i).equals(listaAnagramasRepetido.get(j))) {
				System.out.println("1: " + listaAnagramasRepetido.get(i) + " 2: " + listaAnagramasRepetido.get(j));
					System.out.println("valor de i:" + i + " valor de j: " + j);
					contador++;
					break;
				}
				j++;
			}
			i++;
		}
		System.out.println("contador: " + contador);
	}
}

