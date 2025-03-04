import java.util.List;

public class CheckValue {

    public static boolean checkExistCode(String countryCode, List<SouthEastAsiaCountries> listCountry) {
        for (SouthEastAsiaCountries country : listCountry) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return true;
            }
        }
        return false;
    }

}
