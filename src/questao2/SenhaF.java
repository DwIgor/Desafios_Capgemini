package questao2;

public class SenhaF{

	/*
	 * @brief verifica quantos caracteres estao faltando
	 * 
	 * @param recebe a senha a ser contada
	 * 
	 * @return in numero de cacteres faltantes
	 */
	public int FaltaNCarac(String senha) {
		if (senha.length() <= 6)
			return 6 - senha.length();
		return 0;
	}
	public int VerifParametrosDaS(String senha) {
		char sChar[] = senha.toCharArray();
		boolean temLetraMaiuscula = false, temLetraMinuscula = false, temCaracteresEspeciais = false,
				TemDigitos = false;
		int caracteresF = 0;

		/*
		 * @brief verifica se não preencheu algum requisito dos parametros
		 * 
		 * @param recebe a senha a ser revificada
		 * 
		 * @return retona o numero de requisitos caractes que faltam para preencher os
		 * resquisitos
		 */
		for (int i = 0; i < senha.length(); i++) {
			if ((sChar[i] >= 48 && sChar[i] <= 57) && TemDigitos == false) {
				TemDigitos = true;
			}
			if ((sChar[i] >= 65 && sChar[i] <= 90) && temLetraMaiuscula == false) {
				temLetraMaiuscula = true;
			}
			if ((sChar[i] >= 97 && sChar[i] <= 122) && temLetraMinuscula == false) {
				temLetraMinuscula = true;
			}
			if ((sChar[i] >= 33 && sChar[i] <= 47)
					|| (sChar[i] >= 58 && sChar[i] <= 64) && temCaracteresEspeciais == false) {
				temCaracteresEspeciais = true;
			}
		}
		if (senha.length() < 6) {
			caracteresF = FaltaNCarac(senha);
		} else {
			if (!temLetraMaiuscula) {
				caracteresF++;
			}
			if (!temLetraMinuscula) {
				caracteresF++;
			}
			if (!temCaracteresEspeciais) {
				caracteresF++;
			}
			if (!TemDigitos) {
				caracteresF++;
			}
		}
		return caracteresF;

	}
}