package tcd.com;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        final String[] dropdown_items = getResources().getStringArray(R.array.dropdownItems);
        ArrayList<String> items = new ArrayList<String>(Arrays.asList(dropdown_items));

        ArrayAdapter<String> mySpinnerAdapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                items

        );

        Spinner mySpinner = findViewById(R.id.mySpinner);
        mySpinner.setAdapter(mySpinnerAdapter);

        // click listener
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> Spinner, View view, int i, long id) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerActivity.this);
                builder.setMessage(dropdown_items[i]).setTitle("Item Selected");
                AlertDialog dialog = builder.create();
                dialog.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
