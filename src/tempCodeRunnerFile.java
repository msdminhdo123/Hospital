import java.time.Instant;

public class App {
    public static void main(String[] args) throws Exception {
        Doctor temp = new Doctor();
        Thread doctor1 = new Thread(temp);
        doctor1.setName("Doctor1");
        doctor1.start();
        Thread doctor2 = new Thread(temp);
        doctor2.setName("Doctor2");
        doctor2.start();
        Thread doctor3 = new Thread(temp);
        doctor3.setName("Doctor3");
        doctor3.start();
    }

    private static class Doctor implements Runnable {

        Doctor() {

        }

        @Override
        public void run() {
            equipment();
        }

        private static synchronized void equipment() {
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
