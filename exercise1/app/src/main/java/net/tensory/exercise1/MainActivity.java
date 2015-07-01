package net.tensory.exercise1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {
    EditText etTextEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTextEntry = (EditText) findViewById(R.id.editText);
    }

    public void processWord(View view) {
        WordAnalyzer wordAnalyzer = new WordAnalyzer(etTextEntry.getText().toString());

        String result = "The repeated character is: " + wordAnalyzer.firstRepeatedCharacter();
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
    }
}
