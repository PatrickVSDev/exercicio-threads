package aulaThreads;

public class UsandoThreadsComIsAlive {
    public static void main(String[] args) {
        System.out.println("Thread principal começando...");

        ExemploThreads3 threads1 = new ExemploThreads3("Filha #1");
        ExemploThreads3 threads2 = new ExemploThreads3("Filha #2");
        ExemploThreads3 threads3 = new ExemploThreads3("Filha #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Thread principal foi interrompida.");
            }
        }while (threads1.isAlive() || threads2.isAlive() || threads3.isAlive());
        System.out.println("Thread principal terminou!");
    }
}
