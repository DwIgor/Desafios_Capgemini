package src.questao2;

public class SenhaF {

	public int FaltaNCaracter(String senha) {
		if (senha.length() <= 6)
			return 6 - senha.length();
		return 0;
	}

	public int VefificarParametrosDaSenha(String senha) {
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
		}
		else {
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