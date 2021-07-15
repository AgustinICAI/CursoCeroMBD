public class AppHola {
	
	public static void main (String argv[])
	{
		System.out.println("Hola clase GITT 2B");
		int num1 = 5;
		int num2 = 10;
		int num3 = num2*num1;

		String s1 = "primera cadena de texto que creo";
		System.out.println(num3);
		System.out.println(s1);

		Persona p1 = new Persona("David","Perez","Gomez",30);
		//Estoy accediendo al primer getter de Persona
		//System.out.println("El nombre de la persona es");

		System.out.println("El nombre de la persona es " + p1.getNombre());
	}


}