package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe23 {
	/*
	 * Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer
	 * informada pelo usu�rio, fa�a um algoritmo/programa que retire qualquer
	 * ocorr�ncia do caracter espa�o em branco.
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String fraseNova = frase.replace(" ", "");
		JOptionPane.showMessageDialog(null, fraseNova);

	}
}
