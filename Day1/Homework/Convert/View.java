package JavaLabCucManh.Day1.Homework.Convert;

public class View {
    public static void main(String[] args) {
        Menu menuNe = new Menu();
        ConvertController convertController = new ConvertController();
        int baseInput;
        do {
            baseInput = menuNe.menu();
            int baseOutput = menuNe.outPut();
            String number = menuNe.inputNumber();
            String numberOut =" ";
            switch (baseInput){
                case 1:{
                    switch (baseOutput){
                        case 2:{
                            numberOut = String.valueOf(convertController.convertNumberTwoToTen(number));
                            break;
                        }
                        case 3:{
                            numberOut = convertController.convertNumberTwoToHex(Integer.parseInt(number));
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    switch (baseOutput){
                        case 1:{
                            numberOut = convertController.convertNumberTenTo(Integer.parseInt(number), 2);
                            break;
                        }
                        case 3:{
                            numberOut = convertController.convertNumberTenTo(Integer.parseInt(number), 16);
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    switch (baseOutput){
                        case 1:{
                            numberOut = String.valueOf(convertController.convertNumberHexToTwo(number));
                            break;
                        }
                        case 2:{
                            numberOut = String.valueOf(convertController.convertNumberHexToDecimal((number)));
                            break;
                        }
                    }
                }
            }
            System.out.println("Your number output is: " + numberOut);
        }while (baseInput >= 1 && baseInput <= 3 );

    }
}
