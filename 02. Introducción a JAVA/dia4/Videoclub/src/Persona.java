import java.lang.reflect.Array;
import java.util.ArrayList;

class Persona{

	//Atributos
	private String nombre;
	private String apellido1;
	private String dni;
	private String tematicaFavorita;
	private int edad;
	ArrayList<Pelicula> peliculaReservada;

	static int MAYOR_EDAD = 18;
	
	//Constructor
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		peliculaReservada = new ArrayList<>();
	}

	public Persona(String nombre, String apellido1, String dni, String tematicaFavorita, int edad)
	{
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.dni = dni;
		this.tematicaFavorita = tematicaFavorita;
		this.edad = edad;
		peliculaReservada = new ArrayList<>();
	}
	//Métodos
	int getEdad()
	{
		return edad;
	}

	String getNombre()
	{
		return nombre;
	}

	String getApellido1()
	{
		return apellido1;
	}


	void setNombre(String _nombre)
	{
		nombre = _nombre;
	}

	boolean esMayorEdad()
	{
		return this.getEdad() >= Persona.MAYOR_EDAD;
	}

	public String toString()
	{
		String info = "Nombre:" + nombre + " Apellido1:" + apellido1 + " edad:" + edad + " dni:" + dni + " Peliculas que le gustan:" + tematicaFavorita;
		String peliculasReservadas = "";
		//for (int i = 0 ; i < this.peliculaReservada.length; i ++)
		// peliculasReservadas = peliculasReservadas + peliculaReservada[i].getNombre() + ", ";
		
		for (Pelicula p : peliculaReservada)
			peliculasReservadas = peliculasReservadas + p.getNombre() + ", ";
		
		return info + "y las peliculas reservadas: " + peliculasReservadas;
	}

	ArrayList<Pelicula> getPeliculasReservadas()
	{
		return this.peliculaReservada;
	}
	
	boolean addPeliculaReservada(Pelicula pelicula)
	{
		return this.peliculaReservada.add(pelicula);
	}
	
	void devuelvePelicula(Pelicula p)
	{
		this.peliculaReservada.remove(p);
	}
	
	boolean tienePeliculaReservada()
	{
		return ! peliculaReservada.isEmpty();

	}
	
	

}