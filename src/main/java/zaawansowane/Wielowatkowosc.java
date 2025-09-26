package zaawansowane;

public class Wielowatkowosc {
    public static void main(String[] args)throws InterruptedException {
        class Task implements Runnable {
            private boolean running = true;

            public void stop() {
                running = false;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Wątek TRZECI " + i);
                    if (!running) {
                        System.out.println("Aborted");
                        return;
                    }
                }
            }
        }
        Task task = new Task();


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                System.out.println("Wątek DRUGI " + i);
                if (i == 5_000) {
                    task.stop();
                }
            }
        });

        //thread.run(); // najczęstrzy błąd - tutaj main wejdzie w ten kod a nie uruchomi wątek
        thread.start(); // main zleci uruchomie wątku i pójdzie dalej
        //awaryjne przerwanie wątku robimy zwyczajnie przez wcześniejsze zakończenie jego kodu
        Thread thread2 = new Thread(task);
        thread2.start();


        //Thread.sleep(1000);  // wymuszona obsługa InteruptedException
        thread.join(); //zaczekaj w tej lini kodu na zakończenie pracy tego Thread
        thread2.join();
        for (int i = 0; i < 10_000; i++) {
            System.out.println("-----------Wątek MAIN");
        }


    }
}
