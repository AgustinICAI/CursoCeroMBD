class Persona{
	//Atributos
	String nombre;
	String apellido1;
	String dni;
	String tematicaFavorita;
	int edad;
	//Constructor
	Persona(String _nombre, String _apellido1, String _dni, String _tematicaFavorita, int _edad)
	{
		nombre = _nombre;
		apellido1 = _apellido1;
		dni = _dni;
		tematicaFavorita = _tematicaFavorita;
		edad = _edad;		
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
		return info;
	}

}