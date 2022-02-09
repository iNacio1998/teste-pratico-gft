
public class Main {

	public static void main(String[] args) throws RuntimeException {
		
		int vetor1[] = {10, 5, 98, 452};
		int vetor2[] = {548, 213, 10};
		int vetor3[] = {5, 21, 12};
		int vetor4[] = {50, 60, 70};
		int vetor5[] = {60, 70};
		int vetor6[] = {1, 2, 3};
		
		
		System.out.println(toString(mulltiplicaArrays(vetor1, vetor1)));
		System.out.println(toString(mulltiplicaArrays(vetor2, vetor3)));
		System.out.println(toString(mulltiplicaArrays(vetor4, vetor3)));
		System.out.println(toString(mulltiplicaArrays(vetor5, vetor6)));
	}
	
	public static String toString(int[] vetor) {
		String out = "[";
		for	(int i = 0; i < vetor.length; i++) {
			out += vetor[i] + ", ";
		}
		return out += "]";
	}
	
	public static int[] mulltiplicaArrays(int arr[], int arr2[]) throws RuntimeException {
		int out[] = new int[arr.length];
		if(arr.length == arr2.length) {
		
			for(int i = 0; i < arr.length; i++) {
				out[i] = arr[i] * arr2[i];
			}
		}else {
			throw new RuntimeException("O tamanhos dos arrays devem ser iguais");
		}
		return out;
		
	}

}
