package test;

import algo.Anagramme;

import specif.Specification;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.*;

import org.junit.jupiter.api.Test;

public class TestGlobal {
	static Anagramme an = new Anagramme();
	static Specification sp = new Specification();


    public static void affichageTableau(String[] tab) {
        for(String x:tab) {
            System.out.print(x+"");
        }
    }
    
    
    @Test
    void testSpecification() {
    	String chaine = "abcdefg";
    	assertTrue(sp.isSorted(chaine));
    }
    
    @Test
    void testSpecification2() {
    	String chaine = "zerioazour";
    	assertFalse(sp.isSorted(chaine));
    }
    
    @Test
    void testSpecification3() {
    	String chaine = "zerioazour";
    	String chaineSorted = an.makeAnagramme(chaine);
    	assertTrue(sp.isSorted(chaineSorted));
    }
    
    @Test
    void testAnagramme() {
    	assertTrue(an.makeAnagramme("facile").equals("acefil"));
    }
    
    @Test
    void testAnagramme2() {
    	assertTrue(an.makeAnagramme("mouton").equals("mnootu"));
    }
    
    @Test
    void testAnagramme3() {
    	assertTrue(an.makeAnagramme("zzzzzzzzzzza").equals("azzzzzzzzzzz"));
    }
    
    @Test
    void testAnagramme4() {
    	assertTrue(an.makeAnagramme("aaaaaaab").equals("aaaaaaab"));
    }
    
    @Test
    void testAnagramme5() {
    	assertTrue(an.makeAnagramme("bonjour").equals("bjnooru"));
    }
    
    public static void main(String[] args) throws IOException {
    	ScriptTest sp = new ScriptTest();
    	
    	sp.setUp();
    	sp.startTest();
    	
    	
    	
    }
    
  
    }