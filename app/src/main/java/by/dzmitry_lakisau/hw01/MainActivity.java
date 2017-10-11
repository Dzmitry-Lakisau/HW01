package by.dzmitry_lakisau.hw01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String HELLO_WORLD = "Hello world!";
=======
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String HELLO_WORLD = "Hello World!";//this import is gonna be trashed when merging;
>>>>>>> feature_2

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        Toast toast = Toast.makeText(getApplicationContext(), HELLO_WORLD, Toast.LENGTH_SHORT);
        toast.show();
=======
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(HELLO_WORLD);
>>>>>>> feature_2
    }
}
