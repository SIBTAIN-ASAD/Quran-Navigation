package ans.org.quranapprecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.MyVH> {

    List<Ayah> ayahList;

    // translations
    String[] translations = {"English", "Urdu", "Sindhi", "Hindi", "Pushto"};


    Button backButton;

    Spinner parahSpinner;
    TextView showArabicText;
    TextView showTranslation;

    public myRecyclerViewAdapter(List<Ayah> friendsList) {
        this.ayahList = friendsList;
    }

    @NonNull
    @Override
    public myRecyclerViewAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()) .inflate(R.layout.single_item, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerViewAdapter.MyVH holder, int position) {
        holder.data = ayahList.get(position);
        // only show 50 characters
        String arabicText = holder.data.arabic_text.length() > 60 ? holder.data.arabic_text.substring(0, 60) + "..." : holder.data.arabic_text;

        holder.textViewArabicText.setText(arabicText);

        String ayahNumber = "آیت " + holder.data.numberInSurah + " (" + holder.data.number + ")";
        holder.textViewAyahNumber.setText(ayahNumber);
        holder.textViewSurahName.setText(holder.data.surah_name + " (" + holder.data.surahNumber + ")");

        // add click listener to holder item
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // create a dialog box
//                Dialog dialog = new Dialog(v.getContext());
//                dialog.setContentView(R.layout.dialog_box);
//                // get the spinner of dialog box
//                parahSpinner = dialog.findViewById(R.id.translationSpinner);
//                // populate the spinner with all the translations
//                parahSpinner.setAdapter(new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_spinner_dropdown_item, translations));
//
//                // spinner click listener onchange
//                parahSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                        String translation = parahSpinner.getSelectedItem().toString();
//                        if (translation.equals("English")) {
//                            showTranslation.setText(holder.data.english_translation);
//                        } else if (translation.equals("Urdu")) {
//                            showTranslation.setText(holder.data.urdu_translation);
//                        } else if (translation.equals("Sindhi")) {
//                            showTranslation.setText(holder.data.sindhi_translation);
//                        } else if (translation.equals("Hindi")) {
//                            showTranslation.setText(holder.data.hindi_translation);
//                        } else if (translation.equals("Pushto")) {
//                            showTranslation.setText(holder.data.pushto_translation);
//                        }
//                    }
//
//                    @Override
//                    public void onNothingSelected(AdapterView<?> parent) {
//
//                    }
//                });
//
//                showArabicText = dialog.findViewById(R.id.showArabicText);
//                showTranslation = dialog.findViewById(R.id.showTranslation);
//
//                // show the arabic text
//                showArabicText.setText(holder.data.arabic_text);
//                showArabicText.setTextSize(20);
//
//                backButton = dialog.findViewById(R.id.backButton);
//
//                backButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        dialog.dismiss();
//                    }
//                });
//
//                // show the translation
//                String translation = parahSpinner.getSelectedItem().toString();
//                if (translation.equals("English")) {
//                    showTranslation.setText(holder.data.english_translation);
//                } else if (translation.equals("Urdu")) {
//                    showTranslation.setText(holder.data.urdu_translation);
//                } else if (translation.equals("Sindhi")) {
//                    showTranslation.setText(holder.data.sindhi_translation);
//                } else if (translation.equals("Hindi")) {
//                    showTranslation.setText(holder.data.hindi_translation);
//                } else if (translation.equals("Pushto")) {
//                    showTranslation.setText(holder.data.pushto_translation);
//                }
//                showTranslation.setTextSize(20);
//
//                // show the dialog box
//                dialog.show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return ayahList.size();
    }


    public class MyVH extends RecyclerView.ViewHolder {
        TextView textViewArabicText;
        TextView textViewSurahName;
        TextView textViewAyahNumber;
        Ayah data;
        public MyVH(@NonNull View itemView) {
            super(itemView);
            textViewArabicText = itemView.findViewById(R.id.textViewArabicText);
            textViewSurahName = itemView.findViewById(R.id.textViewSurahName);
            textViewAyahNumber = itemView.findViewById(R.id.textViewAyahNumber);
        }
    }
}