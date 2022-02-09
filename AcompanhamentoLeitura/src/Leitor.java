import java.util.ArrayList;
import java.util.List;

public class Leitor {

	private String nome;
	private Livro livroFavorito;
	private List<Livro> estanteLivros = new ArrayList<Livro>();
	
	public Leitor() {
		
	}

	public Leitor(String nome, Livro livroFavorito) {
		this.nome = nome;
		this.livroFavorito = livroFavorito;
		adicionarLivro(livroFavorito);
	}
	
	public void adicionarLivro(Livro livro) {
		this.estanteLivros.add(livro);
	}
	
	public void removeLivro(Livro livro) {
		livro.setPaginasLidas(0);
		this.estanteLivros.remove(livro);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivroFavorito() {
		return livroFavorito;
	}

	public void setLivroFavorito(Livro livroFavorito) {
		this.livroFavorito = livroFavorito;
	}

	public List<Livro> getEstanteLivros() {
		return estanteLivros;
	}

	public void setEstanteLivros(List<Livro> estanteLivros) {
		this.estanteLivros = estanteLivros;
	}
	
	
	@Override
	public String toString() {
		return "Leitor:" + this.nome
				+ "\nLivro favorito: " + this.livroFavorito
				+ "\nlivros na estante: " + this.estanteLivros.toString();
		
	}

	
}
