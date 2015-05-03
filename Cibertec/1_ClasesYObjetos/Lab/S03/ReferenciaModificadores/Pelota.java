/**
 * 
 */
package Lab.S03.ReferenciaModificadores;

/**
 * @author MARC
 *
 */
public class Pelota {
	private String marca;
	private double peso, presionLibras, diametroCM, precio;
	private static int cantidadPelota;
	private static double importePagar;
	private final double pi = 3.1416;

	// Region Constructor miembros estaticos (miembros de clase)
	static{
		cantidadPelota = 0;
		importePagar = 0;
	}
	
    // EndRegion
	public Pelota(String marca, double peso, double presionLibras,
				 double diametroCM, double precio) {
		
		this.marca = marca;
		this.peso = peso;
		this.presionLibras = presionLibras;
		this.diametroCM = diametroCM;
		this.precio = precio;
		cantidadPelota++;
		importePagar += getimportePago();
	}
	public int getCantidadPelota(){
		return cantidadPelota;
	}
	
	public double getTotalPago(){
		return importePagar;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPresionLibras(double presionLibras){
		this.presionLibras = presionLibras;
	}
	
	public double getPresionLibras(){
		return presionLibras;
	}
	
	public void setDiametro(double diametroCM){
		this.diametroCM = diametroCM;
	}
	
	public double getDiametro(){
		return diametroCM;
	}
	
	public void setPrecio(double precio){
		this.precio = precio;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public double calculaRadio(){
		return getDiametro() / 2;
	}
	
	public double calculaVolumen(){
		return pi * calculaRadio() * calculaRadio();
	}
	
	public double calculaDescuento(){
		return 0.1 * getPrecio();
	}
	
	public double getimportePago(){
		return getPrecio() - calculaDescuento();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pelota p1 = new Pelota("Vinifan", 2, 3, 10, 15.5);
		Pelota p2 = new Pelota("Artesco",3,4,50,10.0);
		Pelota p3 = new Pelota("Cochinada", 10, 5, 3.5, 14.5);
		mostrarDatos(p1);
		mostrarDatos(p2);
		mostrarDatos(p3);
	}
	
	static void mostrarDatos(Pelota objPelota){
		System.out.println("Marca : " + objPelota.getMarca());
		System.out.println("Peso en Gramos : " + objPelota.getPeso());
		System.out.println("Presión en Libras : " + objPelota.getPresionLibras());
		System.out.println("Diámetro en Centimetros " + objPelota.getDiametro());
		System.out.println("Precio : " + objPelota.getPrecio());
		System.out.println("Cantidad de Objetos Creados : " + objPelota.getCantidadPelota());
		System.out.println("Pago Total : " + objPelota.getTotalPago());
		System.out.println("===============================================================");
		System.out.println("Importe cada uno : " + objPelota.getimportePago());
		System.out.println("===============================================================");
	}
}
