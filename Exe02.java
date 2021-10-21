package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe02 {
	/*
	 * Faça um algoritmo para ler N números inteiros e ao final escrever sua média.
	 * Primeiro, utilize a estrutura de repetição enquanto, depois a estrutura de
	 * repetição repita.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		double soma = 0;
		int qnt = 0;
		double media = 0;
		
		while(continua == 'S') {
			double num = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
			soma += num;
			qnt += 1;		
			//continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
			if (confirm == 0 ) {
				continua = 'S';
			} else {
				continua = 'N';
			}
		}
		
		media = soma/qnt;
		
		//double media = soma/qnt;
		JOptionPane.showMessageDialog(null, "A média dos números é " + media);
	}
}
