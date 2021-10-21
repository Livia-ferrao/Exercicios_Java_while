package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe19 {
	/*
	 * Faça um algoritmo que leia um literal formado por números, mostre ao final
	 * mostre o somatório dos dígitos. Ex: “1204” → 7.
	 */
	public static void main(String[] args) {
		int soma = 0;
		
		String num = JOptionPane.showInputDialog("Digite um número: ");
		for (int i = 0; i < num.length(); i++) {
			char n = num.charAt(i);
			soma += Character.getNumericValue(n);
		}
		
		JOptionPane.showMessageDialog(null, soma);
		soma = 0;
	}
}
