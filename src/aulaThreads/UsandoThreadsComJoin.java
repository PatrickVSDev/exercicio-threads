package aulaThreads;

public class UsandoThreadsComJoin {
    public static void main(String[] args) {
        System.out.println("Thread principal começando...");

        ExemploThreads3 threads1 = new ExemploThreads3("Filha #1");
        ExemploThreads3 threads2 = new ExemploThreads3("Filha #2");
        ExemploThreads3 threads3 = new ExemploThreads3("Filha #3");

        try {
            threads1.join();
            System.out.println("Filha #1 se juntou (joined)!");
            threads2.join();
            System.out.println("Filha #2 se juntou (joined)!");
            threads3.join();
            System.out.println("Filha #3 se juntou (joined)!");
        } catch (InterruptedException e) {
            System.out.println("Thread principal interrompida!");
        }
        System.out.println("Thread principal terminou!");
    }
}
