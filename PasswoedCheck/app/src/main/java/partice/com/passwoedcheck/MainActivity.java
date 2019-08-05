package partice.com.passwoedcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pass_word;
    private Button button_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }


    //action button litener almost
    public void addListnerOnButton() {

        pass_word = (EditText) findViewById(R.id.editText);
        button_sub = (Button) findViewById(R.id.button);

        button_sub.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Toast.makeText(

                                MainActivity.this, pass_word.getText(), Toast.LENGTH_LONG
                        ).show();
                    }
                }


        );


    }
}
