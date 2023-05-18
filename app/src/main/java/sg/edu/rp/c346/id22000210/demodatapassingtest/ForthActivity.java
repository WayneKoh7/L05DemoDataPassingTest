package sg.edu.rp.c346.id22000210.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ForthActivity extends AppCompatActivity {

    //Declaring Variable
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);

        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 99.99);
        tvAnswer.setText("Integer value received is: " + value);
    }
}