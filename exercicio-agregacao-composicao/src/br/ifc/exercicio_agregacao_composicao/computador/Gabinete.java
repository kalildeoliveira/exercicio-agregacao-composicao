package br.ifc.exercicio_agregacao_composicao.computador;

public class Gabinete {
	private String modelo;
	private String tipo;
	private int baias;
	protected PlacaMae placamae;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getBaias() {
		return baias;
	}

	public void setBaias(int baias) {
		this.baias = baias;
	}

	@Override
	public String toString() {
		return "Gabinete [modelo=" + modelo + ", tipo=" + tipo + ", baias=" + baias + ", placamae=" + placamae + "]";
	}
}
