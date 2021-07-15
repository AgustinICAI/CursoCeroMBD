import java.util.Objects;

public class Palabra implements Comparable {
    private String palabra;
    private int ocurrencias;

    public Palabra(String palabra) {
        this.setPalabra(palabra);
        ocurrencias = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra1 = (Palabra) o;
        return Objects.equals(palabra, palabra1.getPalabra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(palabra);
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getOcurrencias() {
        return ocurrencias;
    }

    public void setOcurrencias(int ocurrencias) {
        this.ocurrencias = ocurrencias;
    }

    public void sumarOcurrencia()
    {
        this.ocurrencias += 1;
    }

    @Override
    public String toString() {
        return palabra + ", " + ocurrencias;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Palabra)
            return this.palabra.compareTo(((Palabra)o).getPalabra());
        else return -1;
    }
}

