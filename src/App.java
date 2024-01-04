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


}
