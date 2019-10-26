package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    public EditText inputName;
    public TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        inputName = findViewById(R.id.input_name);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        String name = inputName.getText().toString();
        outputText.setText("Hi " +name);
    }

}
