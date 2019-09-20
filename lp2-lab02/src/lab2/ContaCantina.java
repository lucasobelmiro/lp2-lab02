package lab2;
/**
 * Representacao de uma conta em uma cantina.
 * 
 * @author Lucas Oliveira Belmiro - 118210068
 *
 */
public class ContaCantina {
	/**
	 * O nome da cantina.
	 */
	private String nomeDaCantina;
	/**
	 * O numero de intens consumidos pelo aluno.
	 */
	private int contaLanches;
	/**
	 * O valor total consumido pelo aluno.
	 */
	private int valorCompras;
	/**
	 * O valor devido pelo aluno.
	 */
	private int faltaPagar;
	
	/**
	 * Constroi uma conta em uma cantina a partir do nome da cantina.
	 * 
	 * @param nomeDaCantina o nome da cantina a ser criada a conta.
	 */
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.contaLanches = 0;
		this.valorCompras = 0;
		this.faltaPagar = 0;
	}
	
	/**
	 * Cadastra a quantidade de itens consumidos e o valor do lanche em centavos na conta do aluno.
	 * 
	 * @param qtdItens a quantidade de itens consumidos.
	 * @param valorCentavos o valor em centavos do lanche.
	 */
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.contaLanches += qtdItens;
		this.valorCompras += valorCentavos;
		this.faltaPagar += valorCentavos;
	}
	
	/**
	 * Metodo que paga a conta na cantina, o valor a ser pago nao pode ser maior que o devido
	 * sempre igual ou menor ao valor total.
	 * 
	 * @param valorCentavos o valor a ser pago em centavos.
	 */
	public void pagaConta(int valorCentavos) {
		if(valorCentavos <= this.faltaPagar) {
			this.faltaPagar = this.faltaPagar - valorCentavos;
		}
	}
	
	/**
	 * Metodo que retorna o valor ainda devido na conta da cantina.
	 * 
	 * @return um inteiro com o valor em centavos ainda devido.
	 */
	public int getFaltaPagar() {
		return this.faltaPagar;
	}
	
	/**
	 * A representacao textual de uma conta em uma cantina.
	 * 
	 * @return uma String com a formatacao "Nome da Cantina Quantidade de itens consumidos Valor total gasto".
	 */
	@Override
	public String toString() {
		return this.nomeDaCantina + " " + this.contaLanches + " " + this.valorCompras;
	}
}
