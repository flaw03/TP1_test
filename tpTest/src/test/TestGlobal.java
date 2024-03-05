package test;

import algo.Anagramme;
import specif.Specification;

public class TestGlobal {

    public static void affichageTableau(String[] tab) {
        for(String x:tab) {
            System.out.print(x+"");
        }
    }

        public static void main(String[] args) {
            Anagramme an = new Anagramme();
            Specification sp = new Specification();

            String mot = "facile";
            String retour = (an.makeAnagramme(mot));
            System.out.println(retour+"\n");
            System.out.println(sp.isSorted(retour));

            String a = "g";
            String b = "b";
            System.out.println(a.compareTo(b));



        }
    }