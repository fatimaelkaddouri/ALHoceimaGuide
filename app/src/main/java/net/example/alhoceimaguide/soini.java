package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class soini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soini);

        getSupportActionBar().setTitle("SOINI");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
