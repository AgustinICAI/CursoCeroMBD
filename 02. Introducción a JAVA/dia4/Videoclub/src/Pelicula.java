import java.util.Objects;

class Pelicula
{
	private String nombre;
	private int ano;
	private int duracion;
	
	Pelicula (String nombre, int ano, int duracion)
	{
		this.nombre = nombre;
		this.ano = ano;
		this.duracion = duracion;		
	}
	Pelicula (String nombre)
	{
		this.nombre = nombre;	
	}
	
	String getNombre()
	{
		return this.nombre;
	}
	
	int getAno ()
	{
		return this.ano;
	}
	
	int getDuracion ()
	{
		return this.duracion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pelicula pelicula = (Pelicula) o;
		return Objects.equals(nombre, pelicula.getNombre());
	}
	/*
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}*/

	@Override
	public String toString() {
		return "Pelicula{" +
				"nombre='" + nombre + '\'' +
				", ano=" + ano +
				", duracion=" + duracion +
				'}';
	}
}