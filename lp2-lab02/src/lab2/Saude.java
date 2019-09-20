package lab2;

/**
 * Representacao da saude fisica e mental do aluno.
 * 
 * @author Lucas Oliveira Belmiro - 118210068
 *
 */
public class Saude {
	/**
	 * O status da saude mental do aluno.
	 */
	private String saudeMental;
	/**
	 * O status da saude fisica do aluno.
	 */
	private String saudeFisica;
	
	/**
	 * Constroi a saude do aluno no sistema sem parametros, sendo a saude fisica e mental ambas inicializadas como boas.
	 */
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}
	
	/**
	 * Metodo que altera o status da saude mental do aluno.
	 * 
	 * @param valor o novo valor da saude mental do aluno.
	 */
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	 * Metodo que altera o status da saude fisica do aluno.
	 * 
	 * @param valor o nome valor da saude fisica do aluno.
	 */
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	 * Metodo que compara a saude mental e fisica de um aluno e retorna o seu status.
	 * 
	 * @return uma String com o status da saude geral do aluno, podendo ser fraca, ok ou boa.
	 */
	public String getStatusGeral() {
		if(saudeMental.equals("fraca") && saudeFisica.equals("fraca")) {
			return "fraca";
		}
		else if (saudeMental.equals("boa") && saudeFisica.equals("boa")) {
			return "boa";
		}
		else {
			return "ok";
		}
	}
}
