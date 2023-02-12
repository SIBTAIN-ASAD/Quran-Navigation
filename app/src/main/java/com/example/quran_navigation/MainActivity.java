package com.example.quran_navigation;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class MainActivity extends AppCompatActivity {

    public TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("ABCD");
            readExcelFileFromAssets();
        txt = findViewById(R.id.textView);

    }


    public void readExcelFileFromAssets() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("QuranMetaData.xlsx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        while (true) {
            try {
                line = reader.readLine();
                if (line == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {

            }
            String[] values = line.split(",");
            for (String value : values) {
                String Value = value;
                txt.setText(Value);
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
