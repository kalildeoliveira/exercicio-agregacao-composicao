package br.ifc.exercicio_agregacao_composicao.conta_avancada_video;

public class CartaoDeCredito {
	private int numero;
	private String operadora;
	private double limite;
	private String tipoDeCartao;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getTipoDeCartao() {
		return tipoDeCartao;
	}

	public void setTipoDeCartao(String tipoDeCartao) {
		this.tipoDeCartao = tipoDeCartao;
	}
	
}
