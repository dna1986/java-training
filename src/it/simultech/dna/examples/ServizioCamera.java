package it.simultech.dna.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Antonio on 27/02/2017.
 */
public class ServizioCamera {


    private List<Servizio> serviziCamera = new ArrayList<>();


    public void stampaPersonale() {

        //Per leggibilità chiamo il metodo stampaMance che restituisce un Hashset<Persona> e lo metto in un oggetto persone
        // che uso in seguito nel metodo
        HashSet<Persona> persone = stampaMance();


        //Qui uso "persone" e ci faccio un for
        for(Persona p : persone) {

            //Faccio la stampa della persona
            System.out.println("Stampare qua la persona" + p);
        }

    }



    /*il metodo stampaMance cicla la lista dei servizi
    * prende il personale per ogni servizi e lo mette in un set*/
    public HashSet<Persona> stampaMance() {


        //1 Mi creo un nuovo oggetto che conterrà il risultato del metodo
        HashSet<Persona> result = new HashSet<>();


        // 2 faccio il for dei servizi
        for (Servizio s : this.serviziCamera) {


            //3  metto la persona associata al servizio nel risutlato
            result.add(s.getPersona());
        }


        //4 restituisco il risultato
        return result;

    }
}
