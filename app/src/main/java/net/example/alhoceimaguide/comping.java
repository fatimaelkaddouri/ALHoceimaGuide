package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class comping extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comping);
        getSupportActionBar().setTitle("CAMPING");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
