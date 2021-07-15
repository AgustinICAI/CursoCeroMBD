class App3
{
	//Trabajando con vectores
	public static void main(String argv[])
	{
		Persona p1 = new Persona("Juan","40231");

		p1.addPeliculaReservada(new Pelicula("The gentlemen"));
		p1.addPeliculaReservada(new Pelicula("Tenet"));
		p1.addPeliculaReservada(new Pelicula("Origin",2010,98));
		p1.devuelvePelicula(new Pelicula("Origin"));
		System.out.println(p1);




	}
}