public class PrincipalIguals {
    public static void main(String[] args) {
        new Fil("Pepe", Thread.MIN_PRIORITY, 0, "Acaba el fil").start();
        
        new Fil("Juan", Thread.MIN_PRIORITY, 0, "Acaba el fil").start();
        
        System.out.println("Acaba thread main");

    }
}