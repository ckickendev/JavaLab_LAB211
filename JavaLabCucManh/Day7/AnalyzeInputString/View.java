package JavaLabCucManh.Day7.AnalyzeInputString;

public class View {
    public static void main(String[] args) {
        Loading loading = new Loading();
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String input = loading.checkInputString();
        loading.analyzeNumber(input);
        loading.analyzeLetter(input);
    }
}
