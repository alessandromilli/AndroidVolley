package com.example.androidvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                EditText userName = (EditText) findViewById(R.id.editTextTextEmailAddress);
                EditText passwd = (EditText) findViewById(R.id.editTextTextPassword);

                if( TextUtils.isEmpty(userName.getText()) || TextUtils.isEmpty(passwd.getText())){
                    Toast.makeText(getApplicationContext(), "Entrambi i campi sono richiesti", Toast.LENGTH_LONG).show();


                }else{
                    // dovrei fare l'autenticazione, ma passo semplicemente le credenziali all'activity successiva
                    Intent i = new Intent(getApplicationContext(), SecondaActivity.class);
                    i.putExtra("username", userName.getText());
                    i.putExtra("password", passwd.getText());
                    startActivity(i);
                }
            }
        });
    }
}