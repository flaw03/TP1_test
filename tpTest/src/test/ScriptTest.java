package test;

import algo.Anagramme;
import specif.Specification;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ScriptTest {
    static List<String[]> testData;
    static Anagramme an = new Anagramme();
    static Specification sp = new Specification();
    
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
              
          }catch(OutOfMemoryError e) {
      		System.err.println("Erreur, OUT OF MEMORY la pile est pleine\n");
      	}
    	  
    	  return list;
    }
    

    public void testAnagrams(List<String[]> list,String path,Function<String,String> fun) {
    	int nbLigne = 0;
    	for(String[] donnees : list) {
    		nbLigne++;
                
                if (donnees.length == 2) {
                    String mot = donnees[0];
                    String anMot = donnees[1];
                    
                    String result = fun.apply(mot);
                    if(mot.equals(" ") || anMot.equals(" ")) {
                    	
                    	System.err.println("Donnee non conforme, présence d'un mot vide à la ligne : "+nbLigne);
                    	System.out.println("________________________________________________________________");
                    	continue;}
                    
                    System.out.println("Entree : "+mot+"| |Attendu : "+anMot+"\n     - Sortie : "+result);
                    
                    
                    
                    
                    
                    if(anMot.equals(result)&&sp.isSorted(result)) 	
                    	System.out.println("Test reussi pour : "+mot);
                    else 
                    	System.err.println("Test rate pour : "+mot);
                    
                    System.out.println("________________________________________________________________");
                    
                    
                   
                }
                else {
                	System.err.println("Donnee non conforme,à la ligne : "+nbLigne);  
                	System.out.println("________________________________________________________________");
                }
               
               
            }     
    }
 
}
