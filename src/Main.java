import java.io.UncheckedIOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Car car = new Car();
            car.close();
            car.drive();


        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}
