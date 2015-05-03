package Lab.S05.Conceptos_OperacionesSimples;

public class ProblemaDiego {
	private static int [] n = new int[10];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generar();
		muestraDatos();
	}
	
	/***
	 * Primero creamos el metodo para generar los numeros aleatorios de 3 cifras para el arreglo
	 */
	public static void generar(){
		for (int i = 0; i < n.length; i++) {
			n[i] = aleatorio();
		}
	}
	
	public static void muestraDatos(){
		/*4 variables para almacenar la centena, decena, unidad y la suma de estos
		y una variable para almacenar el numero que tiene cada elemento del arreglo
		aunque lo podrias hacer directo desde el n[i],pero lo separo para que sea
		más comprensible*/
		int c=0,d=0,u=0,suma1=0,suma2=0,num=0;
		for (int i = 0; i < n.length; i++) {
			num = n[i];
			/*
			 * Basicamente la idea es coger para cada vuelta del for el elemento y
			 * hacerle la descomposición de sus digitos, sumarlos y verificar si es igual a 8
			 * hasta que encuentre coincidencia, para finalmente mostrar la data.
			 */
			//1ra opción
			u = (num%10);
			d = (num/10)%10;
			c = (num/10)/10;
			suma1 = u + d + c;
			if(suma1 == 8)
				System.out.println("El elemento que la suma de sus digitos es igual a 8 es : " +
										n[i]);
			//2da opción
			suma2 = (num%10)+ ((num/10)%10) + ((num/10)/10);
			if(suma2 == 8)
				System.out.println("El elemento que la suma de sus digitos es igual a 8 es : " +
										n[i]);
			
			
		}
		for (int j = 0; j < n.length; j++) {
			System.out.println("Elemento n[" + j + "]" + "=" + n[j]);
			
		}
	}
	
	public static int aleatorio(){
		return (int) ((999-100+1)*Math.random())+100;
	}
}
