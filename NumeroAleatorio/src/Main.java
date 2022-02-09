import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroInserido;
		int numeroSorteado = (int) (Math.random() * 10);
		
		do {
			System.out.println("Insira um numero entre 0 e 10");
			numeroInserido = sc.nextInt();
			if(numeroInserido != numeroSorteado) {
				System.out.println("Numero errado, mais sorte na proxima");
			}else {
				System.out.println("Acertou");
			}
		}while(numeroInserido != numeroSorteado);

	}

}
