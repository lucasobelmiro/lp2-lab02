package lab2;

/**
 * Representacao de uma conta em um laboratorio da universidade.
 * Toda conta precisa ter necessariamente o nome do laboratorio e opcionalmente a cota de espaco a ser utilizado.
 * 
 * @author Lucas Oliveira Belmiro - 118210068
 *
 */
public class ContaLaboratorio {
	/**
	 * O nome do laboratorio.
	 */
	private String nome;
	/**
	 * A cota de espaco a ser reservado para o aluno utilizar.
	 */
	private int cota;
	/**
	 * A quantidade de espaco utilizado pelo aluno.
	 */
	private int espacoUtilizado;
	
	/**
	 * Constroi uma conta em um laboratorio a partir do nome do laboratorio.
	 * Toda conta começa por definicao com cota de espaço 2000mb e espaco utilizado zerado.
	 * 
	 * @param nome o nome do laboratorio a ser criada a conta.
	 */
	public ContaLaboratorio(String nome) {
		this.nome = nome;
		this.cota = 2000;
		this.espacoUtilizado = 0;
	}
	
	/**
	 * Constroi uma conta em um laboratorio a partir do nome do laboratorio e a cota de espaco a ser usada.
	 * Toda conta comeca com o espaco utilizado zerado.
	 * 
	 * @param nome o nome do laboratorio a ser criada a conta.
	 * @param cota a cota de espaco a ser utilizada pelo aluno.
	 */
	public ContaLaboratorio(String nome, int cota) {
		this.nome = nome;
		this.cota = cota;
		this.espacoUtilizado = 0;
	}
	
	/**
	 * Metodo que consome espaco da cota reservada a conta de acordo com o valor passado.
	 * 
	 * @param mbytes a quantidade de espaco a ser consumido da conta.
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoUtilizado += mbytes;
	}
	
	/**
	 * Metodo que libera espaco da cota reservada a conta de acordo com o valor passado.
	 * 
	 * @param mbytes a quantidade de espaco a ser liberado da conta.
	 */
	public void liberaEspaco(int mbytes) {
		espacoUtilizado -= mbytes;
	}
	
	/**
	 * Metodo que verifica se o usuario ja atingiu a cota de espaco reservado para sua conta.
	 * 
	 * @return um boolean true caso o espaco utilizado seja igual ou superior a cota e false caso contrario.
	 */
	public boolean atingiuCota() {
		if (espacoUtilizado >= cota) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	/**
	 * Representacao textual de uma conta em um laboratorio.
	 * 
	 * @return uma String com a seguinte formatacao "Nome do Laboratorio Espaco Utilizado/Cota"
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.espacoUtilizado + "/" + this.cota;
	}
	
}
