package JavaLabCucManh.Day5.BaiSo2;

public class Menu {
    Validation validation = new Validation();
    public int option(){
        System.out.print("========= Calculator Program =========\n" +
                "1. Normal Calculator\n" +
                "2. BMI Calculator\n" +
                "3. Exit\n" +
                "Please choice one option: ");
        return validation.checkInputIntLimit(1,3);
    }
}
