public class Estudiante extends Persona
{
	private String claveAcceso;

	public Estudiante(String nombre, String claveAcceso)
	{
		super(nombre);
		this.claveAcceso = claveAcceso;
	}

	public String getInfo()
	{
		return super.getInfo() + DELIMITADOR + claveAcceso;
	}



}