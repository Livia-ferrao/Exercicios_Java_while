package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe09 {
	/*Faça um algoritmo que leia uma relação de N alunos (utilize cartão bandeira), cada um possuindo a
mesma quantidade Q de notas, faça um algoritmo/programa que mostre:
a) Nome e média de cada aluno.
b) Quantidade de alunos aprovados (média para aprovação: >= 7.0).
c) Quantidade de alunos reprovados (média para reprovação: < 2.0).
d) Quantidade de alunos em recuperação.*/
	public static void main(String[] args) {
		char continua = 'S';
		double media = 0;
		int alunosAprovados = 0;
		int alunosReprovados = 0;
		int alunosRecuperacao = 0;
		double soma = 0;
		
		
		while (continua == 'S') {
			String nome = JOptionPane.showInputDialog("Nome do aluno: ");
			int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o aluno fez? "));
			int j =1;
			while(j <= qnt) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Nota" + j +":"));
				soma += nota;
				j++;
			}
			
			media = soma/qnt;

			JOptionPane.showMessageDialog(null, nome + " tem como média: " + media);
			
			if (media >= 7) {
				alunosAprovados++;
			} else if (media < 2.0) {
				alunosReprovados++;
			} else {
				alunosRecuperacao++;
			}
			
			continua = JOptionPane.showInputDialog("Deseja continuar? ").toUpperCase().charAt(0);
			media = 0;
		}
		
		JOptionPane.showMessageDialog(null, "Alunos aprovados: " + alunosAprovados
				+ "\nAlunos Reprovados: " + alunosReprovados 
				+ "\nAlunos em recuperação: " + alunosRecuperacao);
	}
}
