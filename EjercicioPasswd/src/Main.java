import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el tamanio del array: ");
		Scanner sc = new Scanner(System.in);
		Integer dim = sc.nextInt();
		Password[] arr = new Password[dim];
		System.out.println("Introduzca la longitud de la contrasenia: ");
		Integer longitud = sc.nextInt();
		for(int i=0; i<dim; i++) {
			arr[i] = new Password(longitud);
		}
		
		Password[] arr_clon = new Password[dim];
		for(int i=0; i<dim; i++) {
			arr_clon[i] = new Password(arr[i]);
		}
		
		String aux = "";
        for (int i = 0; i < dim; i++) {
            for (int j = 1; j < dim; j++) {
                if(arr_clon[j].getContrasenia().toUpperCase().charAt(0) < arr_clon[j-1].getContrasenia().toUpperCase().charAt(0)){
                    aux = arr_clon[j].getContrasenia();
                    arr_clon[j].setContrasenia(arr_clon[j-1].getContrasenia());
                    arr_clon[j-1].setContrasenia(aux);
                }
            }
        }

        
        System.out.println("Se muestra el contenido: ");
        for(int i=0; i<dim; i++) {
			System.out.println(arr_clon[i].toString());
		}
        
        Boolean[] esFuerte = new Boolean[dim];
        for(int i=0; i<dim; i++) {
			esFuerte[i] = arr[i].esFuente();
		}
		
        System.out.println("Se muestra la contrasenia y si es fuerte: ");
        for(int i=0; i<dim; i++) {
			System.out.println("Contrasenia: " + arr[i].toString() + " es fuerte: " + esFuerte[i]);
		}
	}

}
