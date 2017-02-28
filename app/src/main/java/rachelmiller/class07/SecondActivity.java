package rachelmiller.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText = (TextView) findViewById(R.id.display_text);
        //whenever you see a red underline, highlight it and select option enter
        Intent intent = getIntent();

        String message = intent.getStringExtra(Keys.STRING);
        int num = intent.getIntExtra(Keys.NUM, 0);

        displayText.setText(message + " " + num); //to display the string and the num
        // We are in the seicnd acvitiy,
    }
}
