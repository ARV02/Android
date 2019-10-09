package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Libro2 extends AppCompatActivity {
    TextView descripcio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro2);
        descripcio=(TextView)findViewById(R.id.textView9);
        Libro2();
    }
    private void Libro2(){
        Bundle extras=getIntent().getExtras();
        String info=extras.getString("Libro2");
        descripcio.setText(info);
    }
}
