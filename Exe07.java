package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe07 {
	/*
	 * Faça um algoritmo onde o usuário deverá digitar uma série de números inteiros
	 * maiores que zero, usando cartão bandeira
	 */
	public static void main(String[] args) {
		int num = 1;
		String nums = "";
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ( 0 - para): "));
			nums += num + " - ";
		}
		
		JOptionPane.showMessageDialog(null, "Números digitados: " + nums);
	}
}
