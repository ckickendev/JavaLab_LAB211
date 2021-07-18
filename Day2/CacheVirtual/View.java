package JavaLabCucManh.Day2.CacheVirtual;

public class View {
    public static void main(String[] args){
        FuMemoryCached fuMemoryCached = new FuMemoryCached();
        fuMemoryCached.putObject("DucDo", "Excellent", 1000);
        fuMemoryCached.putObject("TrungDung", "Excellent", 1500);
        fuMemoryCached.putObject("ThuHoai", "Excellent", 3000);
        System.out.println(FuMemoryCached.getObject("DucDo"));
        System.out.println(FuMemoryCached.getObject("TrungDung"));
        System.out.println(FuMemoryCached.getObject("ThuHoai"));
    }
}
