package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe15 {
	/*
	 * Faça um programa que solicite ao usuário a data do dia na forma DD/MM/AA.
	 * Imprima a data na tela utilizando uma única variável no seguinte formato:
	 * AA/MM/DD.
	 */
	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("Digite uma data(DD/MM/AA): ");
		String[] split = data.split("/");
		String dia = split[0];
		String mes = split[1];
		String ano = split[2];
		
		String junto = ano + "/" + mes + "/" + dia;
		
		JOptionPane.showMessageDialog(null, junto);
	}
}
