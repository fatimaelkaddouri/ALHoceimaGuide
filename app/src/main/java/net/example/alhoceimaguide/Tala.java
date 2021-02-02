package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tala);

        getSupportActionBar().setTitle("TALA-YOUSSEF");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
