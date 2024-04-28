package aulaThreads;

public class UsandoThreads3 {
    public static void main(String[] args) {
        System.out.println("Thread principal começando!");

        ExemploThreads3 threads1 = new ExemploThreads3("Filha #1");
        ExemploThreads3 threads2 = new ExemploThreads3("Filha #2");
        ExemploThreads3 threads3 = new ExemploThreads3("Filha #3");

        for (int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread principal interrompida");
            }
        }System.out.println("Thread principal terminou!");
    }
}