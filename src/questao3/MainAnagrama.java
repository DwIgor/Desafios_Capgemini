package questao3;

import java.util.Scanner;

/*
 * @brief mostra o numero de anagramas possiveis nas substrings
 * 
 * */
public class MainAnagrama {
	public static void main(String[] args) {
		System.out.print("digite uma palavra: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		Anagrama c = new Anagrama();
		System.out.println(c.compararSubstring(c.geradorNSubstring(str)));
		input.close();
	}
}
