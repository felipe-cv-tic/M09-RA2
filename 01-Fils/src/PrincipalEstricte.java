public class PrincipalEstricte {
    public static void main(String[] args) {
        new Fil("Juan", Thread.NORM_PRIORITY, 1, "Termina el fil").start();
        new Fil("Pepe", Thread.NORM_PRIORITY, 1, "Termina el fil").start();
        System.out.println("Termina thread main");
    }
}