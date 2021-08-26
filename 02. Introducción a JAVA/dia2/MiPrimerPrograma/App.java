public class App
{
    public static void main (String argv[])
    {
        Tienda t2 = new Tienda("La boutique de Loli", "Calle Pez 1", 55);

        t2.addPrenda(new Prenda("Parca Bilbao", Prenda.TALLA_M, "Skalpers"));
        t2.addPrenda(new Prenda("Bañador Marbella", Prenda.TALLA_L, "H.A."));
        t2.addPrenda(new Prenda("Pantalón Mojón", Prenda.TALLA_S, "H.L."));
        

        System.out.println(t2.toString());

    }

}