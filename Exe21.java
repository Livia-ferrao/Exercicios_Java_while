package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe21 {
	/*
	 * Faça um algoritmo que adicione ao final de um literal lido um ponto(.)
	 * caso não haja. Mostre ao final o novo literal.
	 */
	public static void main(String[] args) {
		String novaFrase = "";
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		
			char n = frase.charAt(frase.length()-1);
			if (n != '.') {
				novaFrase = frase + '.';
			} 
			
			JOptionPane.showMessageDialog(null, novaFrase);
	}
}
