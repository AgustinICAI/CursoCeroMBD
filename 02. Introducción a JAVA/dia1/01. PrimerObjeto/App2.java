public class App2 {
    public static void main(String argv[]){

        Clasificacion clasificacion = new Clasificacion();

        Piloto p1 = new Piloto("Fernando","Alonso");
        Piloto p2 = new Piloto("Louis","Hamilton");
        Piloto p3 = new Piloto("Jarno","Trulli");

        clasificacion.addPiloto(p1);
        clasificacion.addPiloto(p2);
        clasificacion.addPiloto(p3);

        clasificacion.addPiloto(new Piloto("Lewis","Hamilton"));
        clasificacion.addPiloto(new Piloto("George","Russell"));
        clasificacion.addPiloto(new Piloto("Esteban","Ocon"));
        clasificacion.addPiloto(new Piloto("Fernando","Alonso"));
        clasificacion.addPiloto(new Piloto("Kevin","Magnussen"));
        clasificacion.addPiloto(new Piloto("Mick", "Schumacher"));
        clasificacion.addPiloto(new Piloto("Daniel","Ricciardo"));
        clasificacion.addPiloto(new Piloto("Lando", "Norris"));


        System.out.println(clasificacion);


    }
}
