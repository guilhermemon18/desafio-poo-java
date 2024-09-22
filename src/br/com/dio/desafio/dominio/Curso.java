package br.com.dio.desafio.dominio;

public class Curso {

	private String titulo;
	private String descricao;
	private Float cargaHoraria;
	
	
	public Curso(String titulo, String descricao, Float cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Float getCargaHoraria() {
		return cargaHoraria;
	}

	public void calcularXp() {
		
	}
}
