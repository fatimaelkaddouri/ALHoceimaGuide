package net.example.alhoceimaguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Plages extends AppCompatActivity {

     private ImageView img, img1,img2,img3,img4,img5,img6;

    private TextView text1,text2,text3, text4, tex4, tex5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plages);

       getSupportActionBar().setTitle("Plage");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


                 //image1
        img=(ImageView) findViewById(R.id.image1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuemado();
            }
        });
                //text1
        text1=(TextView) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuemado();
            }
        });


             //image2
        img1=(ImageView) findViewById(R.id.image2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openclab();
            }
        });
              //text2
        text2=(TextView) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openclab();
            }
        });


          //image3
        img3=(ImageView) findViewById(R.id.image4);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentala();
            }
        });
           //text3
        text3=(TextView) findViewById(R.id.text4);
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentala();
            }
        });


            //image4
        img2=(ImageView) findViewById(R.id.image5);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmadero();
            }
        });
               //text4
        text4=(TextView) findViewById(R.id.text5);
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmadero();
            }
        });



        //image5
        img4=(ImageView) findViewById(R.id.image3);
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensfiha();
            }
        });
        //text5
        tex4=(TextView) findViewById(R.id.text3);
        tex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensfiha();
            }
        });


        //image6
        img5=(ImageView) findViewById(R.id.image6);
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensoini();
            }
        });
        //text6
        tex4=(TextView) findViewById(R.id.text6);
        tex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensoini();
            }
        });


        //image7
        img6=(ImageView) findViewById(R.id.image7);
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbadis();
            }
        });
        //text7
        tex5=(TextView) findViewById(R.id.text7);
        tex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbadis();
            }
        });

    }


    public void openQuemado(){
        Intent intent=new Intent(this,Quemado.class);
        startActivity(intent);
    }
        public void openclab(){
            Intent intent=new Intent(this,Calabonita.class);
            startActivity(intent);

    }

    public void opensfiha(){
        Intent intent=new Intent(this,Sfiha.class);
        startActivity(intent);

    }

    public void opentala(){
        Intent intent=new Intent(this,Tala.class);
        startActivity(intent);

    }

    public void openmadero(){
        Intent intent=new Intent(this,Madero.class);
        startActivity(intent);

    } public void opensoini(){
        Intent intent=new Intent(this,soini.class);
        startActivity(intent);

    }

  public void openbadis(){
    Intent intent=new Intent(this,badis.class);
    startActivity(intent);

}


}
