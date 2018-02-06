package ufcg.ccc.sistema.basico;

/**
 * Classe filha de Aposta que apresenta alterações por guardar um seguro por taxa quanto a aposta
 * e isso alterará outros métodos da classe. 
 * 
 * @author danielbt
 */
public class ApostaAsseguradaTaxa extends Aposta {
	
	/**
	 * Atributo que guarda a taxa do seguro
	 */
	private double taxaSeguro;
	
	/**
	 * Atributo que guarda o custo do seguro
	 */
	private int custoSeguro;;
	
	/**
	 * Construtor da classe que chama o construtor da classe pai além de inicializar e guardar seus outros
	 * valores
	 * 
	 * @param apostador		Nome do apostador
	 * @param valor			Valor da aposta
	 * @param previsao		Previsão da apostas sobre o cenario
	 * @param valorSeguro	Valor assegurado sobre a aposta
	 * @param custo			Custo sobre o seguro
	 */
	public ApostaAsseguradaTaxa(String apostador, int valor, String previsao, double taxaSeguro, int custo) {
		
		super(apostador, valor, previsao);
		this.custoSeguro = custo;
		this.taxaSeguro = taxaSeguro;
	}
	
	/**
	 * Reescrita do metodo toString que agora tambem mostra o seguro seu tipo e sua taxa
	 */
	@Override
	public String toString() {
		
		return super.toString() + "- ASSEGURADA (TAXA) - R$ " + this.taxaSeguro +"%";
	}
}
}