package specif;

import algo.Anagramme;

public class Specification {

    public boolean isSorted(String chaine) {
        for(int i = 0;i<chaine.length();i++) {
            for(int j = i+1;j<chaine.length();j++) {
                if(chaine.charAt(i)>chaine.charAt(j)) {
                    return false;
                }
                }
            }
        return true;
    }
    
  
   


}