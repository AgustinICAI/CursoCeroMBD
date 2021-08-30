public abstract class Item {
    String nombre;
    int stock;
    String marca;

    public Item(String nombre, int stock, String marca) {
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
    }

    public abstract String getInstruccionesDevolucion();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean equals(Object o)
    {
        if(o instanceof Item)
        {
            Item i = (Item) o;

            if (i.getMarca().equals(this.getMarca()) && i.getNombre().equals(this.getNombre()))
                return true;
            else
                return false;
        }
        else return false;
    }
}
