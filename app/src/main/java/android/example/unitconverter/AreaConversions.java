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

public class AreaConversions extends AppCompatActivity {
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
        setContentView(R.layout.area);
        setTitle("Area Conversions");

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
                        Toast.makeText(AreaConversions.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    } else {
                        if (selectedRadioButton.getText().toString().equals("Acres to Square Feet")) {
                            ConvertedNumber = numberEntered * 43560;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Square Feet and Acres")) {
                            ConvertedNumber = numberEntered / 43560;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Hectare to Acre")) {
                            ConvertedNumber = numberEntered * 2.47105f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Acre to Hectare")) {
                            ConvertedNumber = numberEntered / 2.47105f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Hectares to Square Feet")) {
                            ConvertedNumber = numberEntered * 107639;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Square Feet to Hectares")) {
                            ConvertedNumber = numberEntered / 107639;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Square Feet to Square Metres")) {
                            ConvertedNumber = numberEntered * 0.092903f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Square Metres to Square Feet")) {
                            ConvertedNumber = numberEntered / 0.092903f;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else {

                        }
                    }
                }catch (Exception e){
                    Toast.makeText(AreaConversions.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
