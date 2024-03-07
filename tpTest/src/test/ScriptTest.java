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

    @BeforeAll
    static void setUp() throws IOException {
        testData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("../donnees.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            testData.add(parts);
        }
        reader.close();
    }
    @Test
    void startTest() {
        for(String[] donnees : testData) {
        	if (donnees.length < 2) {
                System.err.println("Ligne mal formatee ou manquante pour les données: " + Arrays.toString(donnees));
                continue;
            }
            String mot = donnees[0];
            String anMot = donnees[1];
            
            String result = an.makeAnagramme(mot);
            
            assertEquals(anMot, result, "Test raté pour : " + mot);
        }
        
    }
    
}
