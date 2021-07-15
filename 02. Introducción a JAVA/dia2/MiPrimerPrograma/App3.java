class App3
{
	//Trabajando con vectores
	public static void main(String argv[])
	{
		int entero[] = new int[10];
		entero[5] = 1231241;
		
		System.out.println(entero);
		System.out.println("Posicion 5 -> " + entero[5]);
		
		System.out.println("El tamaño del vector es: " + entero.length);
		
		for (int i = 0; i < entero.length; i ++ )
		{
			System.out.println("Posicion " + i + " -> " + entero[i]);
		}
		
		Persona persona[] = new Persona[10];
		
		for (int i = 0 ; i < persona.length; i++)
			persona[i] = new Persona("Juan","Lopez", "23414211B", "western", i);

		for (int i = 0; i < persona.length; i ++)
		{
			System.out.println("Posicion " + i + " -> " + persona[i].getInfo());
		}
		
	}
}