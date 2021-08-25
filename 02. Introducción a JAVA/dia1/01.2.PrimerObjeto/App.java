public class App
{
    public static void main (String argv[])
    {
        System.out.println("Hola, voy a crear la primera tienda");
        /*
        Tienda t1 = new Tienda(); //Constructor por defecto. 
        //Si defino uno más avanzado, el constructor por defecto desaparece.
        t1.setNombre("El garaje de la moda");
        t1.setMaximoAforo(40);

        */

        Tienda t2 = new Tienda("La boutique de Loli", "Calle Pez 1", 55);
        System.out.println("El nombre de la primera tienda es: " + t2.getNombre());

        Tienda t3 = new Tienda("Zara de Princesa", "Zara", "Princesa 1",300);
        System.out.println("La información de la segunda tienda es: \n" + t3.toString());


    }

}