package JavaLabCucManh.Day6.Homework_dictionary;

public class Dictionary {
    private String englishMean;
    private String vietnameseMean;

    public Dictionary(String englishMean, String vietnameseMean) {
        this.englishMean = englishMean;
        this.vietnameseMean = vietnameseMean;
    }

    public String getEnglishMean() {
        return englishMean;
    }

    public void setEnglishMean(String englishMean) {
        this.englishMean = englishMean;
    }

    public String getVietnameseMean() {
        return vietnameseMean;
    }

    public void setVietnameseMean(String vietnameseMean) {
        this.vietnameseMean = vietnameseMean;
    }

}
