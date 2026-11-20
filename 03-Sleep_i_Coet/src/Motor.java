public class Motor extends Thread {
    private int potenciaActual;
    private int potenciaObjectiu;

    public Motor(int id) {
        super("Motor " + id);
        this.potenciaActual = 0;
        this.potenciaObjectiu = 0;
    }

    public void setPotencia(int p) {
        this.potenciaObjectiu = p;
    }

    @Override
    public void run() {
        while (true) {
            int objectiu = potenciaObjectiu;
            try {
                if (potenciaActual == objectiu) {
                    Thread.sleep(100);
                    continue;
                }
                Thread.sleep(1000 + (int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                return;
            }
            objectiu = potenciaObjectiu;
            if (potenciaActual < objectiu) {
                potenciaActual++;
                System.out.println(getName() + ": Incre. Objectiu: " + objectiu + " Actual: " + potenciaActual);
            } else if (potenciaActual > objectiu) {
                potenciaActual--;
                System.out.println(getName() + ": Decre. Objectiu: " + objectiu + " Actual: " + potenciaActual);
            }
            if (potenciaActual == objectiu) {
                System.out.println(getName() + ": FerRes Objectiu: " + objectiu + " Actual: " + potenciaActual);
                if (objectiu == 0) {
                    return;
                }
            }
        }
    }
}
