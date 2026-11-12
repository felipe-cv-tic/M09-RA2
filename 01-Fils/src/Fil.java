public class Fil extends Thread {
    private int delay;
    private String fi;

    public Fil(String nom, int prioritat, int delay, String fi) {
        super(nom);
        setPriority(prioritat);
        this.delay = delay;
        this.fi = fi;
    }

    public void run() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(getName() + " " + i);
            if (delay > 0) {
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                }
            } else {
                for (int j = 0; j < 1000; j++);
            }
        }
        System.out.println(fi + " " + getName());
    }
}