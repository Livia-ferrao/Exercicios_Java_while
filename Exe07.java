package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe07 {
	/*
	 * Fa�a um algoritmo onde o usu�rio dever� digitar uma s�rie de n�meros inteiros
	 * maiores que zero, usando cart�o bandeira
	 */
	public static void main(String[] args) {
		int num = 1;
		String nums = "";
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero ( 0 - para): "));
			nums += num + " - ";
		}
		
		JOptionPane.showMessageDialog(null, "N�meros digitados: " + nums);
	}
}
