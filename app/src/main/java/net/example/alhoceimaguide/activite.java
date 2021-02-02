package net.example.alhoceimaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class activite extends AppCompatActivity {
    private ImageView img;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;


    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView tex4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite);
        getSupportActionBar().setTitle("Endroit et activité");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //image1
        img = (ImageView) findViewById(R.id.image1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensport();
            }
        });
        //text1
        text1 = (TextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensport();
            }
        });


        //image2
        img1 = (ImageView) findViewById(R.id.image2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencroi();
            }
        });
        //text2
        text2 = (TextView) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencroi();
            }
        });


        //image3
        img3 = (ImageView) findViewById(R.id.image4);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencamping();
            }
        });
        //text3
        text3 = (TextView) findViewById(R.id.text4);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencamping();
            }
        });


        //image4
        img2 = (ImageView) findViewById(R.id.image5);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensouk();
            }
        });
        //text4
        text4 = (TextView) findViewById(R.id.text5);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensouk();
            }
        });


        //image5
        img4 = (ImageView) findViewById(R.id.image3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparc();
            }
        });
        //text5
        tex4 = (TextView) findViewById(R.id.text3);
        tex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openparc();
            }
        });


    }

    public void opensport() {
        Intent intent = new Intent(this, sport.class);
        startActivity(intent);
    }

    public void openparc() {
        Intent intent = new Intent(this, parcnational.class);
        startActivity(intent);

    }

    public void opensouk() {
        Intent intent = new Intent(this, shopping.class);
        startActivity(intent);

    }

    public void opencroi() {
        Intent intent = new Intent(this, croisiere.class);
        startActivity(intent);

    }

    public void opencamping() {
        Intent intent = new Intent(this, comping.class);
        startActivity(intent);

    }
}