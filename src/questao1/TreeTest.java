package questao1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TreeTest {

	@Test
	@DisplayName("retornaQuatroCaracteresImpressos")
	void retornaQuatroCaracteresImpressos() {
		Tree arvore = new Tree();
		assertEquals(4, arvore.caracteresImpressos(2));
	}

	@Test
	@DisplayName("retornaVinteCincoCaracteresImpressos")
	void retornaVinteCincoCaracteresImpressos() {
		Tree arvore = new Tree();
		assertEquals(25, arvore.caracteresImpressos(5));
	}

	@Test
	@DisplayName("retornaVinteUmCaracteresImpressos")
	void retornaVinteUmCaracteresImpressos() {
		Tree arvore = new Tree();
		assertEquals(1, arvore.caracteresImpressos(1));
	}

}
