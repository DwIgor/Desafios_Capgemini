package src.questao1;

public class Tree {

	public void ImprimeArvore(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
