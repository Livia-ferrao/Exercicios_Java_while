package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe02 {
	/*
	 * Fa�a um algoritmo para ler N n�meros inteiros e ao final escrever sua m�dia.
	 * Primeiro, utilize a estrutura de repeti��o enquanto, depois a estrutura de
	 * repeti��o repita.
	 */
	public static void main(String[] args) {
		char continua = 'S';
		double soma = 0;
		int qnt = 0;
		double media = 0;
		
		while(continua == 'S') {
			double num = Double.parseDouble(JOptionPane.showInputDialog("N�mero: "));
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
		JOptionPane.showMessageDialog(null, "A m�dia dos n�meros � " + media);
	}
}
