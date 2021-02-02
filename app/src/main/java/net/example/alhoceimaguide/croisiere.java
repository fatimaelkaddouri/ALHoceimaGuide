package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class croisiere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_croisiere);
        getSupportActionBar().setTitle("CROISIERE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
