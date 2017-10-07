package by.dzmitry_lakisau.hw01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String HELLO_WORLD = "Hello world!";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(), HELLO_WORLD, Toast.LENGTH_SHORT);
        toast.show();

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(HELLO_WORLD);

        //line for empty commit
    }
}
