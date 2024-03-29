package com.example.menuandspinnerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class PickerViewExample extends AppCompatActivity {
    private Spinner spCountries;
    ArrayList<String>countryList;
    private String[] countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_view_example);
        spCountries = findViewById(R.id.spCountry);
        countryList = new ArrayList<>();

        //countryList = (ArrayList<String>)Arrays.asList(getResources().getStringArray(R.array.array_country));
        countries = getResources().getStringArray(R.array.array_country);

        ArrayAdapter<String>mArrayAdaptor = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, countries);

        spCountries.setAdapter(mArrayAdaptor);
//        spCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(PickerViewExample.this, countries[i], Toast.LENGTH_SHORT).show();
//            }
//        });


        spCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PickerViewExample.this, countries[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
  }
}
