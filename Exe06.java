package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe06 {
	/*
	 * Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura,
	 * mostre na tela o nome e média do aluno com a maior média. Considere que as
	 * médias sejam todas diferentes entre si. Primeiro, utilize a estrutura de
	 * repetição enquanto, depois a estrutura de repetição repita.
	 */

	public static void main(String[] args) {
		int j =1;
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		float maiorMedia = 0;
		String nomeMaior = "";

		while (j <= qnt) {
			for (int i = 1; i <= qnt; i++) {
				String nome = JOptionPane.showInputDialog("Nome: ");
				float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a média: "));

				if (i == 1) {
					maiorMedia = media;
					nomeMaior = nome;
				} else {
					if (media > maiorMedia) {
						maiorMedia = media;
						nomeMaior = nome;
					}
				}
				j++;
			}
			JOptionPane.showMessageDialog(null, "A maior média é " + maiorMedia + " de " + nomeMaior);
		}

	}
}
