import java.util.ArrayList;
import java.util.List;

public class ManageSouthEastAsiaCountries {
    private List<SouthEastAsiaCountries> listCountry = new ArrayList<>();

    public void addCountryInformation() {
        // listCountry.add(new SouthEastAsiaCountries("VN", "Viet Nam", 331698, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("IDN", "Indonesia", 1860360, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("MAS", "Malaysia", 123456, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("THAI", "Thai Lan", 513120, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("CPC", "Campuchia", 181035, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("CN", "China", 9596961, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("JP", "Japan", 377930, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("MA", "Myanmar", 676578, "Nice"));
        // listCountry.add(new SouthEastAsiaCountries("KA", "Korea", 100210, "Nice"));
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

}
