package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe17 {
	/*
	 * Fa�a um algoritmo onde o usu�rio dever� digitar uma frase qualquer. Ap�s a
	 * leitura, mostre na tela a quantidade de caracteres �espa�o em branco�
	 * existente na frase.
	 */
	public static void main(String[] args) {
		int contarEspacos = 0;
		char continua = 'S';
		while (continua == 'S') {
			String frase = JOptionPane.showInputDialog("Digite uma frase: ");


			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (c == ' ') {
					contarEspacos++;
				}
			}

			JOptionPane.showMessageDialog(null, "N�mero de espa�os: " + contarEspacos);
			contarEspacos = 0;

			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
