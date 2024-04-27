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
    	if(!path.contains(".txt")) {
    		System.err.println("Usage [" +path+ "] <dataFile.txt>");
    		System.exit(1);
    	}

    	List<String[]> list = sp.dataToList(path);
    	System.out.println("***************************************************************************");
    	System.out.println("***************************************************************************");
    	
    	sp.testAnagrams(list,path,an::makeAnagramme);
    	
    	System.out.println("***************************************************************************");
    	System.out.println("*********************(<) devient (<=) à la ligne 4*************************");
    	System.out.println("***************************************************************************");
    	sp.testAnagrams(list, path,an::makeAnagrammeMT1);
    	
    	System.out.println("***************************************************************************");
    	System.out.println("*********************(<) devient (>) à la ligne 6**************************");
    	System.out.println("***************************************************************************");
    	sp.testAnagrams(list, path,an::makeAnagrammeMT2);
    	System.out.println("***************************************************************************");
    	System.out.println("*********************(>) devient (<=) à la ligne 9*************************");
    	System.out.println("***************************************************************************");
    	
    		sp.testAnagrams(list, path,an::makeAnagrammeMT3);
    	
    	System.out.println("***************************************************************************");
    	System.out.println("************************(-) devient (+) à la ligne 7***********************");
    	System.out.println("***************************************************************************");
    	
    		sp.testAnagrams(list, path,an::makeAnagrammeMT4);
    	
    	System.out.println("***************************************************************************");
    	
    	
    	
    }
    
  
    }