public class Persona{
	private String nombre;
	private String apellido2;
	private String apellido1;
	private int edad;

	public Persona (String _nombre, String _apellido1, String _apellido2, int _edad )
	{
		nombre = _nombre;
		apellido1 = _apellido1;
		apellido2 = _apellido2; 
		edad = _edad;
	}

	public String getNombre()
	{
		return nombre;
	}



}