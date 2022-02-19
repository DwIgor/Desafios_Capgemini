package questao2;

import java.util.Scanner;

/*
 * @brief testa a senha digitada pelo usuario
 * 
 * */
public class MSenhaF{

	public static void main(String[] args) {

		System.out.print("Digite aa senha a ser validada: ");
		Scanner input = new Scanner(System.in);
		SenhaF senhaForte = new SenhaF();

		String senha = input.nextLine();
		System.out.println(senhaForte.VerifParametrosDaS(senha));
		input.close();
	}
}
