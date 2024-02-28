import src.Anagramme;

public class TestGlobal {

    public static void affichageTableau(String[] tab) {
        for(String x:tab) {
            System.out.print(x+"");
        }
    }

    public static void main(String[] args) {
        Anagramme an = new Anagramme();
        affichageTableau(an.makeAnagramme("facile"));

    }
}