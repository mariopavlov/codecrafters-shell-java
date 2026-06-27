import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.print("$ ");

            Scanner scanner = new Scanner(System.in);

            if (!scanner.hasNext()) {
                exit();
            }

            var input = scanner.nextLine().split(" ");
            var command = input[0];
            var rest = Arrays.copyOfRange(input, 1, input.length);

            switch (command) {
                case "exit":
                    exit();
                case "echo":
                    echo(rest);
                    break;
                default:
                    System.out.printf("%s: command not found\n", command);
                    break;
            }
        }
    }

    public static void exit() {
        System.exit(0);
    }

    public static void echo(String... args) {
        System.out.println(String.join(" ", args));
    }
}
