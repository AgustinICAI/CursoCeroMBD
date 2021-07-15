public class Profesor extends Trabajador
{
	private String asignatura;
	private double precioHora;

	public Profesor(String nombre, String numSS)
	{
		super(nombre, numSS);
	}

	public String getAsignatura()
	{
		return asignatura;
	}

	public double precioHora()
	{
		return precioHora;
	}
	public void setAsignatura(String asignatura)
	{
		this.asignatura = asignatura;
	}
	public void setPrecioHora(double precioHora)
	{
		this.precioHora = precioHora;
	}

	public double cobrarNomina()
	{
		return 1500d;
	}
	
}