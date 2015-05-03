package Lab.S04.Sobrecarga_String;

public class Ejercicio1401 {
	
	
	public static void main(String[] args) {
	
		
		/* A la pulsación del botón Procesar declare, cree e inicialice un
		objeto de tipo String con un dato fijo. Visualice luego a través de un método listado
		la cadena ingresada, longitud, primer y último carácter.
		 */
		String s = "Java es lo mejor";
		try{
		System.out.println(s);
		System.out.println
		("Longitud " +  s.length());
		System.out.println
		("Primer caracter " + s.charAt(0));
		System.out.println
		("Ultimo caracter " + s.charAt(s.lastIndexOf("r")));
		
		System.out.println
		("Ultimo caracter " + s.charAt(s.length()-1 ));
		}
		catch(Exception ex){
			System.out.println("" + ex.getMessage());
		}
	}
}
