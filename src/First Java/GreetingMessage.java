import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Hello " + name + " :)");
    }
}
