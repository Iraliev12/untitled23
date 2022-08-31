import java.io.UncheckedIOException;

public class Car {
    public void close()throws UncheckedIOException{
        System.out.println("car is closing");
    }
    public  void drive()throws UncheckedIOException{
        System.out.println("car is driving");
    }
}
