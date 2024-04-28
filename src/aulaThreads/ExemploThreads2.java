package aulaThreads;

public class ExemploThreads2 implements Runnable{
    Thread thread;

    // Vamos nomear e inicializar a thread dentro do método construtor
    public ExemploThreads2(String nome) {
        thread = new Thread(this, nome);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Iniciando "+thread.getName());
        try {
            for (int i=0; i <10; i++) {
                Thread.sleep(400);
                System.out.println("Na thread "+thread.getName()+" a contagem é "+i);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread "+thread.getName()+" interrompida!");
        }
        System.out.println("Thread "+thread.getName()+" terminou!");
    }
}