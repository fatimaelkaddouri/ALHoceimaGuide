package net.example.alhoceimaguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity   {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Button button;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private Button but1;
    private  Button but2;
    private  Button but3;
    private  Button but4;
    private  Button but5;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


            //Menu
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle =new ActionBarDrawerToggle(this, mDrawerLayout, R.string.Open,R.string.Close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


           //textButton1
        button=(Button)findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlages();
            }
        });
           //img button1
        image1=(ImageView) findViewById(R.id.img1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlages();
            }
        });


           //textbutton2
     but1=(Button) findViewById(R.id.tex2);
     but1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             openDestinationTouristique();
         }
     });
        //imgebutton2
        image2=(ImageView) findViewById(R.id.img2);
       image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDestinationTouristique();
            }
        });


       //textbutton3
        but2=(Button) findViewById(R.id.tex3);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrest();
            }
        });
        //imgbutton3
        image3=(ImageView) findViewById(R.id.img3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrest();
            }
        });


        //textbutton4
        but3=(Button) findViewById(R.id.tex4);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhotelt();
            }
        });
        //imgbutton4
        image4=(ImageView) findViewById(R.id.img4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhotelt();
            }
        });


        //textbutton5
        but4=(Button) findViewById(R.id.tex5);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengps();
            }
        });
        //imgbutton5
        image5=(ImageView) findViewById(R.id.img5);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengps();
            }
        });

        //textbutton6
        but5=(Button) findViewById(R.id.tex6);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentransport();
            }
        });
        //imgbutton6
        image6=(ImageView) findViewById(R.id.img6);
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentransport();
            }
        });


    }



     @Override
         public boolean onOptionsItemSelected(MenuItem item) {
                if (mToggle.onOptionsItemSelected(item)){
                    return true;
        }
              return super.onOptionsItemSelected(item);

    }



    //text1
    public void openPlages(){
        Intent intent=new Intent(this,Plages.class);
        startActivity(intent);
    }

    public void openDestinationTouristique(){
        Intent intent=new Intent(this,activite.class);
        startActivity(intent);
    }

    public void openrest(){
        Intent intent=new Intent(this,Restaurant.class);
        startActivity(intent);
    }

    public void openhotelt(){
        Intent intent=new Intent(this,Hotel.class);
        startActivity(intent);
    }

    public void opengps(){
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void opentransport(){
        Intent intent=new Intent(this,transport.class);
        startActivity(intent);
    }
}



