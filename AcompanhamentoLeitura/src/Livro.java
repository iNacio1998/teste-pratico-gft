import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Livro {

	DecimalFormat df = new DecimalFormat("##.#");
	
	
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, int qtdPaginas, int paginasLidas) {
		super();
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
		this.paginasLidas = paginasLidas;
	}

	public double verificarProgresso() {
		double progresso;
		progresso = (double) (100 / paginasLidas ) * qtdPaginas ;
		System.out.println(progresso);
		return progresso;
	}
	
	public int adicionarPaginasLidas(int quantidade) {
		this.paginasLidas += quantidade;
		return this.paginasLidas;
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}


	@Override
	public String toString() {
		return "\nTitulo: " + this.titulo 
				+ "\nQuantidade de paginas: " + this.qtdPaginas
				+ "\nPaginas lidas: " + this.paginasLidas
				+ "\nProgresso atual: " + verificarProgresso() + "%\n";
	}
	
	
	
	
}
