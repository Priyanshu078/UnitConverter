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

import java.sql.Time;

public class TimeConversions extends AppCompatActivity {
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
        setContentView(R.layout.time);
        setTitle("Time Conversions");

        textArea = (EditText) findViewById(R.id.textArea);
        answer = (TextView) findViewById(R.id.Answer);
        convert = (Button) findViewById(R.id.Convert);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberEntered = Float.parseFloat(textArea.getText().toString());
                int getSelectedId = radioGroup.getCheckedRadioButtonId();
                selectedRadioButton = (RadioButton) findViewById(getSelectedId);

                try {
                    if(getSelectedId < 0) {
                        Toast.makeText(TimeConversions.this, "Nothing Selected",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if(selectedRadioButton.getText().toString().equals("Minutes to Hours")) {
                            ConvertedNumber = numberEntered / 60;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Hours to Minutes")) {
                            ConvertedNumber = numberEntered * 60;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Minutes to Seconds")) {
                            ConvertedNumber = numberEntered * 60;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Seconds to Minutes")) {
                            ConvertedNumber = numberEntered / 60;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Hours to Seconds")) {
                            ConvertedNumber = numberEntered * 3600;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else if(selectedRadioButton.getText().toString().equals("Seconds to Hours")) {
                            ConvertedNumber = numberEntered / 3600;
                            answer.setText("Answer: "+ConvertedNumber);
                        }
                        else {
                        }
                    }
                }catch (Exception e) {
                    Toast.makeText(TimeConversions.this,"Enter the input",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
