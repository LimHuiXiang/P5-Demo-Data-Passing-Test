package sg.edu.rp.c346.id20006757.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer2 = findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a' );

        tvAnswer2.setText("Character  value received is: " + value);
    }
}