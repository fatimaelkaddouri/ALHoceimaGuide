package net.example.alhoceimaguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
 EditText mTextEmail;
 EditText mTextPassword;
 Button  mButtonLogin;
 Button  mSignUp;
 TextView mRegester;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mTextEmail = (EditText)findViewById(R.id.emai);
        mTextPassword = (EditText)findViewById(R.id.pass);
        mButtonLogin = (Button) findViewById(R.id.log);
        mSignUp = (Button) findViewById(R.id.sign);
    }
}
