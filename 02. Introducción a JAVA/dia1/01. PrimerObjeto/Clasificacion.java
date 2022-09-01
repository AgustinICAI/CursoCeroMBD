public class Clasificacion {

    Piloto [] pilotos;
    int countPilotos;

    Clasificacion(){
        pilotos = new Piloto[11];

    }

    Piloto[] getPilotos() {
        return this.pilotos;
    }

    Piloto[] getPilotos(int numPilotos){
        Piloto ps[] = new Piloto[numPilotos];
        int i = 0;
        while(i < numPilotos){
            ps[i] = pilotos[i];
            i+=1;
        }
        return ps;

    }


    void addPiloto(Piloto p){
        if(countPilotos < pilotos.length) {
            pilotos[countPilotos] = p;
            countPilotos = countPilotos + 1;
        }else {
            System.err.println("NO CABEN MÁS PILOTOS");
        }
    }

    public String toString(){
        String cad = "";
        for(int i = 0; i < pilotos.length; i++){
            cad = cad + pilotos[i].toString() + ",";
        }
        return cad;
    }



}
