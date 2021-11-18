package br.ifc.exercicio_agregacao_composicao.carro_motor_pessoa;

public class Carro {
	private String fabricante;
	private String modelo;
	private String cor;
	protected Pessoa dono;
	protected Motor motor;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
}
