package algo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import specif.Specification;

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
    
    public String makeAnagrammeMT1(String mot) { 
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<=taille_anagramme;i++) { //(<) => (<=)
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
    
    public String makeAnagrammeMT2(String mot) {
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j-1])>0)) { // < => >
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public String makeAnagrammeMT3(String mot) {
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j>0)&&(car.compareTo(anagramme[j-1])<0)) {
                anagramme[j] = anagramme[j-1];
                j+=1; // - => +
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
    }
    
    public String makeAnagrammeMT4(String mot) {
        int taille_anagramme = 0;
        String[] anagramme = mot.split("");
        taille_anagramme = anagramme.length;
        for(int i = 0;i<taille_anagramme;i++) {
            String car = anagramme[i];
            int j = i;
            while((j<0)&&(car.compareTo(anagramme[j-1])<0)) { // > => <
                anagramme[j] = anagramme[j-1];
                j-=1;
            }
            anagramme[j] = car;
        }
        return String.join("", anagramme);
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
    
    @Test
	public void testMouton() {
		Anagramme an = new Anagramme();
		Specification sp = new Specification();
		String result = an.makeAnagramme("mouton");
		assertEquals(result,"mnootu");
		assertTrue(sp.isSorted(result));
		
	}
    
 



}