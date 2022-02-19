package src.questao3;

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
//				System.out.println("palavra adc: " + palavra.substring(i, j));
//				System.out.println("valor de i: " + i + " valor de j: " + j);
			}
		}
		return listaDesubstring;
	}

	public void compararSubstring(List<List<String>> listaDesubstring) {

		int QtdSaoAnagrama = 0;
		List<String> lAnagramasRptd = new ArrayList<>();
		List<String> lAnagramasRptdEmOrdem = new ArrayList<>();
		for (int i = 0; i < listaDesubstring.size(); i++) {
//			System.out.println(listaDesubstring.get(i));
			for (int j = 0; j < listaDesubstring.get(i).size(); j++) {
//				System.out.println(listaDesubstring.get(i).get(j));

				char[] chars = listaDesubstring.get(i).get(j).toCharArray();
				Arrays.sort(chars);
				String sorted = new String(chars);
				lAnagramasRptdEmOrdem.add(sorted);
			}
		}
//		System.out.println(listaAnagramasRepetidoEmOrdem);
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
////		System.out.println("to aqui");
//		for (int i = 0; i < listaAnagramasRepetido.size(); i++) {
//			for (int j = i; j < listaAnagramasRepetido.size(); j++) {
//				if (listaAnagramasRepetido.get(i) == (listaAnagramasRepetido.get(j))) {
//					
//					contador++;
//					break;
//				}
//			}
//		}
//		System.out.println(contador);


//	public boolean compararAnagrama(String a, String b) {
//
//		int contador = 0;
//		int lenString = a.length();
//
//		if (a.length() != b.length()) {
//			return false;
//		} else {
//			for (int i = 0; i < lenString; i++) {
//				for (int j = 0; j < lenString; j++) {
//
//					if (a.toCharArray()[i] == b.toCharArray()[j]) {
//						contador++;
//					}
//				}
//			}
//		}
//		if (contador == lenString) {
//			return true;
//		}
//		return false;
//	}
//}
