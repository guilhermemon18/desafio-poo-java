package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}


	
	
}
