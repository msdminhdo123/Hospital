import java.time.Instant;

public class Doctor implements Runnable {

    Doctor() {

    }

    @Override
    public void run() {
        equipment();
    }

    private void equipment() {

        System.out.println(Thread.currentThread().getName() + " Entered the storage");
        synchronized (this) {
            try {
                Instant time = Instant.now();

                System.out.println(Thread.currentThread().getName() + " took the equipment at " + time.now());

                Thread.sleep(1000);

                System.out.println(Thread.currentThread().getName() + " returned the equipment at " + time.now());
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
    }

}
