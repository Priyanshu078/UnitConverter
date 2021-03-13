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

public class SpeedConversions extends AppCompatActivity {
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
        setContentView(R.layout.speed);
        setTitle("Speed Conversions");

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
                    if (getSelectedId < 0) {
                        Toast.makeText(SpeedConversions.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
                    } else {
                        if (selectedRadioButton.getText().toString().equals("Kilometres per hour to Metres per second")) {
                            ConvertedNumber = numberEntered * 5 / 18;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else if (selectedRadioButton.getText().toString().equals("Metres per second to Kilometres per hour")) {
                            ConvertedNumber = numberEntered * 18 / 5;
                            answer.setText("Answer: " + ConvertedNumber);
                        } else {

                        }
                    }
                }catch(Exception e){
                    Toast.makeText(SpeedConversions.this,"Enter the Input",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
