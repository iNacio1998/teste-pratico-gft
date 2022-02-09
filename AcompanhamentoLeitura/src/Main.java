
public class Main {

	public static void main(String[] args) {
		
		Livro livroFavorito = new Livro("Como treinar o seu dragão", 300, 100);
		Leitor leitor = new Leitor("Inacio Ribeiro", livroFavorito);
		
		Livro livroJava = new Livro("Algoritimos Cormem", 100, 70);
		
		leitor.adicionarLivro(livroJava);
		
		System.out.println(leitor.toString());
		
		System.out.println(livroFavorito.verificarProgresso());
		

	}

}
