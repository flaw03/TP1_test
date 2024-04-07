package test;

import algo.Anagramme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ScriptTest {
    static List<String[]> testData;
    static Anagramme an = new Anagramme();
    
    public List<String[]> dataToList(String path) {
    	List<String[]> list = new ArrayList<>();
    	  try (BufferedReader br = new BufferedReader(new FileReader(path))) {
              String line;
              while ((line = br.readLine()) != null) {
                  String[] donnees = line.split(":");
                  list.add(donnees);
              }
    	  } catch (IOException e) {
              e.printStackTrace();
          }
    	  
    	  return list;
    }
    
 


    public void testAnagrams(List<String[]> list,String path) {
    	for(String[] donnees : list) {
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = an.makeAnagramme(mot);
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    if(anMot.equals(result)) {
                    	
                    	System.out.println("Test reussi pour : "+mot+"\n");
                    }
                    else {
                    	System.err.println("Test rate pour : "+mot+"\n");
                    }
                    
                    
                }
            }     
    }
    
    public void testAnagramsMT1(List<String[]> list,String path) {
    	for(String[] donnees : list) {
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = an.makeAnagrammeMT1(mot);
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    if(anMot.equals(result)) {
                    	
                    	System.out.println("Test reussi pour : "+mot+"\n");
                    }
                    else {
                    	System.err.println("Test rate pour : "+mot+"\n");
                    }
                    
                    
                }
            }     
    }
    
    public void testAnagramsMT2(List<String[]> list,String path) {
    	for(String[] donnees : list) {
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = an.makeAnagrammeMT2(mot);
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    if(anMot.equals(result)) {
                    	
                    	System.out.println("Test reussi pour : "+mot+"\n");
                    }
                    else {
                    	System.err.println("Test rate pour : "+mot+"\n");
                    }
                    
                    
                }
            }     
    }
    
    public void testAnagramsMT3(List<String[]> list,String path) {
    	for(String[] donnees : list) {
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = an.makeAnagrammeMT3(mot);
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    if(anMot.equals(result)) {
                    	
                    	System.out.println("Test reussi pour : "+mot+"\n");
                    }
                    else {
                    	System.err.println("Test rate pour : "+mot+"\n");
                    }
                    
                    
                }
            }     
    }
    
    public void testAnagramsMT4(List<String[]> list,String path) {
    	for(String[] donnees : list) {
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = an.makeAnagrammeMT4(mot);
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    if(anMot.equals(result)) {
                    	
                    	System.out.println("Test reussi pour : "+mot+"\n");
                    }
                    else {
                    	System.err.println("Test rate pour : "+mot+"\n");
                    }
                    
                    
                }
            }     
    }
}
