package JavaLabCucManh.Day5.BaiSo1;

import java.util.ArrayList;
import java.util.Collections;

public class ManageEastAsiaCountries {
    ArrayList<EastAsiaCountries> countries = new ArrayList<>();
    Validation validation = new Validation();
    EastAsiaCountries justDisplay;

    public ManageEastAsiaCountries() {
        countries.add(new EastAsiaCountries("IDN", "Indo", 1860360, "nice"));
        countries.add(new EastAsiaCountries("MYA", "Myanmar", 676578, "very nice"));
        countries.add(new EastAsiaCountries("THA", "ThaiLand", 513120, "good"));
        countries.add(new EastAsiaCountries("LAO", "Lao", 236800, "good"));
        countries.add(new EastAsiaCountries("BRN", "BruNey", 	5765, "nice"));
    }

    public void inputCountry(){
        System.out.println("Enter code of country: ");
        String code = validation.checkInputString();
        System.out.println("Enter name of country: ");
        String name = validation.checkInputString();
        System.out.println("Enter total Area: ");
        double aread = validation.checkInputDouble();
        Float area = (float) aread;
        System.out.println("Enter terrain of country:");
        String terrain = validation.checkInputString();
        EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
        justDisplay = country;
        countries.add(country);
        System.out.println("SUCCESS!");
    }

    public void displayJustInput(){
        System.out.println("ID          Name            TotalArea           Terrain");
        System.out.print(justDisplay.getCountryCode()+"         "+justDisplay.getCountryName()+"            "+
                justDisplay.getTotalArea()+"           "+justDisplay.getCountryTerrain());
        System.out.println();
    }

    public void searchCountry(){
        System.out.println("Enter the name you want to search for: ");
        String searchC = validation.checkInputString();
        ArrayList<EastAsiaCountries> countriesFind = new ArrayList<>();
        for(var x: countries){
            if(x.getCountryName().toLowerCase().contains(searchC.toLowerCase())){
                countriesFind.add(x);
                System.out.println(x);
            }
        }
        if(countriesFind.size() == 0) {
            System.out.println("CANNOT FIND !!!");
        }else {
            System.out.println("ID          Name            TotalArea           Terrain");
            for (var x: countriesFind) {
                System.out.print(x.getCountryCode() + "         " + x.getCountryName() + "            " +
                        x.getTotalArea() + "           " + x.getCountryTerrain());
                System.out.println();
            }
        }
    }

    public void sortAndDisplay(){
        Collections.sort(countries);
        System.out.println("ID          Name            TotalArea           Terrain");
        for (var x: countries) {
            System.out.print(x.getCountryCode() + "         " + x.getCountryName() + "            " +
                    x.getTotalArea() + "           " + x.getCountryTerrain());
            System.out.println();
        }
    }

}
