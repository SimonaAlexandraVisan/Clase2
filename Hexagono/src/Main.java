import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca la primera dimensi�n:");
		Scanner sc = new Scanner(System.in);
		Integer dim1 = sc.nextInt();
		System.out.println("Introdizca la segunda dimensi�n:");
		Integer dim2 = sc.nextInt();
		if(!((dim1 % 2) == 0) && ((dim2 % 2) == 0)) {
			System.out.println("Los dos n�meros deben ser pares o impares");
		}
		if(!((dim1 % 2) == 1) && ((dim2 % 2) == 1)) {
			System.out.println("Los dos n�meros deben ser pares o impares");
		}
		
		Clase c = new Clase(dim1, dim2);
		c.impimirRombo();
		
	}

}
