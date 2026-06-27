import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.print("$ ");

            Scanner scanner = new Scanner(System.in);
            var command = scanner.nextLine();

            if (command.equals("exit")) {
                return;
            }

            System.out.printf("%s: command not found\n", command);
        }


    }
}
