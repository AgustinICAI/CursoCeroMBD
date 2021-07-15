class Pelicula
{
	String nombre;
	int ano;
	int duracion;
	
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
	

}