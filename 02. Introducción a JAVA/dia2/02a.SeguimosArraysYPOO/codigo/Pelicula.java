public class Pelicula{
	private String nombre;
	private double puntuacion;

	public Pelicula(String nombre, double puntuacion)
	{
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre()
	{
		return nombre;
	}
	public double getPuntuacion()
	{
		return puntuacion;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setPuntuacion(double puntuacion)
	{
		this.puntuacion = puntuacion;
	}
	public String getInfo()
	{
		return this.nombre + ";" + this.puntuacion;
	}

}