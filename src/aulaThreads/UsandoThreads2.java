package aulaThreads;

public class UsandoThreads2 {
    public static void main(String[] args) {
        System.out.println("Thread principal começando!");

        ExemploThreads2 thread1 = new ExemploThreads2("Filha #1");

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