package JavaLabCucManh.Day4.NormalizeText;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            int countLine = Loading.countLine();
            int count = 1;
            br = new BufferedReader(new FileReader("C:\\Users\\theso\\IdeaProjects\\JAVA\\src\\JavaLabCucManh\\Day4\\NormalizeText\\input.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\theso\\IdeaProjects\\JAVA\\src\\JavaLabCucManh\\Day4\\NormalizeText\\output.txt", true)));
            String line;

            while ((line = br.readLine()) != null) {
                //check line empty
                if (Loading.isLineEmpty(line)){
                    continue;
                }
                line = Loading.formatOneSpace(line);
                line = Loading.formatSpecialCharacters(line);
                line = Loading.afterDotUpperCase(line);
                line = Loading.noSpaceQuotes(line);
                line = Loading.firstUpercase(line);
                line = Loading.lastAddDot(line);
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
