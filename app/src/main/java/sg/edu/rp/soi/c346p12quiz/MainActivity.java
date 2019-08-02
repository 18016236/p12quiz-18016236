package sg.edu.rp.soi.c346p12quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spn1;
    ArrayList<String>alNumbers;
    ArrayAdapter<String>aaNubers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn1 = findViewById(R.id.spinner);

        alNumbers = new ArrayList<>();
        final String[] strNumbers = getResources().getStringArray(R.array.names);
        alNumbers.addAll(Arrays.asList(strNumbers));
        aaNubers = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,alNumbers);
        spn1.setAdapter(aaNubers);

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:

                        alNumbers.clear();

                        String[] categories = getResources().getStringArray(R.array.names);

                        alNumbers.addAll(Arrays.asList(categories));

                        spn1.setAdapter(aaNubers);

                        break;

                    case 1:

                        alNumbers.clear();

                        String[] subcategories = getResources().getStringArray(R.array.names);

                        alNumbers.addAll(Arrays.asList(subcategories));

                        spn1.setAdapter(aaNubers);

                        break;

                }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
