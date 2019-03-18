package tcd.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView text = findViewById(R.id.s_text);
        Bundle extras = getIntent().getExtras();
        text.setText(extras.getString(MainActivity.USERNAME_KEY));
    }
}
