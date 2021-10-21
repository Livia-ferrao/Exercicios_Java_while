package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe14 {
	/*
	 * 23) Faça um programa que leia um LITERAL em forma de data. Exemplo:
	 * “26/09/95” e escrever ao final o dia, mês e ano desta data todos em mensagens
	 * separadas.
	 */

	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String data = JOptionPane.showInputDialog("Digite uma data (DD/MM/AA): ");
			String[] splitted = data.split("/");
			String dia = splitted[0];
			String mes = splitted[1];
			String ano = splitted[2];

			JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
			
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
		}
	}
}
