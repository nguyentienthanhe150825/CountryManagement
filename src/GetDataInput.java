import java.util.Scanner;

public class GetDataInput {

    public static int inputOption(String message, String error, int min, int max) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(message);
                int option = Integer.parseInt(sc.nextLine());
                if (option >= min && option <= max) {
                    return option;
                } else {
                    System.out.println("Option in [" + min + " - " + max + "]. Please input again!");
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }

}
