package lab2;

import java.util.Arrays;

/**
 * Representacao de uma Disciplina.
 * @author lucasob
 *
 */
public class Disciplina {
	/**
	 * O nome da disciplina.
	 */
	private String nome;
	/**
	 * A lista de notas do aluno.
	 */
	private double [] notas;
	/**
	 * A quantidade de horas cadastradas dedicadas a discplina.
	 */
	private int horas;
	/**
	 * A media aritmetica das notas do aluno.
	 */
	private double media;
	
	/**
	 * Constroi uma Disciplina a partir de seu nome, sendo iniciada com todas as notas, media e quantidade de horas estudadas zeradas.
	 * 
	 * @param nome o nome da disciplina a ser criada.
	 */
	public Disciplina(String nome) {
		this.nome = nome;
		this.notas = new double [4];
		this.horas = 0;
		this.media = 0;
	}
	
	/**
	 * Metodo que cadastrada o numero de horas dedicadas a disciplina.
	 * 
	 * @param horas um inteiro com a quantidade de horas a serem cadastradas.
	 */
	public void cadastraHoras (int horas) {
		this.horas += horas;
	}
	
	/**
	 * Metodo que cadastra as notas de um aluno.
	 * @param nota qual nota sera cadastrada podendo ser 1, 2, 3 ou 4. Por definicao cada aluno tem 4 notas.
	 * @param valorNota o valor da nota a ser cadastrada em double.
	 */
	public void cadastraNota (int nota, double valorNota) {
		if (nota == 1) {
			this.notas[0] = valorNota;
		}
		if (nota == 2) {
			this.notas[1] = valorNota;
		}
		if (nota == 3) {
			this.notas[2] = valorNota;
		}
		if (nota == 4) {
			this.notas[3] = valorNota;
		}
	}
	
	/**
	 * Metodo acessorio que calcula a media de um aluno.
	 */
	private void calculaMedia() {
		double soma = 0;
		for (double nota : this.notas) {
			soma += nota;
		}
		this.media = soma / 4.0;		
	}
	
	/**
	 * Metodo que verifica se um aluno foi aprovado caso sua media seja maior ou igual a 7.0.
	 * 
	 * @return um boolean True caso a media do aluno seja maior ou igual a 7, significando que o aluno foi aprovado e False caso contrario.
	 */
	public boolean aprovado() {
		this.calculaMedia();
		if (this.media >= 7.0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Representacao textual de uma disciplina.
	 * 
	 * @return uma String com a seguinte formatacao "Nome da disciplina Horas cadastradas Media [Nota1, Nota2, Nota3, Nota4]".
	 */
	@Override
	public String toString() {
		this.calculaMedia();
		return this.nome + " " + this.horas + " " + this.media + " " + Arrays.toString(this.notas);
	}
}
