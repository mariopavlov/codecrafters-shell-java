import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        var command = scanner.nextLine();
        System.out.printf("%s: command not found", command);
    }
}
