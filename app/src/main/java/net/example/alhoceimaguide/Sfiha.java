package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sfiha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sfiha);
        getSupportActionBar().setTitle("Sfiha");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
