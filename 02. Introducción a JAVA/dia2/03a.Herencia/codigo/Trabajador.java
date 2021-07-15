public class Trabajador extends Persona
{
	private String numSS;

	public Trabajador(String nombre, String numSS)
	{
		super(nombre);
		this.numSS = numSS;
	}

	public String getInfo()
	{
		return super.getInfo() + DELIMITADOR + numSS;
	}



}