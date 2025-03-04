import java.util.ArrayList;
import java.util.List;

public class ManageSouthEastAsiaCountries {
    private List<SouthEastAsiaCountries> listCountry = new ArrayList<>();

    public void addCountryInformation() {
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

            float totalArea = GetDataInput.inputFloatNumber("Enter total area:",
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

}
