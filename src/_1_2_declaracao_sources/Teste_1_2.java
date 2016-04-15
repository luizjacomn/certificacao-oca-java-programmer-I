//comentário antes da declaração package
package _1_2_declaracao_sources;

//comentário entre a declaração package e import
import java.util.Date;

/*package _1_2_declaracao_sources;
 * a delaração package deve vir antes de qualquer coisa, exceto comentários
*/
//comentário entre a declaração import e a declaração da classe

/* O nome da classe pública deve ser o mesmo nome do arquivo fonte */
public class Teste_1_2 {
	/**
	 * Comentário javadoc dentro da classe 
	 * @param args
	 */
	public static void main(String[] args) {
		Livro.main(args);
	}
}

/*public class Livro {}
 * Apenas uma classe pode ser pública em um arquivo
 * Erro de compilação
*/
class Livro {
	public static void main(String[] args) {
		System.out.println("Teste");
		System.out.println(new Date());
		
	}
}

/* Comentário ao final da classe */