package Lab.S05.Conceptos_OperacionesSimples;

public class Ejercicio2101_Arreglo {

	private static int [] n = {25,27,22,24,29,20,23};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Suma : " + calculaSuma());
		System.out.println("Promedio : " + calculaPromedio());
		generar();
		for(int i=0; i<getLongitud();i++){
			System.out.println("Elemento n[" + i + "]" + getValor(i));
		}
	}
	
	public Ejercicio2101_Arreglo(){
		
	}
	
	public static int getLongitud(){
		return n.length;
	}
	
	/***
	 * Devuelve el valor de la posición que envies en el 
	 * parámetro
	 * @param posicion
	 * @return valor de la posición
	 */
	public static int getValor(int posicion){
		return n[posicion];
	}
	
	public static int calculaSuma(){
		int suma = 0;
		for(int i = 0; i<getLongitud(); i++)
			suma += n[i];
		return suma;
	}
	
	public static double calculaPromedio(){
		return calculaSuma()* 1.0 / getLongitud()* 1.0;
	}
	
	public static void generar(){
		
		for(int i=0; i<getLongitud(); i++){
			n[i] = aleatorio(999, 100);
		}
	}
	
	public static int aleatorio(int max, int min){
		return (int) ((max - min +1 )* Math.random()) + min;
	}
}
