package it.simultech.dna.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Example1 {


    private List<String> serviziCamera = new ArrayList<>();
    private Set<String> setPersonale = new HashSet<>();


    public void stampaPersonale() {

        for (String stampa : this.serviziCamera) {

            this.setPersonale.add(stampa);
        }

    }

}
