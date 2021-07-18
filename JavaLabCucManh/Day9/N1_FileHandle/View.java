package JavaLabCucManh.Day9.N1_FileHandle;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        FileHandle fileHandle = new FileHandle();
        int choice;
        do{
            choice = main.option();
            switch (choice){
                case 1:{
                    fileHandle.checkFilePath();
                    break;
                }
                case 2:{
                    fileHandle.ListFileJava();
                    break;
                }
                case 3:{
                    fileHandle.getFileWithSize();
                    break;
                }
                case 4:{
                    fileHandle.writeContentToFile();
                    break;
                }
                case 5:{
                    fileHandle.readFileCountCharacter();
                    break;
                }
            }
        }while (choice!=6);
    }
}
