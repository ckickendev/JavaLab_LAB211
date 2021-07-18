package JavaLabCucManh.Day1.Homework.Convert;

public class ConvertController {
    private int recieveNumber;

    public String convertNumberTenTo(int number, int base) {
        if (number < 0 || base < 2 || base > 16) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int m;
        int remainder = number;

        while (remainder > 0) {
            if (base > 10) {
                m = remainder % base;
                if (m >= 10) {
                    sb.append((char) (55 + m));
                } else {
                    sb.append(m);
                }
            } else {
                sb.append(remainder % base);
            }
            remainder = remainder / base;
        }
        return sb.reverse().toString();
    }

    public int convertNumberTwoToTen(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i))) * Math.pow(2, number.length() - i - 1);
        }
        return sum;
    }

    public int convertNumberHexToDecimal(String hexnum) {
        String hashString = "0123456789ABCDEF";
        hexnum = hexnum.toUpperCase();
        int num = 0;
        for (int i = 0; i < hexnum.length(); i++) {
            char ch = hexnum.charAt(i);
            int n = hashString.indexOf(ch);
            num = 16 * num + n;
        }
        return num;
    }

    public int convertNumberHexToTwo(String num){
        int hexToDe = convertNumberHexToDecimal(num);
        String result = convertNumberTenTo(hexToDe, 2);
        int resultButNumber = Integer.parseInt(result);
        return resultButNumber;
    }

    public String convertNumberTwoToHex(int num){
        String numButString = String.valueOf(num);
        int twoToTen = convertNumberTwoToTen(numButString);
        String result = convertNumberTenTo(twoToTen, 16);
        return result;
    }
}
