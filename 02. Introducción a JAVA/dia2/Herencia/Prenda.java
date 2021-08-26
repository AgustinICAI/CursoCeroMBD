public class Prenda extends Item
{
    int talla;
    String tejido;

    public Prenda(String nombre, int stock, String marca, int talla, String tejido)
    {
        super(nombre,stock,marca);
        this.talla = talla;
        this.tejido = tejido;

    }
}