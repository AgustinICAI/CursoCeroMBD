public class AppHola {
	
	public static void main (String argv[])
	{

		Persona p1 = new Persona("David","Perez","Gomez",17);
		System.out.println("El nombre de la persona es " + p1.getNombre() + " y tiene " + p1.getEdad() + " - esMayorEdad: " + p1.isMayorEdad());
		
		System.out.println("Mayor edad: " + ((p1.isMayorEdad())?"Sí":"No") );

		p1.setEdad(18);
		System.out.println("El nombre de la persona es " + p1.getNombre() + " y tiene " + p1.getEdad() + " - esMayorEdad: " + p1.isMayorEdad());

		p1.cumplirAnos();
		System.out.println("El nombre de la persona es " + p1.getNombre() + " y tiene " + p1.getEdad() + " - esMayorEdad: " + p1.isMayorEdad());

	}


}