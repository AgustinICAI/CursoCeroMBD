public class Prenda
{
    String nombre;
    int talla;
    String marca;

    static int TALLA_XS = 0;
    static int TALLA_S = 1;
    static int TALLA_M = 2;
    static int TALLA_L = 3;

    public Prenda(String nombre, int talla, String marca)
    {
        this.nombre = nombre;
        this.talla = talla;
        this.marca = marca;
    }
    
    public String toString()
    {
        return nombre + " " + talla + " " + marca;
    }


}