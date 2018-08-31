package com.example.a59050083.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus;
    EditText Append1, Append2;
    TextView Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Append1 = findViewById(R.id.editText);
        Append2 = findViewById(R.id.editText2);
        plus = findViewById(R.id.plus);
        Value = findViewById(R.id.Values);

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String str1 = Append1.getText().toString();
                        String str2 = Append2.getText().toString();
                        if (Append1.getText().length() == 0) {
                            Append1.setError("Field cannot be left blank.");
                        } else if (Append2.getText().length() == 0) {
                            Append2.setError("Field cannot be left blank.");
                        } else {
                            int x1 = Integer.parseInt(str1);
                            int x2 = Integer.parseInt(str2);
                            x2 = x1 + x2;
                            Value.setText(String.valueOf(x2));
                        }
                    }
                }
        );

    }
}
