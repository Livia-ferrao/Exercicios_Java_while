package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe24 {
	/*
	 * Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer
	 * informada pelo usu�rio, fa�a um algoritmo/programa que troque qualquer
	 * ocorr�ncia do caracter espa�o em branco por um ponto (.).
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String fraseNova = frase.replace(" ", ".");
		JOptionPane.showMessageDialog(null, fraseNova);
	}
}
