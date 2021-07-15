public class AppHola {
	
	public static void main (String argv[])
	{

		Persona p1 = new Persona("David","Perez","Gomez",17);

		Persona p0 = null;


		if(p0 == null)
			System.out.println("P0 esta a null");
		System.out.println(p1);

		String s1 = new String("hola");
		String s2 = new String("hola");

		if(s1 == s2)
			System.out.println("S1 y S2 SON IGUALES");
		else
			System.out.println("S1 y S2 SON DISTINTOS");


		if(s1.equals(s2))
			System.out.println("S1 y S2 SON IGUALES");
		else
			System.out.println("S1 y S2 SON DISTINTOS");

		String s3 = s2.toUpperCase();

		System.out.println(s3);

		System.out.println(s2);


		//trim() -> QUITA ESPACIOS
		System.out.println("  con espacios   ".trim());
		//split, sirve para convertir una cadena de texto en un array de Strings

		String [] cads = "hola,que,tal".split(",");
		System.out.println(cads[1]);

		p1.getNombre().toUpperCase();

	}


}