public class Accesorio extends Item
{
    int acabado;
    double tamanoCM;

    static int ACABADO_PLATA = 0;
    static int ACABADO_ORO = 1;
    static int ACABADO_COBRE = 2;

    public Accesorio(String nombre, int stock, String marca, int acabado, double tamanoCM)
    {
        super(nombre,stock,marca);
        this.acabado = acabado;
        this.tamanoCM = tamanoCM;
    }

    @Override
    public String toString() {
        return "Accesorio{" +
                "acabado=" + acabado +
                ", tamanoCM=" + tamanoCM +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", marca='" + marca + '\'' +
                '}';
    }

    public int getAcabado() {
        return acabado;
    }

    public void setAcabado(int acabado) {
        this.acabado = acabado;
    }

    public double getTamanoCM() {
        return tamanoCM;
    }

    public void setTamanoCM(double tamanoCM) {
        this.tamanoCM = tamanoCM;
    }

    @Override
    public String getInstruccionesDevolucion() {
        return "Comprobar que no tenga arañazos y que el paquete se encuentra correcto";
    }
}