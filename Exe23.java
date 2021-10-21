package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe23 {
	/*
	 * Faça um algoritmo/programa que leia uma sequência de caracteres qualquer
	 * informada pelo usuário, faça um algoritmo/programa que retire qualquer
	 * ocorrência do caracter espaço em branco.
	 */
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String fraseNova = frase.replace(" ", "");
		JOptionPane.showMessageDialog(null, fraseNova);

	}
}
