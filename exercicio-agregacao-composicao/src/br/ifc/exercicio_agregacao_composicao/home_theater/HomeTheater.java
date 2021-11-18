package br.ifc.exercicio_agregacao_composicao.home_theater;

public class HomeTheater extends SistemaDeVideo {
	protected SistemaDeSom som;
	protected SistemaDeVideo video;
	
	@Override
	public String toString() {
		return "HomeTheater [som=" + som + ", video=" + video + "]";
	}
}
