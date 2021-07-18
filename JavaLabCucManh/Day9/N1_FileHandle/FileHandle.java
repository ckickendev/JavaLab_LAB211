package JavaLabCucManh.Day9.N1_FileHandle;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class FileHandle {
    Validation validation = new Validation();
    public void checkFilePath(){
        System.out.println("-----------------Check Path-----------------");
        System.out.print("Enter path: ");
        String path = validation.checkInputString();
        File file = new File(path);
        if(file.exists() && file.isFile()) {
            System.out.println("Path -> file");
        }else if (file.exists() && file.isDirectory()){
            System.out.println("Path -> directory");
        }else {
            System.out.println("Path doesn't exist");
        }
    }

    public void ListFileJava(){
        System.out.println("-----------------Get File Java-----------------");
        ArrayList<String> listFile = new ArrayList<>();
        System.out.print("Enter path: ");
        String path = validation.checkInputString();
        File file = new File(path);
        if(file.exists() && file.isDirectory()){
            File[] listFileChild = file.listFiles();
            for (int i=0; i < listFileChild.length; i++){
                if(listFileChild[i].isFile() && listFileChild[i].getName().endsWith(".java")){
                    listFile.add(listFileChild[i].getName());
                }
            }
        }else {
            System.out.println("This cannot be path");
            return;
        }
        System.out.println("Found "+ listFile.size() +" file!");
        for (int i=0; i<listFile.size(); i++){
            System.out.println(listFile.get(i));
        }
    }

    public void getFileWithSize(){
        System.out.println("-----------------Get file with size-----------------");
        System.out.print("Enter size(Integer): ");
        int size = validation.checkInputInteger();
        System.out.print("Enter path: ");
        String path = validation.checkInputString();
        File file = new File(path);
        if(file.exists() && file.isDirectory()){
            File[] listFile = file.listFiles();
            for (int i=0; i<listFile.length; i++){
                if(listFile[i].isFile() && listFile[i].length()>size){
                    System.out.println(listFile[i].getName());
                }
            }
        }else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    public void writeContentToFile() throws IOException {
        System.out.print("Enter content: ");
        String content = validation.checkInputString();
        System.out.print("Enter path: ");
        String path = validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(content);
            writer.close();
            System.out.println("Write done");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public void readFileCountCharacter() throws IOException {
        System.out.print("Enter path: ");
        String path = validation.checkInputString();
        File file = new File(path);
        if(file.exists() && file.isFile()){
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineContent = bufferedReader.readLine();
            int count = 0;
            while (lineContent != null){
                String[] content = lineContent.split(" ");
                for (String w: content){
                    count++;
                }
                lineContent = bufferedReader.readLine();
            }
            System.out.println("Have: " + count+ " words");
        }else {
            System.out.println("Path doesn't exist");
        }
    }
}
