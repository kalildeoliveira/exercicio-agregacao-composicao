package br.ifc.exercicio_agregacao_composicao.computador;

public class PlacaMae {
	private String marca;
	private String modelo;
	protected Processador processador;
	protected HD hd;
	protected Memoria memoria; 

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "PlacaMae [marca=" + marca + ", modelo=" + modelo + ", processador=" + processador + ", hd=" + hd
				+ ", memoria=" + memoria + "]";
	}
}
