package src.questao3;

import java.util.ArrayList;

public class Anag {

	private ArrayList<String> listaDeAnagramas = new ArrayList<String>();

	void anagm(String str, int start, int end) {
		if (start == end) {
//			System.out.println(str);
			setListaDeAnagramas(str);
		} else {

			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				anagm(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public ArrayList<String> getListaDeAnagramas() {
		return listaDeAnagramas;
	}

	public void setListaDeAnagramas(String listaDeAnagramas) {
		this.listaDeAnagramas.add(listaDeAnagramas);
	}

	public void compararAnagrama() {
		
		
	}

}