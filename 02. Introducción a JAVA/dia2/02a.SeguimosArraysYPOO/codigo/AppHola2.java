public class AppHola2 {
	
	public static void main (String argv[])
	{
		Pelicula p1 = new Pelicula("El Jocker",8.1d);
		Pelicula p2 = new Pelicula("1917",7d);

		String paisPredeterminado = Persona.PAIS;
		Persona.setMAYORIAEDAD(18);
		Persona.PAIS = "Francia";

		Persona persona = new Persona("Jaime",18);
		persona.addPelicula(p1);
		persona.addPelicula(p2);


		for(Pelicula p : persona.getPeliculas())
			if(p != null)
				System.out.println(p.getInfo());

		System.out.println(persona.getInfo());

	}


}