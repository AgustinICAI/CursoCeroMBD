public class Tienda
{
    String nombre;
    String direccion;
    int aforo;
    String franquicia;

    public Tienda(String nombre, String direccion, int aforo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aforo = aforo;
    }
    public Tienda(String nombre, String franquicia, String direccion, int aforo)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aforo = aforo;
        this.franquicia = franquicia;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    public String getDireccion()
    {
        return this.direccion;
    }
    public int getAforo()
    {
        return this.aforo;
    }

    public String toString()
    {
        return "Nombre: " + nombre + ", Direccion: " + direccion + ", Aforo: " + aforo + "- Y pertenece a la franqucia: " +franquicia ;
    }

}