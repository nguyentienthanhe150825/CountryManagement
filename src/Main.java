
public class Main {
    public static void main(String[] args) {
        ManageSouthEastAsiaCountries manageSouthEastAsiaCountries = new ManageSouthEastAsiaCountries();

        while (true) {
            // Display menu
            Main.displayMenu();

            // Enter option
            int option = GetDataInput.inputOption("Enter your option: ", "Option must be positive number.", 1, 5);

            // Select option
            switch (option) {
                // Add 5 country
                case 1:
                    manageSouthEastAsiaCountries.addCountryInformation();
                    break;

                // Display list country
                case 2:
                    manageSouthEastAsiaCountries.displayCountry();
                    break;

                // Search country by name
                case 3:

                    break;

                case 4:

                    break;

                // Exit
                case 5:
                    System.exit(0);
                    break;

            }
        }
    }

    private static void displayMenu() {
        System.out.println("                               MENU\n"
                + "==========================================================================\n"
                + "1. Input the information of 5 countries in South East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "==========================================================================");
    }
}