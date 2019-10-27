package  id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY ="name";
    public static final String AGE_KEY="age";
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmit(View view) {
//        Intent intent= new Intent(this,ProfileBundleActivity.class);
//        String username =usernameInput.getText().toString();
//        String name = nameInput.getText().toString();
//        int age = Integer.parseInt(ageInput.getText().toString());
//
//        usernameText.setText(username);
//        nameText.setText(name);
//        ageText.setText(age);
//        startActivity(intent);
        Bundle bundle = new Bundle();
        bundle.putString("username", usernameInput.getText().toString());
        bundle.putString("name", nameInput.getText().toString());
        bundle.putString("age", ageInput.getText().toString());
        Intent intent = new Intent(this, ProfileBundleActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
