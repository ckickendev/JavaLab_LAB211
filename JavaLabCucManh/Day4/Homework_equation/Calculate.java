package JavaLabCucManh.Day4.Homework_equation;

public class Calculate {
    Validation validation = new Validation();
    public void SuperlativeEquation(){
        System.out.print("Input A: ");
        double a = validation.checkInputDouble();
        System.out.print("Input B: ");
        double b = validation.checkInputDouble();
        double result;
        String message = "";
        if(a==0){
            if(b!=0)
                System.out.println("No solution");
            else {
                System.out.println("Infinity solution");
            }
        }
        else {
            result = -b/a;
            System.out.println("Solution: x = " + result);
        }
        int[] arrayCheck = {(int)a,(int)b};
        checkTypeNumber(arrayCheck);

    }

    public void checkTypeNumber(int[] arrayCheck){
        int odd     =0;
        int even    =0;
        int PerfectSquare = 0;
        for(var x: arrayCheck){
            if(x%2==0 && x>0){
                even++;
            }else if(x%2==1 && x>0) {
                odd++;
            }
            double so = Math.sqrt(x);
            if(so - Math.floor(x) == 0){
                PerfectSquare++;
            }
        }
        if(odd==1){
            System.out.print("Number is Odd: ");
            for (var x: arrayCheck){
                if(x%2==1) System.out.println(x+",");
            }
        }else if(odd>1) {
            System.out.print("Odd Number(s): ");
            for (var x: arrayCheck){
                if(x%2==1) System.out.print(x+ ", ");
            }
            System.out.println();
        }

        if(even==1){
            System.out.print("Number is Even: ");
            for (var x: arrayCheck){
                if(x%2==0) {
                    System.out.println(x+",");
                }
            }
        }else if(even>1) {
            System.out.print("Even Number(s): ");
            for (var x: arrayCheck){
                if(x%2==0) System.out.print(x+ " ");
            }
            System.out.println();
        }

        if(PerfectSquare==1){
            System.out.print("Number is Perfect Square: ");
            for (var x: arrayCheck){
                double so = Math.sqrt(x);
                if(so - Math.floor(so) == 0){
                    System.out.print(x+ " ");
                }
            }
            System.out.println();
        }else if(PerfectSquare>1) {
            System.out.print("Number is Perfect Square: ");
            for (var x: arrayCheck){
                double so = Math.sqrt(x);
                if(so - Math.floor(so) == 0){
                    System.out.print(x + " ");
                }
            }
            System.out.println();
        }




    }

    public void QuadraticEquation(){
        System.out.print("Input A: ");
        double a = validation.checkInputDouble();
        System.out.print("Input B: ");
        double b = validation.checkInputDouble();
        System.out.print("Input C: ");
        double c = validation.checkInputDouble();

        if(a == 0){
            if(a == 0){
                System.out.println("No Solution");
            }else{
                System.out.println("Solution: x1 = "+ ( (-1) * c / b));
            }
        }else{
            double denta = b*b - 4*a*c;
            if(denta > 0 ){
                double x1 = (-b + Math.sqrt(denta)) / (2*a);
                double x2 = (-b - Math.sqrt(denta)) / (2*a);
                System.out.println("Solution: x1 = " +x1 +" and x2 = " +x2);
            }else if(denta == 0){
                double x1 = -b / 2*a;
                System.out.println("Solution: x1 = x2 = "+ x1);
            }else {
                System.out.println("No solution!");
            }
        }

        int[] arrayCheck = {(int)a, (int)b, (int)c};

        checkTypeNumber(arrayCheck);
    }

}
