public abstract class Trabajador extends Persona
{
	private String numSS;

	public Trabajador(String nombre, String numSS)
	{
		super(nombre);
		this.numSS = numSS;
	}
	public Trabajador(String nombre, String apellido1, String apellido2, int edad, String numSS)
	{
		super(nombre, apellido1, apellido2, edad);
		this.numSS = numSS;
	}

	public String toString()
	{
		return super.toString() + DELIMITADOR + numSS;
	}

	public abstract double cobrarNomina();

}