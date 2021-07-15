public class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //Ejemplo de Upcasting a un array
        Empleado empleados[] = new Empleado[10];
        empleados[0] = new JugadorCampo("Joaquín","2312413241","Betis",3000000);
        empleados[1] = new JugadorCampo("Marcello","34182341","R. Madrid",4000000);
        empleados[2] = new Portero("De Gea", "341234123", "Man. United",5000000);
        empleados[3] = new JugadorCampo("Messi","2312413241","Barcelona",3000000);
        empleados[4] = new JugadorCampo("Sergio Ramos","34182341","R. Madrid",4000000);
        empleados[5] = new Portero("Ter Stegen", "341234123", "Barcelona",5000000);

        //Empleado e = empleados[2];
        //Ejemplo de downcasting
        ((Portero)empleados[2]).setGolesEncajados(10);
        //((Portero)empleados[3]).setGolesEncajados(10);


        for (Empleado e : empleados)
            if (e!=null) {
                System.out.println(e.getNombre() + " " + e.calculaNomina());
                if ( e instanceof Portero )
                {
                    System.out.println(e.getNombre() + " se trata de un portero y le han metido " + ((Portero)e).getGolesEncajados() + " goles");
                }
            }
        /*
        for (int i = 0 ; i < empleados.length ; i++)
        {
            Empleado e = empleados[i];
            if (e!=null)
                System.out.println(e.getNombre() + " " + e.calculaNomina());
        }*/
    }
}
