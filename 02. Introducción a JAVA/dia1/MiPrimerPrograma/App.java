class App
{
	//Este es el método que coge el terminal para ejecutar
	public static void main(String argv[])
	{
		Persona persona1 = new Persona("Juan","Lopez", "23414211B", "western", 23);
		String nombre1 = persona1.getNombre();
		System.out.println(nombre1 + " " + persona1.getApellido1());
		
		Persona persona2 = new Persona("Pepe","Perez", "23418711B", "drama", 17);
		
		System.out.println(persona1.getInfo());
		System.out.println(persona2.getInfo());
		
		int num1 = 123;
		nombre1 = "Juanito";
		String nombre2 = "Pepito";
		boolean flag = false;
		double dec1 = 12313.4242;
		
		String nombreCompleto = persona1.getNombre() + " " + persona1.getApellido1();

		System.out.println(num1);
		System.out.println(nombreCompleto);
		System.out.println(flag);
		System.out.println(dec1);
		
		System.out.println(persona1.getInfo());
		persona1.setNombre("Juana");
		System.out.println(persona1.getInfo());
	
		int edadAComparar = 18;
		if (persona2.getEdad() >= 21)
			System.out.println("Es mayor como en estados EEUU");
		else if (persona2.getEdad() > edadAComparar)
			System.out.println("La persona " + persona2.getNombre() + " es mayor de " + edadAComparar + " años");
		else
		{
			int edadRestante = edadAComparar - persona2.getEdad();
			System.out.println("La persona " + persona2.getNombre() + " le quedan " + edadRestante);
			if (persona2.getNombre().equals("Pepe"))
				System.out.println("Es menor de edad pero se llama Pepe");
		}

	}
}