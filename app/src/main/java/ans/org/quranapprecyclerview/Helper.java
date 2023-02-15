package ans.org.quranapprecyclerview;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.os.Environment;
import android.text.format.DateFormat;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Helper {
    public static ArrayList<Ayah> ayahArrayList = new ArrayList<>();
    //    read the excel file, into the arraylist of Ayah
    // header of excel fil is
    //    number	text	numberInSurah	page	surah_name	englishName	englishNameTranslation	revelationType	UrduTranslation	UrduTafseer	EnglishTranslation	Englishtafseer	SindhiTranslation	SindhiTafseer	HindiTranslation	HindiTafseer	PushtoTransation	PushtoTafseer
    /*
    public int number;
    public String arabic_text;
    public int numberInSurah;
    public int page;
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
     */
    public void readExcelFile() throws IOException {

    }

}
