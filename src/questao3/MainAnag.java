package questao3;

import java.util.Scanner;

/*
 * @brief mostra o numero de anagramas possiveis nas substrings
 * 
 * */
public class MainAnag {
	public static void main(String[] args) {
		System.out.print("digite uma palavra: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		Anag c = new Anag();
		System.out.println(c.compSubstring(c.geradorNSubstring(str)));
		input.close();
	}
}
