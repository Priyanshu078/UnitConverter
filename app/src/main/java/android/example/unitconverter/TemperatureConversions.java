package android.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TemperatureConversions extends AppCompatActivity {
    float numberEntered;
    float ConvertedNumber;
    Button convert;
    EditText textArea;
    TextView answer;
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
        setTitle("Temperature Conversions");

        textArea = (EditText) findViewById(R.id.textArea);
        answer = (TextView) findViewById(R.id.Answer);
        convert = (Button) findViewById(R.id.Convert);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntered = Float.parseFloat(textArea.getText().toString());
                int selectedButtonId = radioGroup.getCheckedRadioButtonId();
                selectedRadioButton = (RadioButton) findViewById(selectedButtonId);

                try {
                    if (selectedButtonId < 0) {
                        Toast.makeText(TemperatureConversions.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    } else {
                        if (selectedRadioButton.getText().toString().equals("Celsius to Fahrenheit")) {
                            ConvertedNumber = (numberEntered * 9 / 5) + 32;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Fahrenheit to Celsius")) {
                            ConvertedNumber = (numberEntered - 32) * 5 / 9;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Celsius to Kelvin")) {
                            ConvertedNumber = numberEntered + 273.15f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Kelvin to Celsius")) {
                            ConvertedNumber = numberEntered - 273.15f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Fahrenheit to Kelvin")) {
                            ConvertedNumber = (numberEntered - 32) * 5 / 9 + 273.15f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Kelvin to Fahrenheit")) {
                            ConvertedNumber = (numberEntered - 273.15f) * 9 / 5 + 32;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else {

                        }
                    }
                }catch (Exception e){
                    Toast.makeText(TemperatureConversions.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
