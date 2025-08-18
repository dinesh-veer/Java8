import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> Consumer = s ->System.out.println(s);
        //Consumer<String> Consumer = System.out::println; //method reference

        Consumer.accept("Hello");
        Consumer.accept("World");
    }
}
