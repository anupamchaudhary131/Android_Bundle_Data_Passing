package com.example.androidintentdatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name, occupation;
    Button btnviewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText)findViewById(R.id.edtName);
        occupation = (EditText)findViewById(R.id.occupName);
        btnviewData = (Button)findViewById(R.id.button);

        btnviewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent passData = new Intent(MainActivity.this, ViewDataActivity.class);
                passData.putExtra("name", name.getText().toString());
                passData.putExtra("occupation", occupation.getText().toString());
                startActivity(passData);
            }
        });
    }
}