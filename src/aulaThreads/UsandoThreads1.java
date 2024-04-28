package aulaThreads;

public class UsandoThreads1 {
    public static void main(String[] args) {
        System.out.println("Thread principal começando...");

        // Instanciamos o objeto que define o comportamento da thread
        ExemploThreads1 thread1 = new ExemploThreads1("Filha #1");

        // Cria a thread a partir do comportamento estabelecido
        Thread novaThread = new Thread(thread1);

        // Inicia a thread
        novaThread.start();

        // Define o comportameto da thread principal
        // Executar 50 vezes, uma a cada 100ms (5 segundos no total)
        // Assim garantimos que a filha finalize antes da principal
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
