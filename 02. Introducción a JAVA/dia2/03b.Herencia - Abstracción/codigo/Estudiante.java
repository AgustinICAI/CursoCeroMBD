public class Estudiante extends Persona
{
	private String claveAcceso;

	public Estudiante(String nombre, String claveAcceso)
	{
		super(nombre);
		this.claveAcceso = claveAcceso;
	}
	public Estudiante(String nombre, String apellido1, String apellido2, int edad, String claveAcceso)
	{
		super(nombre, apellido1, apellido2, edad);
		this.claveAcceso = claveAcceso;
	}

	public String toString()
	{
		return super.toString() + DELIMITADOR + claveAcceso;
	}

}