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

    public static String inputString(String message, String error, String regex) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(message);
            String result = sc.nextLine();
            if (result.matches(regex)) {
                return result;
            }
            System.out.println(error);
        }
    }

    public static float inputFloatNumber(String message, String error) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                float floatNumber = Float.parseFloat(sc.nextLine());
                if (floatNumber > 0f) {
                    return floatNumber;
                } else {
                    System.out.println("Total area must be number > 0");
                }

            } catch (Exception e) {
                System.out.println(error);
            }
        }
    }

}
