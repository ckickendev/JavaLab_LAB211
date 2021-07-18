package JavaLabCucManh.Day5.BaiSo1;


public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries> {
    private String countryTerrain;

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public int compareTo(EastAsiaCountries eastAsiaCountries) {
        return (this.getCountryName().compareToIgnoreCase(eastAsiaCountries.getCountryName()) < 0 ? -1 :
                (this.getCountryCode() == eastAsiaCountries.getCountryCode() ? 0 : 1));
    }

    @Override
    public String toString() {
        return "EastAsiaCountries{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", totalArea=" + totalArea +
                ", countryTerrain='" + countryTerrain + '\'' +
                '}';
    }
}
