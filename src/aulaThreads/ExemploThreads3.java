package aulaThreads;

public class ExemploThreads3 extends Thread{
    public ExemploThreads3(String nome) {
        super(nome);
        start();
    }

    public void run() {
        System.out.println("Iniciando "+getName());
        try {
            for (int i=0; i <10; i++) {
                Thread.sleep(400);
                System.out.println("Na thread "+getName()+" a contagem é "+i);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread "+getName()+" interrompida!");
        }
        System.out.println("Thread "+getName()+" terminou!");
    }
}

