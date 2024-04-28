package aulaThreads;

public class ExemploThreads1 implements Runnable{
    // Definir o comportamento da thread
    String nomeThread;

    public ExemploThreads1(String nomeThread) {
        this.nomeThread = nomeThread;
    }

    // Define o que a thread irá fazer
    // conta de 0 até 9 a cada 400ms
    @Override
    public void run() {
        System.out.println("Iniciando "+nomeThread);
        try {
            for (int i=0; i <10; i++) {
                Thread.sleep(400);
                System.out.println("Na thread "+nomeThread+" a contagem é "+i);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread "+nomeThread+" interrompida!");
        }
        System.out.println("Thread "+nomeThread+" terminou!");
    }
}