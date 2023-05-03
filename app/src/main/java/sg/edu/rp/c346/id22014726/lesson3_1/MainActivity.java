package sg.edu.rp.c346.id22014726.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView textViewDisplay;
    EditText editTextViewDisplay;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDisplay = findViewById(R.id.buttonDisplay);
        textViewDisplay = findViewById(R.id.textViewDisplay);
        editTextViewDisplay = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = editTextViewDisplay.getText().toString();
                textViewDisplay.setText(value);
            }

        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbtn.isChecked()) {
                    editTextViewDisplay.setEnabled(true);
                } else {
                    editTextViewDisplay.setEnabled(false);
                }
            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = editTextViewDisplay.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale) {
                    stringResponse = "He says " + editTextViewDisplay.getText().toString();
                } else {
                    stringResponse = "She says " + editTextViewDisplay.getText().toString();
                }
                textViewDisplay.setText(stringResponse);
            }
        });

    }
}