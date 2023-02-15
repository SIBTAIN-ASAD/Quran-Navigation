package sam.org.qurannavigation;

public class Ayah {
    public int number;
    public String arabic_text;
    public int numberInSurah;
    public int surahNumber;
    public String surah_name;

    public Ayah(int number, String arabic_text, int numberInSurah, int surahNumber, String surah_name) {
        this.number = number;
        this.arabic_text = arabic_text;
        this.numberInSurah = numberInSurah;
        this.surahNumber = surahNumber;
        this.surah_name = surah_name;
    }
}
