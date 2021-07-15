class App2
{
	public static void main (String argv[])
	{
		String cadena1 = new String("Hola, que tal");
		String cadena2 = new String ("Hola, que tal");
		String cadena3 = cadena1;
		//Comparando si las cadenas son iguales
		if(cadena1 == cadena2)
			System.out.println("Cadena 1 y cadena 2 son iguales");
		else
			System.out.println("Cadena 1 y cadena 2 NO son iguales");
		if(cadena1 == cadena3)
			System.out.println("Cadena 1 y cadena 3 son iguales");
		else
			System.out.println("Cadena 1 y cadena 3 NO son iguales");

		if(cadena1.equals(cadena2))
		{
			System.out.println("El contenido del objeto de cadena 1 y cadena 2 son iguales");
		}

		
		cadena1 = "Nueva cadena";
		if(cadena1 == cadena3)
			System.out.println("Cadena 1 y cadena 3 son iguales");
		else
			System.out.println("Cadena 1 y cadena 3 NO son iguales");
		
		
		int a = 5;
		int b = 5;
		if(a == b)
		{
			System.out.println("a y b son iguales");
		}
		
		
		Persona persona1 = new Persona("Juan","Lopez", "23414211B", "western", 23);
		Persona persona2 = new Persona("Juan","Lopez", "23414211B", "western", 23);
		if(persona1 == persona2)
			System.out.println("Persona 1 y Persona 2 son iguales");
		else
			System.out.println("Persona 1 y Persona 2 NO son iguales");
		
		
	}
	
	
}