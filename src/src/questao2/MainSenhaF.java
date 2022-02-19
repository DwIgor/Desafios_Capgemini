package src.questao2;

import java.util.Scanner;

public class MainSenhaF {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		SenhaF senhaF = new SenhaF();
		
		String senha = input.nextLine();
		System.out.println(senhaF.VefificarParametrosDaSenha(senha));
		input.close();
	}
}
