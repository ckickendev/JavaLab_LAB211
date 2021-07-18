package JavaLabCucManh.Day8.Matrix_cucmanh;

public class Matrix {
    public Validation validation = new Validation();
    public void addMatrix(){
        System.out.println("========Addition========");
        System.out.print("Enter Row Matrix 1: ");
        int row1 =  validation.checkInputInteger();
        System.out.print("Enter Column Matrix 1: ");
        int column1 = validation.checkInputInteger();
        int[][] matrix1 = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                matrix1[i][j] = validation.checkInputInteger();
            }
        }
        boolean check;
        int[][] matrix2;
        do {
            check = false;
            System.out.print("Enter Row Matrix 2: ");
            int row2 = validation.checkInputInteger();
            System.out.print("Enter Column Matrix 2: ");
            int column2 = validation.checkInputInteger();
            if(row1 != row2 || column1 != column2){
                System.out.println("Two matrix must have same row and column!");
                check = true;
            }else {
                matrix2 = new int[row2][column2];
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                        matrix2[i][j] = validation.checkInputInteger();
                    }
                }

                System.out.println("=======Result=======");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        System.out.print("["+matrix1[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("+");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        System.out.print("["+matrix2[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("=");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        int x = matrix1[i][j]+matrix2[i][j];
                        System.out.print("["+x+"]");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }
        }while (check);
    }

    public void subMaxtrix(){
        System.out.println("========Subtraction========");
        System.out.print("Enter Row Matrix 1: ");
        int row1 =  validation.checkInputInteger();
        System.out.print("Enter Column Matrix 1: ");
        int column1 = validation.checkInputInteger();
        int[][] matrix1 = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                matrix1[i][j] = validation.checkInputInteger();
            }
        }
        boolean check;
        int[][] matrix2;
        do {
            check = false;
            System.out.print("Enter Row Matrix 1: ");
            int row2 = validation.checkInputInteger();
            System.out.print("Enter Column Matrix 1: ");
            int column2 = validation.checkInputInteger();
            if(row1 != row2 || column1 != column2){
                System.out.println("Two matrix must have same row and column!");
                check = true;
            }else {
                matrix2 = new int[row2][column2];
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                        matrix2[i][j] = validation.checkInputInteger();
                    }
                }

                System.out.println("=======Result=======");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        System.out.print("["+matrix1[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("+");
                for (int i=0; i<row2; i++){
                    for (int j=0; j < column2; j++){
                        System.out.print("["+matrix2[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("=");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        int x = matrix1[i][j]-matrix2[i][j];
                        System.out.print("["+x+"]");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }
        }while (check);
    }

    public void MultiplicationMatrix(){
        System.out.println("========Multiplication========");
        System.out.print("Enter Row Matrix 1: ");
        int row1 =  validation.checkInputInteger();
        System.out.print("Enter Column Matrix 1: ");
        int column1 = validation.checkInputInteger();
        int[][] matrix1 = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                matrix1[i][j] = validation.checkInputInteger();
            }
        }
        boolean check;
        int[][] matrix2;
        do {
            check = false;
            System.out.print("Enter Row Matrix 1: ");
            int row2 = validation.checkInputInteger();
            System.out.print("Enter Column Matrix 1: ");
            int column2 = validation.checkInputInteger();
            if(column1!=row2){
                System.out.println("Two matrix must have same row and column!");
                check = true;
            }else {
                matrix2 = new int[row2][column2];
                for (int i = 0; i < row2; i++) {
                    for (int j = 0; j < column2; j++) {
                        System.out.print("Enter Matrix[" + (i+1) + "]["+ (j+1) + "]: ");
                        matrix2[i][j] = validation.checkInputInteger();
                    }
                }

                System.out.println("=======Result=======");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column1; j++){
                        System.out.print("["+matrix1[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println("*");
                for (int i=0; i<row2; i++){
                    for (int j=0; j < column2; j++){
                        System.out.print("["+matrix2[i][j]+"]");
                    }
                    System.out.println();
                }
                int[][] matrix3 = new int[row1][column2];
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < column2; j++) {
                        matrix3[i][j] = 0;
                        for (int k = 0; k < column1; k++) {
                            matrix3[i][j] = matrix3[i][j] + matrix3[i][k] * matrix3[k][j];
                        }
                    }
                }
                System.out.println("=");
                for (int i=0; i<row1; i++){
                    for (int j=0; j < column2; j++){
                        System.out.print("["+matrix3[i][j]+"]");
                    }
                    System.out.println();
                }
                System.out.println();
                return;
            }
        }while (check);
    }
}
