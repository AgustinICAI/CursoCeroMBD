public class App {
    public static void main(String argv[])
    {
        Prenda p1 = new Prenda("abrigo guay",10,"T.H.",Prenda.TALLA_L,"Algodón");
        Accesorio a1 = new Accesorio("Anillo molón",4,"Mía",Accesorio.ACABADO_COBRE,2.14d);

        //Otro ejemplo de upcasting
        Item i3 = new Prenda("abrigo guay",10,"T.H.",Prenda.TALLA_L,"Algodón");

        Item i4 = p1;

        System.out.println("Los objetos son iguales? "  + (p1 == i3));
        System.out.println("Los objetos son iguales? "  + (p1 == i4));

        int var1 = 5;
        int var2 = 5;
        System.out.println("Los tipos son iguales? "  + (var1 == var2));


        System.out.println("Los objetos son iguales? "  + (p1.equals(i3)));
        System.out.println("Los objetos son iguales? "  + (i3.equals(p1)));

        String str1 = "Hola";
        String str2 = "Hola";

        if(str1.equals(str2))
            System.out.println("Las cadenas son iguales");



        //Upcasting
        Item [] items = new Item[10];
        items[0] = p1;
        items[1] = a1;

        for (Item i : items)
            if (i!=null) {
                System.out.println(i);

                //Downcasting
                if (i instanceof Prenda ) {
                    Prenda pAux = (Prenda) i;
                    System.out.println(pAux.getTalla());
                    System.out.println(((Prenda)i).getTalla());
                }

            }




    }

}
