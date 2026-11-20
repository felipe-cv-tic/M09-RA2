public class DormAleatori extends Thread {
    private long creacio;

    public DormAleatori(String nom) {
        super(nom);
        this.creacio = System.currentTimeMillis();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int interval = (int) (Math.random() * 1000);
            long total = System.currentTimeMillis() - creacio;
            System.out.printf("%s(%d) a dormir %4dms total %5dms%n", getName(), i, interval, total);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DormAleatori joan = new DormAleatori("Joan");
        DormAleatori pep = new DormAleatori("Pep");
        joan.start();
        pep.start();
        System.out.println("-- Fi de main -----------");
    }
}
