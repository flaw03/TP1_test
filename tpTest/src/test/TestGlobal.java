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
	private static ScriptTest scriptTest = new ScriptTest();

    
    
    public static void main(String[] args){
    	ScriptTest sp = new ScriptTest();
    	String path = "../bin/donnees.txt";
    	List<String[]> list = sp.dataToList(path);
    	System.out.println("**********************************");
    	sp.testAnagrams(list,path);
    	System.out.println("**********************************\n");
    	System.out.println("*********(<) devient (<=)*********");
    	try{
    		sp.testAnagramsMT1(list, path);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************\n");
    	System.out.println("*********(<) devient (>)*********");
    	sp.testAnagramsMT2(list, path);
    	System.out.println("**********************************\n");
    	System.out.println("*********(>) devient (<=)*********");
    	try{
    		sp.testAnagramsMT3(list, path);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************\n");
    	System.out.println("*********(-) devient (+)*********");
    	try{
    		sp.testAnagramsMT4(list, path);
    	}catch (IndexOutOfBoundsException e) {
			System.err.println("Erreur, OUT OF BOUNDS\n");
		}
    	System.out.println("**********************************");
    	
    	
    	
    }
    
  
    }