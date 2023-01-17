import java.util.Random;

public class Password {
	private int longitud;
	private String contrasenia;

	public Password() {
		this.longitud = 8;
		Random rm = new Random();
		this.contrasenia = generarContrasenia();
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		Random rm = new Random();
		this.contrasenia = generarContrasenia();
	}
	
	public Password(Password p) {
		this.contrasenia = p.getContrasenia();
		this.longitud = p.getLongitud();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public boolean esFuente() {
		int cifras = 0;
		int minusculas = 0;
		int mayusculas = 0;
		
		for(int i= 0; i < longitud -1; i++) {
			if(contrasenia.charAt(i)<='z'&&contrasenia.charAt(i)>='a'){
				minusculas++;
            }
            else if(contrasenia.charAt(i)>='A'&&contrasenia.charAt(i)<='Z'){
            	mayusculas++;
            }
            else if(contrasenia.charAt(i)>='0'&&contrasenia.charAt(i)<='9'){
                cifras++;
            }
		}
		
		return ((mayusculas > 2) && (minusculas > 1) && (cifras > 5));
	}
	
	public String generarContrasenia() {
		 String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
		 StringBuilder s = new StringBuilder(longitud);
		 int i;
		 for ( i=0; i<longitud; i++) {
		   int ch = (int)(AlphaNumericStr.length() * Math.random());
		   s.append(AlphaNumericStr.charAt(ch));
		  }
		    return s.toString();
	 }	
	
	@Override
	public String toString() {
		return this.getContrasenia().toString();
	}

	public int compareTo(Object obj) {
		return this.contrasenia.compareTo(((Password)obj).contrasenia);	
	}
}
