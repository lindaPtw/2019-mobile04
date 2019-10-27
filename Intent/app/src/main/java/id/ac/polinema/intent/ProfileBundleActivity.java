package id.ac.polinema.intent;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY ="name";
    public static final String AGE_KEY="age";
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here



        if (getIntent().getExtras() != null) {
            // TODO: display value here
            Bundle extras = getIntent().getExtras();
//            String username = extras.getString(USERNAME_KEY);
////            String name = extras.getString(NAME_KEY);
////            int age = extras.getInt(AGE_KEY);
////
////            usernameText.setText(username);
////            nameText.setText(name);
////            ageText.setText(age);
            usernameText.setText(extras.getString("username"));
            nameText.setText(extras.getString("name"));
            ageText.setText(extras.getString("age"));
        }
    }
}
