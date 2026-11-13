public class Futbolista extends Thread {
    private int ngols;
    private int ntirades;
    private static final int NUM_JUGADORS = 11;
    private static final int NUM_TIRADES = 20;
    private static final float PROBABILITAT = 0.5f;

    public Futbolista( String nom) {
        super(nom);
        this.ngols = 0;
        this.ntirades = 0;
    }

    public void run(){
        for (int i = 0; i < NUM_TIRADES; i++) {
            ntirades++;
            if (Math.random() < PROBABILITAT) {
                ngols++;
            }
        }
    }
    public static void main(String[] args){
        String[] noms = {"Piqué", "Vinicius", "Torres", "Ramos", "Ronaldo", "Lewan",
                         "Belli", "Arnau", "Aspas", "Messi", "MBapé"};

        System.out.println("Inici dels xuts --------------------");
        System.out.println("Fi dels xuts -----------------------");
        System.out.println("--- Estadístiques ------");

    }
    
}
