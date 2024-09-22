import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Programação orientada a objetos", "Orientação a objetos", 12);
		System.out.println(curso1);
		
		Curso curso2 = new Curso("Curso java", "java 17", 20);
		System.out.println(curso2);
		
		
		Mentoria mentoria1 = new Mentoria("Aprendendo Desenvolvimento com Java", "Java, spring boot etc",
				LocalDate.of(2024, 2, 5));
		System.out.println(mentoria1);
		
	}
}
