package src.questao2;
/*
 *  Classe questao2, algoritmo que mostre na tela se a senha é forte
 * 
 *
 */
import java.util.Scanner;

public class MainSenhaF {

	public static void main(String[] args) {
		
		/*  Classe MainSenhaF, onde estao contidos os parammetros
		 * 
		 *  e metodos para a realização do exercicio
		 *  
		 *  @brief -> deve explicacao de funcao 	
		 */
		Scanner input = new Scanner(System.in); 
		SenhaF senhaF = new SenhaF();
		
		String senha = input.nextLine();
		System.out.println(senhaF.VefificarParametrosDaSenha(senha));
		input.close();
	}
}
