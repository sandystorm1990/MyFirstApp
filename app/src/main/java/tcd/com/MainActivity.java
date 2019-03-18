package tcd.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String USERNAME_KEY = "USERNAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = (Button) findViewById(R.id.click_btn);
        //Log.d("MyTag", "test log");
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtName = findViewById(R.id.inputText);
                String enteredTxt = txtName.getText().toString();

                Intent i = new Intent(MainActivity.this, FirstActivity.class);
                i.putExtra(USERNAME_KEY, enteredTxt);
                startActivity(i);
            }
        });
    }
}
