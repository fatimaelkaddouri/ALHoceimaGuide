package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class badis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badis);

        getSupportActionBar().setTitle("BADIS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
