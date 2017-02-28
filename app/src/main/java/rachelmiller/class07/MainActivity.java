package rachelmiller.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // private TextView displayText; // found the display text - whatever the TextView is you should automatically

    // find it, name it and declare it here and initialize in onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // displayText = (TextView) findViewById(R.id.display_text); // initialized the more text
// ends up not being used so deleted
    }

    public void launchActivity(View view) {
        // to pass info through the button create new intenet
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra(Keys.STRING, "Hello.........");
        intent.putExtra(Keys.NUM, 100);

        startActivity(intent);
    }
}
