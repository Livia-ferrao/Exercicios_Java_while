package exercicio_aula4;

import javax.swing.JOptionPane;

public class Exe09 {
	/*Fa�a um algoritmo que leia uma rela��o de N alunos (utilize cart�o bandeira), cada um possuindo a
mesma quantidade Q de notas, fa�a um algoritmo/programa que mostre:
a) Nome e m�dia de cada aluno.
b) Quantidade de alunos aprovados (m�dia para aprova��o: >= 7.0).
c) Quantidade de alunos reprovados (m�dia para reprova��o: < 2.0).
d) Quantidade de alunos em recupera��o.*/
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

			JOptionPane.showMessageDialog(null, nome + " tem como m�dia: " + media);
			
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
				+ "\nAlunos em recupera��o: " + alunosRecuperacao);
	}
}
