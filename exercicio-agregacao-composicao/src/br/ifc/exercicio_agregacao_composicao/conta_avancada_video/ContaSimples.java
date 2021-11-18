package br.ifc.exercicio_agregacao_composicao.conta_avancada_video;

public class ContaSimples extends ContaBancaria {
	public double saldoPopanca;
	
	/*
	 * MÉTODOS DA CLASSE
	 */
	public boolean depositoPoupanca (double valor) {
		return true;
	}
	public boolean saquePoupanca (double valor) {
		return true;
	}
	
	@Override
	public String toString() {
		return "ContaSimples [saldoPopanca=" + saldoPopanca + "]";
	}	
}
