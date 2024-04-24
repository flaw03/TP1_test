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
    
    public String makeAnagrammeMT1(String mot) { // (<) => (<=)
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<=taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j-1])<=0)) {
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public String makeAnagrammeMT2(String mot) { // (<) => (>)
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i>taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j-1])>0)) {
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public String makeAnagrammeMT3(String mot) { // (>) => (<=)
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j<=0)&&(car.compareTo(anagramme[j-1])<0)) {
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public String makeAnagrammeMT4(String mot) { //(-) => (+)
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j+1])<0)) {
                anagramme[j] = anagramme[j+1];
                j+=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public static void main(String[] args) {
    	Anagramme an = new Anagramme();
    	System.out.println(an.makeAnagramme("-&^_"));
    }
    
    public String makeAnagrammeLIM1(String mot) {
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