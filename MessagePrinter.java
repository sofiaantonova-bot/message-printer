import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MessagePrinter {

    public static void main(String[] args) {
        printWelcomeMessage();
        printGoodbyeMessage();
        printCurrentTime();
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome to our improved Message Printer!");
    }

    public static void printGoodbyeMessage() {
        System.out.println("Goodbye! Thanks for using Message Printer!");
    }

    public static void printCurrentTime() {
        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Current time: " + time);
    }
}