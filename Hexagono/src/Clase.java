import java.util.Objects;

public class Clase {
	private int dim1;
	private int dim2;
	
	public Clase(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public void impimirRombo() {
		int min = dim1;
		int max = dim2;
		
		if(dim1 > dim2) {
			min = dim2;
			max = dim2;
		}
		
		int cont = 0, cont2 = 0;
		for (int i=1; i<=((max-min)/2); i++){
			int espacios = ((max - min)/2) - cont2;
			for (int j=espacios; j > 0; j--){
				System.out.print(" ");
				
			}
			cont2++;
			for (int p=1; p <= (min + cont); p++){
				System.out.print("+");
			}
			System.out.println();
			cont = cont + 2;
		}
		for (int i=1; i<=(((max-min)/2)+1); i++){
			int espacios = ((max - min)/2) - cont2;
			for (int j=espacios; j > 0; j--){
				System.out.print(" ");
				
			}
			cont2--;
			for (int p=1; p <= (min + cont); p++){
				System.out.print("+");
			}
			System.out.println();
			cont = cont - 2;
		}
		
		}	
}
