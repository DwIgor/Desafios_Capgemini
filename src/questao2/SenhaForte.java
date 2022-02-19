package questao2;

public class SenhaForte {

	/*
	 * @brief verifica quantos caracteres estao faltando
	 * 
	 * @param recebe a senha a ser contada
	 * 
	 * @return in numero de cacteres faltantes
	 */
	public int FaltaNCaracter(String senha) {
		if (senha.length() <= 6)
			return 6 - senha.length();
		return 0;
	}

	/*
	 * @brief verifica se não preencheu algum requisito
	 * 
	 * @param recebe a senha a ser revificada
	 * 
	 * @return retona o numero de requisitos caractes que faltam para preencher os
	 * resquisitos
	 */
	public int VerificarParametrosDaSenha(String senha) {
		char senhaChar[] = senha.toCharArray();
		boolean temLetraMaiuscula = false, temLetraMinuscula = false, temCaracteresEspeciais = false,
				TemDigitos = false;
		int caracteresFaltantes = 0;

		for (int i = 0; i < senha.length(); i++) {
			if ((senhaChar[i] >= 48 && senhaChar[i] <= 57) && TemDigitos == false) {
				TemDigitos = true;
			}
			if ((senhaChar[i] >= 65 && senhaChar[i] <= 90) && temLetraMaiuscula == false) {
				temLetraMaiuscula = true;
			}
			if ((senhaChar[i] >= 97 && senhaChar[i] <= 122) && temLetraMinuscula == false) {
				temLetraMinuscula = true;
			}
			if ((senhaChar[i] >= 33 && senhaChar[i] <= 47)
					|| (senhaChar[i] >= 58 && senhaChar[i] <= 64) && temCaracteresEspeciais == false) {
				temCaracteresEspeciais = true;
			}
		}

		if (senha.length() < 6) {
			caracteresFaltantes = FaltaNCaracter(senha);
		} else {
			if (!temLetraMaiuscula) {
				caracteresFaltantes++;
			}
			if (!temLetraMinuscula) {
				caracteresFaltantes++;
			}
			if (!temCaracteresEspeciais) {
				caracteresFaltantes++;
			}
			if (!TemDigitos) {
				caracteresFaltantes++;
			}
		}
		return caracteresFaltantes;

	}
}