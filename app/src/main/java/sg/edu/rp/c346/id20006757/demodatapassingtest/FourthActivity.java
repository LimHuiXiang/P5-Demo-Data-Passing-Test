package sg.edu.rp.c346.id20006757.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAnswer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Step 2
        tvAnswer3 = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", 0);
        tvAnswer3.setText("Character  value received is: " + value);
    }
}