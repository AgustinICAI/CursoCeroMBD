class Persona{
	//Atributos
	String nombre;
	String apellido1;
	String dni;
	String tematicaFavorita;
	int edad;
	Pelicula [] peliculaReservada;	
	
	//Constructor
	Persona(String _nombre, String _apellido1, String _dni, String _tematicaFavorita, int _edad)
	{
		nombre = _nombre;
		apellido1 = _apellido1;
		dni = _dni;
		tematicaFavorita = _tematicaFavorita;
		edad = _edad;
		peliculaReservada = new Pelicula[5];
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
		if(edad >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	String getInfo()
	{
		String info = "Nombre:" + nombre + " Apellido1:" + apellido1 + " edad:" + edad + " dni:" + dni + " Peliculas que le gustan:" + tematicaFavorita;
		String peliculasReservadas = "";
		//for (int i = 0 ; i < this.peliculaReservada.length; i ++)
		// peliculasReservadas = peliculasReservadas + peliculaReservada[i].getNombre() + ", ";
		
		for (Pelicula p : peliculaReservada)
			if (p != null)
				peliculasReservadas = peliculasReservadas + p.getNombre() + ", ";
		
		return info + "y las peliculas reservadas: " + peliculasReservadas;
	}
	Pelicula[] getPeliculasReservadas()
	{
		return this.peliculaReservada;
	}
	
	boolean addPeliculaReservada(Pelicula pelicula)
	{
		
		int i = 0;
		while (i < this.peliculaReservada.length)
		{
			if (peliculaReservada[i] == null)
			{
				peliculaReservada[i] = pelicula;
				i = this.peliculaReservada.length;
			}
			else
				i = i + 1;
		}
		if (i < peliculaReservada.length)
			return true;
		else
			return false;
		
		
		
		/*
		int i = 0;
		while (i < this.peliculaReservada.length && this.peliculaReservada[i] != null)
			i = i + 1;
		if (i < peliculaReservada.length)
		{
			peliculaReservada[i] = pelicula;
			return true;
		}
		else return false;
		*/
		
		
		
	}
	
	void devuelvePelicula(Pelicula p)
	{
		int i = 0;
		boolean peliculaEncontrada = false;
		while (i < this.peliculaReservada.length && peliculaEncontrada == false)
		{
			if(peliculaReservada[i] != null && peliculaReservada[i].getNombre().equals(p.getNombre()))
			{
				peliculaReservada[i] = null;
				//i = peliculaReservada.length;
				peliculaEncontrada = true;
			}
			i = i + 1;
		}

		
		
		
		/*
		int i = 0;
		while (i < this.peliculaReservada.length && peliculaReservada[i] != null && peliculaReservada[i].getNombre() != p.getNombre())
			i = i + 1;
		if (i < peliculaReservada.length)
			peliculaReservada[i] = null;
		*/
	}
	
	boolean tienePeliculaReservada()
	{
		/*
		int i = 0;
		boolean peliculaEncontrada = false;
		while(i < peliculaReservada.length)
			if(peliculaReservada[i] !=	null)
				peliculaEncontrada = true;
			
		return peliculaEncontrada;
		*/
		/*
		int i = 0;
		boolean peliculaEncontrada = false;
		while(i < peliculaReservada.length && peliculaEncontrada == false)
			if(peliculaReservada[i] !=	null)
				peliculaEncontrada = true;
			
		return peliculaEncontrada;
		*/
		int i = 0;
		while(i < peliculaReservada.length)
		{
			if(peliculaReservada[i] !=	null)
				return true;
			i = i + 1;
		}
		return false;
		
		
	}
	
	

}