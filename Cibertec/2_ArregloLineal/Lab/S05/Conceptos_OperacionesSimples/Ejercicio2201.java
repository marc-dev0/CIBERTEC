package Lab.S05.Conceptos_OperacionesSimples;

public class Ejercicio2201 {

	private static int[] n = new int[5];
	private static int indice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*adicionar(20);
		adicionar(25);
		adicionar(15);
		cambiar();
		for(int i=0;i<n.length;i++){
			System.out.println("Indice [" + i + "]" + "=" + n[i]);
		}
		System.out.println("cantidad: " + getCantidad());
		System.out.println("Último número: " + ultimoNumero());
		System.out.println("Suma de números : " + sumaNumeros());
		System.out.println("Promedio : " + promedio());*/
		calcula();
		for(int i=0;i<n.length;i++){
			System.out.println("Indice [" + i + "]" + "=" + n[i]);
		}
	}
	//Region da
	
	private static void adicionar(int i) {
		if(indice < n.length){
			n[indice] = i;
			indice++;
		}
	}

	//EndRegion
	public static void adicionarAleatorio(int num){
		for(indice = 0; indice<n.length; indice++)
			if (indice< n.length)
				n[indice] = numeroAleatorio(99, 1);
	}
	
	public static int getCantidad(){
		return indice;
		
	}
	/***
	 * Retorna el último número del arreglo
	 * @return 
	 */
	public static int ultimoNumero(){
		return n[indice-1];
		
	}
	
	public static int numeroAleatorio(int max, int min){
		return (int)((max - min +1 )* Math.random())+min; 		
	}
	
	public static int sumaNumeros(){
		int suma = 0;
		for(int i = 0; i<indice;i++)
			suma += n[i];
		return suma;
	}
	
	public static double promedio(){
		return sumaNumeros()*1.0/getCantidad();
	}
	
	public static void cambiar(){
		int pos1 = 0,pos2 = 0, aux;
		//20,25,15
		aux = n[0];
		n[0] = n[1];
		n[1] = aux;
		
	}
	
	
	public static void calcula(){
		generar();
		int u=0,d=0,c=0,suma=0,num=0;
		for (int i = 0; i < n.length; i++) {
			num = n[i];
			u = (num%10);
			d = (num/10)%10;
			c = (num/10)/10;
			suma = u + d + c;
			if(suma == 8)
			{
				System.out.println("El numero es: " + num);
			}
		}
			
	}
	
	public static void logicaProblema(){
		int u=0,d=0,c=0,suma=0,num=0;
		num = (int)((999-100+1)*Math.random())+100;
		
		u = (num%10);
		d = (num/10)%10;
		c = (num/10)/10;
		suma = u + d + c;
		if(suma == 8)
		{
			System.out.println("El numero es: " + num);
		}
		System.out.println("Número:" + num);
		System.out.println("Centena:" + c);
		System.out.println("Decena:" + d);
		System.out.println("Unidad:" + u);
	
	}
	
	public static void generar(){
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)((999-100+1)*Math.random()) + 100;
		}
	}
}
