package br.ifc.exercicio_agregacao_composicao.computador;

public class Computador extends EquipamentoEletronico {
	private String marca;
	private String modelo;
	protected Gabinete gabinete;
	protected Teclado teclado;
	protected Mouse mouse;
	protected Monitor monitor;

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
		return "Computador [marca=" + marca + ", modelo=" + modelo + ", gabinete=" + gabinete + ", teclado=" + teclado
				+ ", mouse=" + mouse + ", monitor=" + monitor + "]";
	}
}
