package questao2;

import java.util.Scanner;

/*
 * @brief testa a senha forte
 * */
public class MainSenhaForte {

	public static void main(String[] args) {

		System.out.print("Digite aa senha a ser validada: ");
		Scanner input = new Scanner(System.in);
		SenhaForte senhaForte = new SenhaForte();

		String senha = input.nextLine();
		System.out.println(senhaForte.VerificarParametrosDaSenha(senha));
		input.close();
	}
}
