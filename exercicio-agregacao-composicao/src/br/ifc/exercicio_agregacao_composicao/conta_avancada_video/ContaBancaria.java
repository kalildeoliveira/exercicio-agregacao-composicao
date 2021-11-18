package br.ifc.exercicio_agregacao_composicao.conta_avancada_video;

public class ContaBancaria {
	protected Banco banco;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	protected Pessoa correntista;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	/*
	 * METODOS DA CLASSE 
	 */
	public boolean depositar (double valor) {
		return true;
	}
	public boolean saque (double valor) {
		return true;
	}
	@Override
	public String toString() {
		return "ContaBancaria [banco=" + banco + ", agencia=" + agencia + ", numeroDaConta=" + numeroDaConta
				+ ", saldo=" + saldo + ", correntista=" + correntista + "]";
	}
	
	
	
}
