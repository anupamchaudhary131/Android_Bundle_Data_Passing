package com.example.androidintentdatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewDataActivity extends AppCompatActivity {

    TextView name, occupation;
    String nameData, occupationData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);

        name = (TextView)findViewById(R.id.txtName);
        occupation = (TextView)findViewById(R.id.txtOccupName);

        nameData = getIntent().getStringExtra("name");
        occupationData = getIntent().getStringExtra("occupation");

        name.setText(nameData);
        occupation.setText(occupationData);

    }
}