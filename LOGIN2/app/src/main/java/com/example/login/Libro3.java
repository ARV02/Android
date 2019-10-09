package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Libro3 extends AppCompatActivity {
    TextView descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libro3);
        descripcion=(TextView)findViewById(R.id.textView10);
        descripcion.setMovementMethod(new ScrollingMovementMethod());
        Libro3();
    }
    private void Libro3(){
        Bundle extras=getIntent().getExtras();
        String info=extras.getString("Libro3");
        descripcion.setText(info);
    }
}
