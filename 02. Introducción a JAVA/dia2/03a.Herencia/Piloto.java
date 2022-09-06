class Piloto extends EmpleadoEquipo {

    //AtributoAtributos de Instancia
    Coche coche;
    int dorsal;

    boolean experienciaPrevia;

    //Atributos de clase
    static int DORSAL_POR_DEFECTO = -999999;


    Piloto(String nombre,String apellidos) {

        //super(nombre,apellidos,null);
        super(nombre,apellidos);
        dorsal = DORSAL_POR_DEFECTO;
    }
    Piloto (String nombre, String apellidos, Equipo equipo, Coche coche, int dorsal){
        /*this.nombre = nombre;
        this.apellidos = apellidos;
        this.equipo = equipo;
        this.coche = coche;
        this.dorsal = dorsal;*/

        super(nombre, apellidos,equipo);
        setCoche(coche);
        setDorsal(dorsal);
    }

    Piloto (String nombre, String apellidos, Equipo equipo, Coche coche, int dorsal, boolean experienciaPrevia){
        this(nombre, apellidos, equipo, coche, dorsal);
        this.experienciaPrevia = experienciaPrevia;
    }



    Coche getCoche(){
        return coche;
    }

    int getDorsal(){
        return dorsal;
    }


    void setCoche(Coche coche){
        this.coche = coche;
    }

    void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }





    public String toString(){

        String equipoAux = "";

        if(equipo!=null){
            equipoAux = "equipo:" + equipo.getEscuderia() + ", ";
        }
        /*
        String cocheAux = "";
        if(coche!=null)
            cocheAux = "coche:" + coche.toString()+", ";
        */

        return "nombre: " + nombre + ", " +
                "apellidos: " + apellidos + ", " +
                equipoAux +
                (coche!=null?"coche: " + coche.toString():"") +
                (dorsal!=-999999?"dorsal: " + dorsal:"" );
    }

    //METODOS DE INSTANCIA
    boolean getDorsalConSuerteMETODODEINSTANCIA(){
        if(this.dorsal==7 || this.dorsal==8)
            return true;
        else return false;
    }

    //METODOS DE CLASE
    static boolean getDorsalConSuerteMETODODECLASE(int dorsal){
        if(dorsal==7 || dorsal==8)
            return true;
        else return false;
    }

}
