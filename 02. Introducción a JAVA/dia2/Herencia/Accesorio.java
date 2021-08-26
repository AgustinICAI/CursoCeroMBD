public class Accesorio extends Item
{
    int acabado;
    int tamanoCM;

    static int ACABADO_PLATA = 0;
    static int ACABADO_ORO = 1;
    static int ACABADO_COBRE = 2;

    public Accesorio(String nombre, int stock, String marca, int acabado, int tamanoCM)
    {
        super(nombre,stock,marca);
        this.acabado = acabado;
        this.tamanoCM = tamanoCM;
    }

    
}