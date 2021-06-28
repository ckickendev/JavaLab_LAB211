package JavaLabCucManh.Day7.CheckDataFormat;

public class CheckData {

    public static void main(String[] args) {
        Validation validation = new Validation();
        System.out.println("====== Validate Program ======");
        String phone = validation.checkPhone();
        String email = validation.checkEmail();
        String date = validation.checkDate();
        System.out.println("INFORMATION: ");
        System.out.println("PHONE: "+phone);
        System.out.println("EMAIL: "+email);
        System.out.println("DATE: "+date);
    }
}
