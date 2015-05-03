package Lab.S04.Sobrecarga_String;

public class Ejercicio1402 {

	public static void main(String[] args) {
	/* A la pulsación del botón Procesar declare, cree e inicialice cuatro
	objetos de tipo String con datos fijos. Visualice luego una comparación entre
	cadenas para determinar cuál es mayor o menor alfabéticamente.
	*/	
		String s1 = "Miguel";
		String s2 = "Miguel Angel";
		String s3 = "Miguel Angel Rojas";
		String s4 = "Miguel Angel Rojas Coraje";
		int [] n = {1,2,3,4,5,6};
	
				
				
		if(s1.compareToIgnoreCase(s2) > 0 && s1.compareTo(s3)>0 && s1.compareToIgnoreCase(s4)> 0)
		System.out.println(s1 + " Es mayor alfabeticamente que todos");
		else if(s2.compareToIgnoreCase(s1)> 0 && s2.compareToIgnoreCase(s3)> 0 && s2.compareToIgnoreCase(s4)> 0)
			System.out.println(s2 + " Es mayor alfabeticamente que todos");
		else if(s3.compareToIgnoreCase(s1)> 0 && s3.compareToIgnoreCase(s2)> 0 && s3.compareToIgnoreCase(s4)>0)
			System.out.println(s3 + " Es mayor");
		else
			System.out.println(s4 + " Es mayor");
		
	}

}
