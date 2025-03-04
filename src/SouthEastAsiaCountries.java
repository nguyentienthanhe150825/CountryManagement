
public class SouthEastAsiaCountries extends Country {
    private String countryTerrain;

    public SouthEastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        countryTerrain = countryTerrain.substring(0, 1).toUpperCase() + countryTerrain.substring(1).toLowerCase();
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.format("%-20s%-20s%-20s%-20s\n", this.getCountryCode(), this.getCountryName(), this.getTotalArea(),
                this.getCountryTerrain());
    }

}
