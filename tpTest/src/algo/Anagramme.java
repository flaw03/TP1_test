package algo;

import java.util.Scanner;

public class Anagramme {

    public String makeAnagramme(String mot) {
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j-1])<0)) {
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }



}