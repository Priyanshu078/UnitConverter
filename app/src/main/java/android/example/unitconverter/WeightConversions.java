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

public class WeightConversions extends AppCompatActivity {
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
        setContentView(R.layout.weight);
        setTitle("Weight Conversions");

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
                        Toast.makeText(WeightConversions.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    } else {
                        if (selectedRadioButton.getText().toString().equals("Kilograms to Grams")) {
                            ConvertedNumber = numberEntered * 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Grams to Kilograms")) {
                            ConvertedNumber = numberEntered / 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Grams to Miligrams")) {
                            ConvertedNumber = numberEntered * 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Miligrams to Grams")) {
                            ConvertedNumber = numberEntered / 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Kilograms to Pounds")) {
                            ConvertedNumber = numberEntered * 2.20462f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Pounds to Kilograms")) {
                            ConvertedNumber = numberEntered / 2.20462f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else {

                        }
                    }
                }catch (Exception e){
                    Toast.makeText(WeightConversions.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
