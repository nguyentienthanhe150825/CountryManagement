import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManageSouthEastAsiaCountries {
    private List<SouthEastAsiaCountries> listCountry = new ArrayList<>();

    public void addCountryInformation() {
        // listCountry.add(new SouthEastAsiaCountries("CN", "China", 9596961, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("MA", "Myanmar", 676578, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("KA", "Korea", 100210, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("JP", "Japan", 377930, "Nice"));
        if (listCountry.size() < 5) {
            String countryCode = "";
            while (true) {
                // regex CODE: letters from a -> z or A -> Z appear 1 or more times
                countryCode = GetDataInput.inputString("Enter code of country:",
                        "Country code contains digit or special characters or space or is empty. Please input again!",
                        "[a-zA-Z]+");

                boolean isExistCode = CheckValue.checkExistCode(countryCode, listCountry);
                if (isExistCode == true) {
                    System.out.println("Duplicate country code, please again!");
                } else {
                    break;
                }
            }

            String countryName = GetDataInput.inputString("Enter name of country:",
                    "Country name contains digit or special characters or is empty. Please input again!",
                    "^[a-zA-Z][a-zA-Z ]+");

            float totalArea = GetDataInput.inputFloatNumber("Enter total area: ",
                    "Total area must be number greater than 0");

            String countryTerrain = GetDataInput.inputString("Enter terrain:",
                    "Terrain contains digit or special characters or is empty. Please input again!", "[a-zA-Z ]+");

            listCountry.add(new SouthEastAsiaCountries(countryCode, countryName, totalArea, countryTerrain));

            System.out.println("ADD COUNTRY SUCCESS");
        }

        if (listCountry.size() == 5) {
            System.out.println("Added enough 5 countries.");
        }
    }

    public void displayCountry() {
        // If the list does not contain information country, notices to user
        if (listCountry.isEmpty()) {
            System.out.println("List is empty. Please add more country into list.");
        }

        // If the list has information country.
        if (!listCountry.isEmpty()) {
            System.out.format("%-20s%-20s%-20s%-20s\n", "Code", "Name", "Total Area", "Terrain");
            for (SouthEastAsiaCountries country : listCountry) {
                country.display();
                System.out.println("");
            }
        }
    }

    public void searchInformationCountry() {
        // If the list does not contain information country, notices to user
        if (listCountry.isEmpty()) {
            System.out.println("List is empty. Please add more country into list.");
        }

        // If the list has information country.
        if (!listCountry.isEmpty()) {
            String countryName = GetDataInput.inputString("Enter name of country:",
                    "Country name contains digit or special characters or is empty. Please input again!",
                    "^[a-zA-Z][a-zA-Z ]+");

            System.out.format("%-20s%-20s%-20s%-20s\n", "Code", "Name", "Total Area", "Terrain");
            boolean checkExistName = false;

            for (SouthEastAsiaCountries country : listCountry) {
                // If Country name in the list contains the Name entered by the user
                if (country.getCountryName().toLowerCase().contains(countryName.toLowerCase())) {
                    checkExistName = true;
                    country.display();
                    System.out.println("");
                }
            }

            if (checkExistName == false) {
                System.out.println("No country in the list has the same name!");
            }

        }
    }

    public void sortAscendingCountryByName() {
        // If the list does not contain information country, notices to user
        if (listCountry.isEmpty()) {
            System.out.println("List is empty. Please add more country into list.");
        }

        // If the list has information country.
        if (!listCountry.isEmpty()) {
            Collections.sort(listCountry, new Comparator<SouthEastAsiaCountries>() {
                @Override
                public int compare(SouthEastAsiaCountries c1, SouthEastAsiaCountries c2) {
                    return c1.getCountryName().compareToIgnoreCase(c2.getCountryName());
                }
            });
            displayCountry();
        }
    }

}
