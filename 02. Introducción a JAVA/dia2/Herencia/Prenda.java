public class Prenda extends Item implements Imprimible {
    int talla;
    String tejido;

    static int TALLA_XS = 0;
    static int TALLA_S = 1;
    static int TALLA_M = 2;
    static int TALLA_L = 3;

    @Override
    public String toString() {
        return "Prenda{" +
                "nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", marca='" + marca + '\'' +
                ", talla=" + talla +
                ", tejido='" + tejido + '\'' +
                '}';
    }

    public String getNombreModificado()
    {
        return "prenda: " + getNombre();
    }


    public Prenda(String nombre, int stock, String marca, int talla, String tejido) {
        super(nombre, stock, marca);
        this.talla = talla;
        this.tejido = tejido;
    }


    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    @Override
    public String getInstruccionesDevolucion() {
        return "Comprobar que no se hayan quitado las etiquetas y que la prenda no esté usada";

    }

    @Override
    public void imprimirPorPantalla() {
        System.out.println("Imprimiendo por pantalla " + this.toString());
    }

    @Override
    public void imprimirPorImpresora() {
        System.out.println("Imprimiendo por impresora " + this.toString());

    }
}
