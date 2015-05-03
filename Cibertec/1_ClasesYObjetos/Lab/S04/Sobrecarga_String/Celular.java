package Lab.S04.Sobrecarga_String;

public class Celular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Meguel";
		String name2 = "MigueL";
		
		int compara = name.compareTo(name2);
		int longitud = name.length();
		//equals : compara 2 strings, si encuentra semejanza devuelve true
				   //de lo contrario false, tener en cuenta que es sensible a las mayusculas
		boolean equivalente = name.equals(name2);
		boolean equiva = name.equalsIgnoreCase(name2);
		try
		{
			char g = name.charAt(2);
			int index = name.indexOf("gu",0);
			System.out.println(g);
			System.out.println(longitud);
			System.out.println(equivalente);
			System.out.println("" + compara);
			System.out.println("" + equiva);
			System.out.println("Indice= " + index);
		}
		catch(Exception ex){
			System.out.println("" + ex.getMessage());
		}
		
		
		
	}

}
