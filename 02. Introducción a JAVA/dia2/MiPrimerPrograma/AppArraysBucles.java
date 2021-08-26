public class AppArraysBucles
{
    public static void main (String argv[])
    {
        Tienda t2 = new Tienda("La boutique de Loli", "Calle Pez 1", 55);
        System.out.println("La información de la segunda tienda es: \n" + t2.toString());

        Prenda[] prendas = new Prenda[10];

        prendas[0] = new Prenda("Parca Bilbao", Prenda.TALLA_M, "Skalpers");
        prendas[1] = new Prenda("Bañador Marbella", Prenda.TALLA_L, "H.A.");
        prendas[8] = new Prenda("Pantalón Mojón", Prenda.TALLA_S, "H.L.");
        
        //WHILE
        int index = 0;
        while (index < prendas.length)
        {
            if(prendas[index] != null)
                System.out.println(index +" : " + prendas[index].toString());
            index = index + 1;
        }

        //For
        for (int i = 0; i < prendas.length ; i = i+2 )
            if(prendas[i] != null)
                System.out.println(i +" : " + prendas[i].toString());


        //for each
        for (Prenda p : prendas)
            if(p!=null)
                System.out.println(p.toString());

        int entero = 0;
        System.out.println("Valor entero: "+ entero);

        Prenda p1 = null;
        System.out.println("Prenda: " + p1);


        int enteros[] = new int [30];
        for(int i = 0; i < enteros.length; i++)
            System.out.println(enteros[i]);

    }


}