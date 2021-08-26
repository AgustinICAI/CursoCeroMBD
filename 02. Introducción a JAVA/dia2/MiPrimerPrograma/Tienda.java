public class Tienda
{
    String nombre;
    String direccion;
    int aforo;
    String franquicia;
    static int AFOROMAXIMO = 100;
    Prenda[] prendas;
    int ultimaPosicion;


    public Tienda(String nombre, String direccion, int aforo)
    {
        prendas = new Prenda[20];
        this.nombre = nombre;
        this.direccion = direccion;
        this.aforo = aforo;
    }
    public Tienda(String nombre, String franquicia, String direccion, int aforo)
    {
        this(nombre,direccion,aforo);
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

    public int addPrenda(Prenda p)
    {
        //Esto sascaría la primera posición libre
        /*while(prendas[i] != null && i < prendas.length)
           i += 1;
        prendas[i] = p;
        */
        if(ultimaPosicion<prendas.length)
        {
            prendas[ultimaPosicion] = p;
            ultimaPosicion += 1;
            return ultimaPosicion;
        }
        else
            return -1;

    }

    public String toString()
    {
        String salida;
        salida =  "Nombre: " + nombre + ", Direccion: " + direccion + ", Aforo: " + aforo;
        if(franquicia != null)
            salida = salida + "- pertenece a la franquicia: " +franquicia ;
        
        salida = salida + "\n----PRENDAS----";
        for (Prenda p : prendas)
            if(p !=null)
                salida += "\n" + p.toString();
            
        return salida;
    }


    public boolean hayProbadorLibre()
    {
        boolean b1 = hayProbadorLibre("Masculino");
        boolean b2 = hayProbadorLibre("Niña");
        boolean b3 = hayProbadorLibre("Señora");
        // En el caso de que todos fueran libres, devuelve true
        //return b1 && b2 && b3;        
        // En el caso de que alguno estuviera libre
        return b1 || b2 || b3;
    }

    public static void setAFOROMAXIMO(int aforo)
    {
        AFOROMAXIMO = aforo;
    }

    public static int getAFOROMAXIMO()
    {
        return AFOROMAXIMO;
    }

    public boolean hayProbadorLibre(String sexo)
    {
        if(sexo.equals("Masculino"))
            if (Math.random() > 0.8)
                return true;
            else return false;
        else
            if (Math.random() > 0.6)
                return true;
            return false;
    }

    public Prenda[] getPrendas()
    {
        return this.prendas;
    }
    public void setPrendas(Prenda prendas[])
    {
        this.prendas = prendas;
    }
}