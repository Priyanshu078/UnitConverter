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

public class LengthConversions extends AppCompatActivity {
    float numberEntered;
    float ConvertedNumber;
    EditText textArea;
    TextView answer;
    Button convert;
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);
        setTitle("Length Conversions");

        textArea = (EditText) findViewById(R.id.textArea);
        answer = (TextView) findViewById(R.id.Answer);
        convert = (Button) findViewById(R.id.Convert);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    numberEntered = Float.parseFloat(textArea.getText().toString());
//                answer.setText("Answer: " + numberEntered);
                    int getSelectedId = radioGroup.getCheckedRadioButtonId();

                    selectedRadioButton = (RadioButton) findViewById(getSelectedId);

                    if (getSelectedId < 0) {
                        Toast.makeText(LengthConversions.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    } else {
//                        Toast.makeText(LengthConversions.this, String.valueOf(getSelectedId), Toast.LENGTH_SHORT).show();
                        if(selectedRadioButton.getText().toString().equals("Metres to Centimetres")){
                            ConvertedNumber = numberEntered * 100;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Centimetres to Metres")){
                            ConvertedNumber = numberEntered / 100;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Kilometres to Metres")){
                            ConvertedNumber = numberEntered * 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Metres to Kilometres")){
                            ConvertedNumber = numberEntered / 1000;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Kilometres to Centimetres")){
                            ConvertedNumber = numberEntered * 100000;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Centimetres to Kilometres")){
                            ConvertedNumber = numberEntered / 100000;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Kilometres to Miles")){
                            ConvertedNumber = numberEntered * 0.621371f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Miles to Kilometres")){
                            ConvertedNumber = numberEntered * 1.60934f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }else if(selectedRadioButton.getText().toString().equals("Foot to Centimetres")){
                            ConvertedNumber = numberEntered * 30.48f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Centimetres to Foot")){
                            ConvertedNumber = numberEntered * 0.0328084f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Foot to Metres")){
                            ConvertedNumber = numberEntered * 0.3048f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Metres to Foot")){
                            ConvertedNumber = numberEntered * 3.28084f;
                            answer.setText("Answer: " + ConvertedNumber);
                        }
                        else {
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(LengthConversions.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
