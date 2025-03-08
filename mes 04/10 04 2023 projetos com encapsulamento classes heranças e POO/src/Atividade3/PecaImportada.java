package Atividade3;

public class PecaImportada extends Peca {

	protected double taxaImportacao;
	protected double taxaFrete;
	
	public PecaImportada(String nome, double custo, double lucro, double taxaImportacao, double taxaFrete) {
		super(nome, custo, lucro);
		this.taxaImportacao = taxaImportacao;
		this.taxaFrete = taxaFrete;
	}
	
	public void exibicao() {
		super.exibicao();
		String dados =  "Taxa de frente:     "+ this.getTaxaFrete() + 
					  "\nTaxa de importação: " + this.getTaxaImportacao();
		System.out.println(dados);
	}

	@Override
	public double calcularPreco() {
		return this.getCusto() - this.getLucro() - this.getTaxaFrete() - this.getTaxaImportacao();
	}
	
	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	public double getTaxaFrete() {
		return taxaFrete;
	}

	public void setTaxaFrete(double taxaFrete) {
		this.taxaFrete = taxaFrete;
	}
}
