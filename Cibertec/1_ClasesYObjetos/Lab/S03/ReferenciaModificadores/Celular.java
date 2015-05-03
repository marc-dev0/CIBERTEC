package Lab.S03.ReferenciaModificadores;

import java.awt.List;
import java.io.Console;


public class Celular {
	private int num, segConsumido;
	private String usuario;
	private double precio;
	private static int cuentaCelular = 0;
	private static double totalPago = 0;
	
	public static void main(String[] args) {
		Celular objCelular = new Celular(2, 60, "Miguel", 2.5);
		Celular objCelular1 = new Celular(2, 60, "amy", 2.5);
		Celular objCelular2 = new Celular(2, 60, "robert", 2.5);
		Listado(objCelular);
		Listado(objCelular1);
		Listado(objCelular2);
		
	}

	/***
	 * 
	 * Metodo que muestra en pantalla los datos del Celular
	 */
	private static void Listado(Celular objCelular) {
		
		MuestraConsola("Número", objCelular.getNum());
		MuestraConsola("Usuario", objCelular.getUsuario());
		MuestraConsola("Segundos Consumidos", objCelular.getSegConsumido());
		MuestraConsola("Precio por Segundo", objCelular.getPrecio());
		MuestraConsola("Cantidad de Objetos", objCelular.getCuentaCelular());
		MuestraConsola("Total a Pagar", objCelular.getTotalPago());
	}
	
	static void MuestraConsola(String dato, Object objeto){
		System.out.println("" + dato + "= " + objeto);
	}
	

	public Celular(int num, int segConsumido, String usuario, double precio) {
		this.num = num;
		this.segConsumido = segConsumido;
		this.usuario = usuario;
		this.precio = precio;
		cuentaCelular++;
		totalPago += totalPago();
		
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSegConsumido() {
		return segConsumido;
	}
	public void setSegConsumido(int segConsumido) {
		this.segConsumido = segConsumido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCuentaCelular() {
		return cuentaCelular;
	}
	
	public double getTotalPago() {
		return totalPago;
	}
	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
	
	/***
	 * 
	 * Devuelve el costo del consumo
	 */
	public double costoConsumo(){
		return segConsumido * precio * 1.0;
	}
	
	public double IGV(){
		return 0.18 * costoConsumo();
	}
	
	public double totalPago(){
		return costoConsumo() + IGV();
	}
	
}
