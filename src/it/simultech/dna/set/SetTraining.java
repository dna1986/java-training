package it.simultech.dna.set;

import java.util.HashSet;
import java.util.Set;

public class SetTraining {


    private Set<String> mySet = new HashSet<>();


    /*Aggiungere una String a un set
    *
    * in questo caso il set di riferimento è mySet che è un atrtibuto della classe
    * */
    public void addString(String item) {
        mySet.add(item);

    }


}
