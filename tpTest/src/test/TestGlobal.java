package test;

import algo.Anagramme;

import specif.Specification;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.*;

import org.junit.jupiter.api.Test;

public class TestGlobal {
	private static Anagramme an = new Anagramme();
	private static Specification specif = new Specification();
	private static ScriptTest sp = new ScriptTest();

    
    
    public static void main(String[] args){
    	
    	String path = args[0];
    	List<String[]> list = sp.dataToList(path);
    	System.out.println("**********************************");
    	try {
    	sp.testAnagrams(list,path,an::makeAnagramme);
    	}catch(OutOfMemoryError e) {
    		System.err.println("Erreur, Out of memory, la pile est pleine\n");
    	}
    	System.out.println("**********************************\n");
    	System.out.println("*********(<) devient (<=)*********");
    	try{
    		sp.testAnagrams(list, path,an::makeAnagrammeMT1);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************\n");
    	System.out.println("*********(<) devient (>)*********");
    	sp.testAnagrams(list, path,an::makeAnagrammeMT2);
    	System.out.println("**********************************\n");
    	System.out.println("*********(>) devient (<=)*********");
    	try{
    		sp.testAnagrams(list, path,an::makeAnagrammeMT3);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************\n");
    	System.out.println("*********(-) devient (+)*********");
    	try{
    		sp.testAnagrams(list, path,an::makeAnagrammeMT4);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************");
    	
    	
    	
    }
    
  
    }