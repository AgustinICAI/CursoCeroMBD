class App
{
	//Este es el método que coge el terminal para ejecutar
	public static void main(String argv[])
	{
		/*
		Persona persona1 = new Persona("Juan","Lopez", "23414211B", "western", 23);
		Pelicula pelicula = new Pelicula("Tenet");
		persona1.alquilaPelicula(pelicula);

		Persona persona2 = new Persona("Pepe","Lopez", "23414211B", "western", 23);
		persona2.alquilaPelicula(pelicula);
		
		System.out.println(persona1.getPeliculaReservada().getNombre());
		System.out.println(persona2.getPeliculaReservada().getNombre());
		
		if(persona1.getPeliculaReservada() == persona2.getPeliculaReservada())
			System.out.println("Las dos peliculas son iguales");
		*/
		
		Persona persona1 = new Persona("Juan","Lopez", "23414211B", "western", 23);
		persona1.addPeliculaReservada(new Pelicula("Peli1"));
		persona1.addPeliculaReservada(new Pelicula("Peli2"));
		persona1.addPeliculaReservada(new Pelicula("Peli3"));
		persona1.addPeliculaReservada(new Pelicula("Peli4"));
		//persona1.addPeliculaReservada(new Pelicula("Peli5"));
		
		/*for (Pelicula p : persona1.getPeliculasReservadas())
			if (p!=null)
				System.out.println(p.getNombre());*/
			
		System.out.println(persona1.getInfo());
		
		System.out.println(persona1.tienePeliculaReservada());
		
		persona1.devuelvePelicula(new Pelicula("Peli2"));
		System.out.println(persona1.getInfo());

		

	}
}