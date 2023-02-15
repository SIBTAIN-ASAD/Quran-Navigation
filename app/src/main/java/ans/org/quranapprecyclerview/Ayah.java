package ans.org.quranapprecyclerview;

public class Ayah {
    public int number;
    public String arabic_text;
    public int numberInSurah;
    public int surahNumber;
    public String surah_name;
    public String surah_name_english;
    public String surah_name_english_translation;
    public String revelationType;
    public String urdu_translation;
    public String urdu_tafseer;
    public String english_translation;
    public String english_tafseer;
    public String sindhi_translation;
    public String sindhi_tafseer;
    public String hindi_translation;
    public String hindi_tafseer;
    public String pushto_translation;
    public String pushto_tafseer;

    public Ayah(int number, String arabic_text, int numberInSurah, int surahNumber, String surah_name, String surah_name_english, String surah_name_english_translation, String revelationType, String urdu_translation, String urdu_tafseer, String english_translation, String english_tafseer, String sindhi_translation, String sindhi_tafseer, String hindi_translation, String hindi_tafseer, String pushto_translation, String pushto_tafseer) {
        this.number = number;
        this.arabic_text = arabic_text;
        this.numberInSurah = numberInSurah;
        this.surahNumber = surahNumber;
        this.surah_name = surah_name;
        this.surah_name_english = surah_name_english;
        this.surah_name_english_translation = surah_name_english_translation;
        this.revelationType = revelationType;
        this.urdu_translation = urdu_translation;
        this.urdu_tafseer = urdu_tafseer;
        this.english_translation = english_translation;
        this.english_tafseer = english_tafseer;
        this.sindhi_translation = sindhi_translation;
        this.sindhi_tafseer = sindhi_tafseer;
        this.hindi_translation = hindi_translation;
        this.hindi_tafseer = hindi_tafseer;
        this.pushto_translation = pushto_translation;
        this.pushto_tafseer = pushto_tafseer;
    }

    @Override
    public String toString() {
        return "Ayah{" +
                "number=" + number +
                ", arabic_text='" + arabic_text + '\'' +
                ", numberInSurah=" + numberInSurah +
                ", surahNumber=" + surahNumber +
                ", surah_name='" + surah_name + '\'' +
                ", surah_name_english='" + surah_name_english + '\'' +
                ", surah_name_english_translation='" + surah_name_english_translation + '\'' +
                ", revelationType='" + revelationType + '\'' +
                ", urdu_translation='" + urdu_translation + '\'' +
                ", urdu_tafseer='" + urdu_tafseer + '\'' +
                ", english_translation='" + english_translation + '\'' +
                ", english_tafseer='" + english_tafseer + '\'' +
                ", sindhi_translation='" + sindhi_translation + '\'' +
                ", sindhi_tafseer='" + sindhi_tafseer + '\'' +
                ", hindi_translation='" + hindi_translation + '\'' +
                ", hindi_tafseer='" + hindi_tafseer + '\'' +
                ", pushto_translation='" + pushto_translation + '\'' +
                ", pushto_tafseer='" + pushto_tafseer + '\'' +
                '}';
    }

}
