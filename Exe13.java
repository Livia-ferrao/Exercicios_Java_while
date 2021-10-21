package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe13 {
	/*
	 * Em um banco existem (N) caixas. Cada caixa atende uma quantidade indefinida
	 * de clientes (utilize cartão bandeira). Cada cliente faz apenas uma única
	 * operação: depósitos(D), ou retiradas(R). Faça um algoritmo para ler: nome do
	 * cliente, tipo da operação (D/R) e valor da operação, onde esta leitura deve
	 * ser feita para cada um dos clientes de cada um dos (N) caixas. Ao final,
	 * mostrar na tela o total geral de depósitos e retiradas ocorridos.
	 */
	public static void main(String[] args) {
		float total = 0;
		float depositos = 0;
		float retiradas = 0;
		String total1 = "";
		int i = 0;
		float tot = 0;
		int filas = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas tem? "));
		while (i <= filas) {
			int clientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes tem na fila " + i + "? "));
			for (int j = 1; j <= clientes; j++) {
				String nome = JOptionPane.showInputDialog("Qual o nome do cliente " + j + "? ");
				char operacao = JOptionPane
						.showInputDialog(nome + ", qual operação deseja fazer? Retirada(R) ou Depósito(D)? ")
						.toUpperCase().charAt(0);
				if (operacao == 'D') {
					float deposito = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do depósito? "));
					depositos += deposito;
					total += deposito;
				} else if (operacao == 'R') {
					float retirada = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da retirada? "));
					total -= retirada;
					retiradas += retirada;
				} else {
					JOptionPane.showMessageDialog(null, "Operação inválida. Digite novamente");
					j--;
				}
			}
			total1 += "Fila" + i + "\nTotal: " + total + "\n Retiradas: " + retiradas + "\n Depósitos: " + depositos
					+ "\n\n";
			depositos = 0;
			retiradas = 0;
			tot += total;
			total = 0;

		}

		JOptionPane.showMessageDialog(null, total1 + "\n\n Total: " + tot);
	}
}
