package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe18 {
	/*
	 * 27) Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer
	 * informada pelo usu�rio, fa�a um algoritmo/programa que mostre no v�deo a
	 * quantidade de vogais existentes.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		int contarVogais = 0;
		
		while (continua == 'S') {
			String frase = JOptionPane.showInputDialog("Digite uma frase: ").toUpperCase();


			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					contarVogais++;
				}
			}

			JOptionPane.showMessageDialog(null, "N�mero de vogais: " + contarVogais);
			contarVogais = 0;

			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
