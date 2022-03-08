package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btnTrue, btnFalse;
    boolean isValid;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();

    }

    public void main(){


        textView = (TextView) findViewById(R.id.textView);
        btnTrue = (Button) findViewById(R.id.btn_true);
        btnFalse = (Button) findViewById(R.id.btn_false);

        String text[] = {"FCB is the best team in Spain ? ", "1+1 = 3?","is Paris the capital of France?", "YOU HAVE FINISH WELL DONE"};
        Boolean value[] = {true, false,true};

        if(i==text.length-1){
            btnFalse.setVisibility(View.INVISIBLE);
            btnTrue.setVisibility(View.INVISIBLE);
        }
        isValid = true;

        textView.setText(text[i]);

        btnTrue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (value[i] == isValid) {
                    Toast txt = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                    txt.show();
                    i++;
                    main();
                } else {
                    Toast txt = Toast.makeText(getApplicationContext(), "Incorrect, tryagain", Toast.LENGTH_SHORT);
                    txt.show();
                }
            }
        });

        btnFalse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (value[i] == !isValid) {
                    Toast txt = Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                    txt.show();
                    i++;
                    main();
                } else {
                    Toast txt = Toast.makeText(getApplicationContext(), "Incorrect, tryagaintryagain", Toast.LENGTH_SHORT);
                    txt.show();
                }
            }
        });

    }
}