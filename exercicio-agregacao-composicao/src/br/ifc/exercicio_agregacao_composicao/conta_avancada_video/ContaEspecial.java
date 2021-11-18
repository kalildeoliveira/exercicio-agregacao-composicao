package br.ifc.exercicio_agregacao_composicao.conta_avancada_video;

public class ContaEspecial extends ContaBancaria {
	private int diasSemJuros;
	private double limite;
	protected CartaoDeCredito cartao;

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [diasSemJuros=" + diasSemJuros + ", limite=" + limite + ", cartao=" + cartao + "]";
	}
}
