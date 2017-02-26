package it.simultech.dna.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Example1 {


    private List<Servizio> serviziCamera = new ArrayList<>();


    public void stampaPersonale() {

        HashSet<Persona> persone = stampaMance();

        for(Persona p : persone) {

            System.out.println("Stampare qua la persona" + p);
        }

    }



    /*il metodo stampaMance cicla la lista dei servizi
    * prende il personale per ogni servizi e lo mette in un set*/
    public HashSet<Persona> stampaMance() {

        HashSet<Persona> result = new HashSet<>();

        for (Servizio s : this.serviziCamera) {
            result.add(s.getPersona());
        }

        return result;

    }

}
