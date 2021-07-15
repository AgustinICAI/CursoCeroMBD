public class Persona{
	
	static int MAYOREDAD = 18;
	static String PAIS = "Espa�a";

	private String nombre;
	private String apellido2;
	private String apellido1;
	private int edad;
	private Pelicula[] peliculas;


	public Persona()
	{
		this("Fulano","","",MAYOREDAD);
	}

	public Persona (String nombre, String apellido1, String apellido2, int edad )
	{
		this.setNombre(nombre);
		this.apellido1 = apellido1;
		this.apellido2 = apellido2; 
		this.setEdad(edad);
		peliculas = new Pelicula[10];	
	}
	public Persona (String nombre)
	{
		this(nombre,"","",MAYOREDAD);
	}
	public Persona (String nombre, int edad)
	{
		this(nombre,"","",edad);
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
    {
    	this.nombre=nombre;
  	}

	public int getEdad ()
	{
	    return edad;
	}

	public void setEdad(int edad)
	{
	     this.edad=edad;
	}
 

	public void addPelicula(Pelicula p)
	{
		boolean huecoEncontrado = false;

	    for (int i = 0; i < peliculas.length && huecoEncontrado == false; i++)
	        if (peliculas[i] == null) {
	            this.peliculas[i]=p;
	            huecoEncontrado = true;
	        }
	}

	public void setPeliculas(Pelicula[] peliculas)
	{
		this.peliculas = peliculas;
	}
	public Pelicula[] getPeliculas()
	{
		return this.peliculas;
	}

    public void cumplirAnos(){
	    edad = edad+1;
	}

	public int cumplirAnosYDevuelveEdad(){
	    edad = edad+1;
	    return edad;
	}

	public boolean isMayorEdad()
	{
		return edad >= MAYOREDAD;
		/*Podr�amos haber realizado una implementaci�n m�s compleja de este estilo
		boolean mayorEdad = false;
		if(edad >= MAYOREDAD)
			mayorEdad = true;
		return mayorEdad;
		*/
	}

	public String getInfo()
	{
		return this.getInfo(",");
		//La l�gica del programa principal, tiene que estar en el programa principal, no en el objeto.
		//System.out.println(s1);
	}


	public String getInfo(String delimitador)
	{
		double puntuacionMedia = 0;
		int countPeliculas = 0;

		for(Pelicula p : peliculas)
			if (p != null)
			{
				puntuacionMedia = puntuacionMedia + p.getPuntuacion();
				countPeliculas = countPeliculas + 1;
			}
			
		puntuacionMedia = puntuacionMedia/countPeliculas;
		return this.getNombre() + delimitador + this.getEdad() + delimitador + this.isMayorEdad() + delimitador + puntuacionMedia + delimitador + ((isMayorEdad()?"ES MAYOR DE EDAD":"NO ES MAYOR DE EDAD") + delimitador + PAIS);
		//La l�gica del programa principal, tiene que estar en el programa principal, no en el objeto.
		//System.out.println(s1);
	}

	//static int MAYOREDAD = 18;
	public static void setMAYORIAEDAD(int MAYORIAEDAD)
	{
		MAYOREDAD = MAYORIAEDAD;
	}

}